package com.github.wyleedp.springboot.samples.board.model;

public class BoardSearchModel {

	/** 현재 페이지 번호 */
	private Integer pageNo = 1;
	
	/** 페이지당 게시글 목록수 */
	private Integer pageListSize = 10;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageListSize() {
		return pageListSize;
	}

	public void setPageListSize(Integer pageListSize) {
		this.pageListSize = pageListSize;
	}
	
}
