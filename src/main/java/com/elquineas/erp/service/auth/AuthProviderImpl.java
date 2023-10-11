package com.elquineas.erp.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.elquineas.erp.dao.UserDao;
import com.elquineas.erp.model.UserDto;
import com.elquineas.erp.service.UserService;
import com.elquineas.erp.service.impl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("authProviderImpl")
public class AuthProviderImpl implements AuthenticationProvider{
	private final UserDao uDao;
	public AuthProviderImpl(UserDao uDao) {
		super();
		this.uDao = uDao;
	}
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UserDto uDto = new UserDto();
		// authentication 으로 login 할때 입력한 데이터를 호출한다
		String username = (String)authentication.getPrincipal(); // ID 추출
		String password = (String)authentication.getCredentials(); // PW 추출
//		log.debug("사용자 정보 : "+authentication.toString());
//		log.debug("사용자 이름 : "+username);
//		log.debug("사용자 비번 : "+password);
		uDto.setU_id(username);
		uDto.setU_password(password);
		log.debug("사용자 정보 : "+uDto.toString());
		
		int idCheck = uDao.idCheck(uDto);	
		uDto = uDao.loginUser(uDto);		
		log.debug("아이디 체크 : "+idCheck);
		log.debug("로그인 정보 : "+uDto);
		if(idCheck < 1) {
			throw new UsernameNotFoundException(username + "(이)란 아이디는 없습니다.");
		}else if(!username.equalsIgnoreCase(uDto.getU_id())) {
			throw new UsernameNotFoundException(username + "(이)란 아이디는 없습니다.");
		}
		
		if(!password.equalsIgnoreCase(uDto.getU_password())) {
			throw new UsernameNotFoundException("비밀번호가 다릅니다.");
		}
		
		List<GrantedAuthority> grantList = new ArrayList<>();
		
		grantList.add(new SimpleGrantedAuthority(uDto.getU_role()));
		
//		if(username.equalsIgnoreCase("admin")) {
//			grantList.add(new SimpleGrantedAuthority("ROLE_USER"));
//			grantList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//		}else if(username.equalsIgnoreCase("user")) {
//			grantList.add(new SimpleGrantedAuthority("ROLE_USER"));
//			
//		}
		
		log.debug("사용자 정보 : "+grantList.toString());
		
//		grantList.add(new SimpleGrantedAuthority("ROLE_USER"));
//		grantList.add(new SimpleGrantedAuthority("GUEST"));
		
		return new UsernamePasswordAuthenticationToken(username, password, grantList);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
