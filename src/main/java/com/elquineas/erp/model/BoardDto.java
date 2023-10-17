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
public class BoardDto {
	private long b_seq;//		bigint		PRIMARY KEY auto_increment,
	private String b_username;//	varchar(125),
	private String b_nickname;//	varchar(125),
    private String b_type;//		varchar(10),
	private String b_title;//		varchar(125),
	private String b_content;//	text,
	private String b_date;//		varchar(20)	,
	private int b_count;//		int
}
