package com.elquineas.erp.service;

import java.util.List;

import com.elquineas.erp.model.BoardDto;
import com.elquineas.erp.model.DeptDto;
import com.elquineas.erp.model.PositionDto;
import com.elquineas.erp.model.UserDto;

public interface MainService {
	
	public List<BoardDto> boardList();
	public int updateBoard(UserDto uDto);
	public int insertBoard(UserDto uDto);
	
}
