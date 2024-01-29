package com.github.wyleedp.springboot.samples.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.wyleedp.springboot.samples.board.model.BoardModel;

@Mapper
public interface BoardMapper {

	List<BoardModel> selectBoardPaginationList();
	
}
