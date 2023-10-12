package com.elquineas.erp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elquineas.erp.model.DeptDto;
import com.elquineas.erp.model.PositionDto;
import com.elquineas.erp.model.UserDto;
import com.elquineas.erp.service.UserService;
import com.elquineas.erp.service.impl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	private final UserService uService;
	public MainController(UserService uService){
		this.uService = uService;
	}
	
	
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
		List<UserDto> uList = uService.userList();
		List<DeptDto> dList = uService.deptList();
		List<PositionDto> pList = uService.positionList();
		int newSeq = uService.getSeq();
		model.addAttribute("SEQ", newSeq);
		model.addAttribute("USER_LIST", uList);
		model.addAttribute("DEPT_LIST", dList);
		model.addAttribute("POSITION_LIST", pList);
		return "main/userInfo";
	}
	@RequestMapping(value = "/userInfo", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("USER") UserDto uDto, Model model) {
		log.debug("저장 : {} ",uDto.toString());
		if(uDto.getU_dept() == "0000") {
			uDto.setU_role("ROLE_ADMIN");
		}else{
			uDto.setU_role("ROLE_USER");
		}
		uService.updateUser(uDto);
		
		List<UserDto> uList = uService.userList();
		List<DeptDto> dList = uService.deptList();
		List<PositionDto> pList = uService.positionList();
		int newSeq = uService.getSeq();
		model.addAttribute("SEQ", newSeq);
		model.addAttribute("USER_LIST", uList);
		model.addAttribute("DEPT_LIST", dList);
		model.addAttribute("POSITION_LIST", pList);
		return "main/userInfo";
	}
	@RequestMapping(value = "/userAddInfo", method = RequestMethod.POST)
	public String insertUser(@ModelAttribute("USER") UserDto uDto, Model model) {
		log.debug("저장 : {} ",uDto.toString());
		if(uDto.getU_dept() == "0000") {
			uDto.setU_role("ROLE_ADMIN");
		}else{
			uDto.setU_role("ROLE_USER");
		}
		uService.insertUser(uDto);
		
		List<UserDto> uList = uService.userList();
		List<DeptDto> dList = uService.deptList();
		List<PositionDto> pList = uService.positionList();
		int newSeq = uService.getSeq();
		model.addAttribute("SEQ", newSeq);
		model.addAttribute("USER_LIST", uList);
		model.addAttribute("DEPT_LIST", dList);
		model.addAttribute("POSITION_LIST", pList);
		return "main/userInfo";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Locale locale, Model model) {
		return "main/admin";
	}
	
	@ModelAttribute("USER")
	public UserDto uDto() {
		return UserDto.builder().build();
	}
	
}
