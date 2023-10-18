package com.elquineas.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.elquineas.erp.model.BoardDto;

public interface BoardDao {
	
	public List<BoardDto> selectList();

	public BoardDto boardDetail(String b_seq);

	public void boardAddSeq(String seq);
}
