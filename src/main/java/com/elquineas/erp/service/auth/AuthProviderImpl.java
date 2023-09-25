package com.elquineas.erp.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("authProviderImpl")
public class AuthProviderImpl implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// authentication 으로 login 할때 입력한 데이터를 호출한다
		String username = (String)authentication.getPrincipal(); // ID 추출
		String password = (String)authentication.getCredentials(); // PW 추출

		log.debug("사용자 정보 : "+authentication.toString());
		log.debug("사용자 이름 : "+username);
		log.debug("사용자 비번 : "+password);
		
		if(!username.equalsIgnoreCase("elquineas")) {
			throw new UsernameNotFoundException(username + "이 없음");
		}
		if(!password.equalsIgnoreCase("1234")) {
			throw new UsernameNotFoundException("비밀번호 오류!");
		}
		
		List<GrantedAuthority> grantList = new ArrayList<>();
		
		grantList.add(new SimpleGrantedAuthority("ROLE_USER"));
//		grantList.add(new SimpleGrantedAuthority("GUEST"));
		grantList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		return new UsernamePasswordAuthenticationToken(username, password, grantList);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
