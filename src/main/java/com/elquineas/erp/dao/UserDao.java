package com.elquineas.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.elquineas.erp.model.UserDto;

public interface UserDao {
	
	@Select("SELECT COUNT(*) FROM tbl_user WHERE u_id = #{u_id} ")
	public int idCheck(UserDto uDto);
	
	public UserDto loginUser(UserDto uDto);
	
	public List<UserDto> selectList();
	
	
	
	public int insertUser(UserDto uDto);

	public int updateUser(UserDto uDto);
}
