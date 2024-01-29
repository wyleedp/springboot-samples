package com.github.wyleedp.springboot.samples.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.wyleedp.springboot.samples.board.mapper.BoardMapper;
import com.github.wyleedp.springboot.samples.board.model.BoardModel;
import com.github.wyleedp.springboot.samples.board.model.BoardSearchModel;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardModel> getBoardPaginationList(BoardSearchModel boardSearchModel) {
		return boardMapper.selectBoardPaginationList();
	}

}
