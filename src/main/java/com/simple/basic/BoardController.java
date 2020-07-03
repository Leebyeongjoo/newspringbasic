package com.simple.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.BoardVO;
import com.simple.service.BoardServiceImpl;

@Controller
@RequestMapping("/service")
public class BoardController {

@Autowired
private BoardServiceImpl boardService;

@RequestMapping("/boardRegist")
public void boardList() {
	
}
@RequestMapping("/boardForm")
public String boardForm(BoardVO vo ) {
	
	boardService.boardRegist(vo);
	
	return "service/boardResult";
}
@RequestMapping("/boardList")
public String boardList(Model model) {
	boardService.getList()
	
	
	return "service/boardList";
	
}

}
