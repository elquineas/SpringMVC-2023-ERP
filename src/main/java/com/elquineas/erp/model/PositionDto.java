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
public class PositionDto {
	private long   p_seq;//		bigint		PRIMARY KEY auto_increment,
	private String p_num;//		VARCHAR(4)		,
	private String p_name;//
}
