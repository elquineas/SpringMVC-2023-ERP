package com.elquineas.erp.controller;

import java.util.Locale;

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
		return "main/main";
	}
	
	@RequestMapping(value = "/bbs", method = RequestMethod.GET)
	public String bbs(Locale locale, Model model) {
		return "main/bbs";
	}
	
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public String notice(Locale locale, Model model) {
		return "main/notice";
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
