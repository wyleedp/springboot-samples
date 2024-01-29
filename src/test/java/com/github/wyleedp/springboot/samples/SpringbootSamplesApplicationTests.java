package com.github.wyleedp.springboot.samples;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.wyleedp.springboot.samples.board.service.BoardService;

@SpringBootTest
class SpringbootSamplesApplicationTests {

	@Autowired
	BoardService boardService;
	
	@Test
	void contextLoads() {
		boardService.getBoardPaginationList(null);
	}

}
