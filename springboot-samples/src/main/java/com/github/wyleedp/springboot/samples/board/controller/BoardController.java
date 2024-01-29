package com.github.wyleedp.springboot.samples.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.wyleedp.springboot.samples.board.model.BoardModel;
import com.github.wyleedp.springboot.samples.board.model.BoardSearchModel;
import com.github.wyleedp.springboot.samples.board.service.BoardService;

@RestController
public class BoardController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/api/board")
	public Map<String, Object> board(){
	
		logger.info("/api/board 호출");
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		
		BoardSearchModel searchModel = new BoardSearchModel();
		List<BoardModel> list = boardService.getBoardPaginationList(searchModel);
		
		resMap.put("data", list);
		
		return resMap;
	}
	
}
