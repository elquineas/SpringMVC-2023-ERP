package com.elquineas.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.elquineas.erp.model.BoardDto;

public interface BoardDao {
	
	@Select("SELECT * FROM tbl_board WHERE b_type = 'board' ")
	public List<BoardDto> selectList();
}
