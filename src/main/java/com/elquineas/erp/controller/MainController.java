package com.elquineas.erp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	@RequestMapping(value={"/",""},  method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		return "main/mainPage";
	}
	
	@RequestMapping(value = "/bbs", method = RequestMethod.GET)
	public String bbs(Locale locale, Model model) {
		return "main/bbs";
	}
	
	@RequestMapping(value = "/bbs_input", method = RequestMethod.GET)
	public String bbs_input(Locale locale, Model model, Authentication authentication) {
		String username = (String)authentication.getPrincipal(); // ID 추출
		log.debug("사용자 이름 : "+username);
		model.addAttribute("USER_NAME", username);
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat writeTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		log.debug("작성 시간 : "+writeTime.format(date));
		model.addAttribute("WRITE_TIME", writeTime.format(date));
		
		return "main/bbs_input";
	}
	
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice(Locale locale, Model model) {
		return "main/notice";
	}
	
	@RequestMapping(value = "/group", method = RequestMethod.GET)
	public String group(Locale locale, Model model) {
		return "main/group";
	}
	
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public String userInfo(Locale locale, Model model) {
		return "main/userInfo";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Locale locale, Model model) {
		return "main/admin";
	}
	
}
