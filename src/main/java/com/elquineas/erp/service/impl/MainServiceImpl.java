package com.elquineas.erp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elquineas.erp.dao.BoardDao;
import com.elquineas.erp.model.BoardDto;
import com.elquineas.erp.model.UserDto;
import com.elquineas.erp.service.MainService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MainServiceImpl implements MainService {
	
	private final BoardDao bDao;
	public MainServiceImpl(BoardDao bDao) {
		super();
		this.bDao = bDao;
	}
	
	public List<BoardDto> boardList() {
		List<BoardDto> bList = bDao.selectList();
		return bList;
	}
	
	@Override
	public BoardDto boardDetail(String seq) {
		BoardDto bDto = bDao.boardDetail(seq);
		return bDto;
	}

	@Override
	public void boardAddSeq(String seq) {
		bDao.boardAddSeq(seq);
	}
	
	@Override
	public int updateBoard(UserDto uDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertBoard(UserDto uDto) {
		// TODO Auto-generated method stub
		return 0;
	}



}
