package com.elquineas.erp.service;

import java.util.List;

import com.elquineas.erp.model.UserDto;

public interface UserService {

	public int idCheck(UserDto uDto);
	public UserDto loginCheck(UserDto uDto);
	public List<UserDto> userList();
	
}
