package com.github.wyleedp.springboot.samples.board.model;

import java.sql.Timestamp;

public class BoardModel {

	private Long boardId;
	private Integer boardMasterId;
	private Long parentBoardId;
	private Long groupBoardId;
	private Integer depthNo;
	private Integer orderNo;
	private String title;
	private String content;
	private Integer readCount;
	private Timestamp insertDt;
	private String insertUserId;
	private Timestamp updateDt;
	private String updateUserId;
	
	public Long getBoardId() {
		return boardId;
	}
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}
	public Integer getBoardMasterId() {
		return boardMasterId;
	}
	public void setBoardMasterId(Integer boardMasterId) {
		this.boardMasterId = boardMasterId;
	}
	public Long getParentBoardId() {
		return parentBoardId;
	}
	public void setParentBoardId(Long parentBoardId) {
		this.parentBoardId = parentBoardId;
	}
	public Long getGroupBoardId() {
		return groupBoardId;
	}
	public void setGroupBoardId(Long groupBoardId) {
		this.groupBoardId = groupBoardId;
	}
	public Integer getDepthNo() {
		return depthNo;
	}
	public void setDepthNo(Integer depthNo) {
		this.depthNo = depthNo;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public Timestamp getInsertDt() {
		return insertDt;
	}
	public void setInsertDt(Timestamp insertDt) {
		this.insertDt = insertDt;
	}
	public String getInsertUserId() {
		return insertUserId;
	}
	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}
	public Timestamp getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Timestamp updateDt) {
		this.updateDt = updateDt;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
}
