package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
// @Data 롬복 어노테이션 -> getter,setter,to string 자동변환
public class BoardVO {
	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	
}
