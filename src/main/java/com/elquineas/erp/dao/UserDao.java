package com.elquineas.erp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.elquineas.erp.model.DeptDto;
import com.elquineas.erp.model.PositionDto;
import com.elquineas.erp.model.UserDto;

public interface UserDao {
	
	@Select("SELECT COUNT(*) FROM tbl_user WHERE u_id = #{u_id} ")
	public int idCheck(UserDto uDto);
	
	public UserDto loginUser(UserDto uDto);
	
	public List<UserDto> selectList();
	@Select("SELECT * FROM tbl_dept WHERE d_num < 9999 ")
	public List<DeptDto> selectDeptList();
	@Select("SELECT * FROM tbl_position WHERE p_num < 9999 ")
	public List<PositionDto> selectPositionList();

	@Select("SELECT MAX(u_seq)+1 FROM tbl_user ")
	public int getSeq();
	
	public int updateUser(UserDto uDto);
	public int insertUser(UserDto uDto);


}
