package com.elquineas.erp.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale, Model model) {
		return "user/join";
	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login(Locale locale, Model model) {
//		return "user/login";
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model) {
		return "user/login";
	}
	
}
