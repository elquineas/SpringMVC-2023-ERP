package com.elquineas.erp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
	private long   u_seq;//		bigint		PRIMARY KEY auto_increment,
	private String u_id;//		VARCHAR(20)	NOT NULL	,
	private String u_password;//	VARCHAR(20)	NOT NULL	,
    private String u_name;//      VARCHAR(20)	NOT NULL	,
	private String u_dept;//		VARCHAR(4)		,
	private String u_position;//	VARCHAR(4)		,
	private String d_name;//		u_dept name		,
	private String p_name;//		u_position name	,
	private String u_role;//		VARCHAR(10)	NOT NULL	
}
