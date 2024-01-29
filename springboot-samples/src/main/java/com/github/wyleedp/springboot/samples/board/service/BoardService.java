package com.github.wyleedp.springboot.samples.board.service;

import java.util.List;

import com.github.wyleedp.springboot.samples.board.model.BoardModel;
import com.github.wyleedp.springboot.samples.board.model.BoardSearchModel;

public interface BoardService {

	public List<BoardModel> getBoardPaginationList(BoardSearchModel boardSearchModel);
	
}
