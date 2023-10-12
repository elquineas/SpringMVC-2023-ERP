package com.elquineas.erp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elquineas.erp.dao.UserDao;
import com.elquineas.erp.model.DeptDto;
import com.elquineas.erp.model.PositionDto;
import com.elquineas.erp.model.UserDto;
import com.elquineas.erp.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	private final UserDao uDao;
	public UserServiceImpl(UserDao uDao) {
		super();
		this.uDao = uDao;
	}
		
	@Override
	public int idCheck(UserDto uDto) {
		int idCheck = uDao.idCheck(uDto);
		log.debug("아이디 체크 : "+idCheck);
		return idCheck;
	}

	@Override
	public UserDto loginCheck(UserDto uDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> userList() {
		List<UserDto> uList = uDao.selectList();	
		return uList;
	}

	@Override
	public List<DeptDto> deptList() {
		List<DeptDto> dList = uDao.selectDeptList();	
		return dList;
	}

	@Override
	public List<PositionDto> positionList() {
		List<PositionDto> pList = uDao.selectPositionList();	
		return pList;
	}

	@Override
	public int updateUser(UserDto uDto) {
		return uDao.updateUser(uDto);
	}

	@Override
	public int getSeq() {
		return uDao.getSeq();
	}

	@Override
	public int insertUser(UserDto uDto) {
		return uDao.insertUser(uDto);
	}

}
