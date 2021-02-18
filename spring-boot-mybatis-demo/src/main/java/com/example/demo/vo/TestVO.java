package com.example.demo.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("testVO")
public class TestVO {
	private String id;
	private String name;
	private String hpNo;
	private String regDt;
	private String regUserId;
}
