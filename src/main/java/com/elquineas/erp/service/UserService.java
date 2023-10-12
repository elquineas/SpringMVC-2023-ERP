package com.elquineas.erp.service;

import java.util.List;

import com.elquineas.erp.model.DeptDto;
import com.elquineas.erp.model.PositionDto;
import com.elquineas.erp.model.UserDto;

public interface UserService {

	public int idCheck(UserDto uDto);
	public UserDto loginCheck(UserDto uDto);
	public List<UserDto> userList();
	public List<DeptDto> deptList();
	public List<PositionDto> positionList();
	public int updateUser(UserDto uDto);
	public int getSeq();
	public int insertUser(UserDto uDto);
	
}
