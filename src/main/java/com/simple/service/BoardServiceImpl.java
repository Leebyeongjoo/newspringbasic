package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public void boardRegist(BoardVO vo) { //저장
		// TODO Auto-generated method stub
		boardDao.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {//불러오기
		// TODO Auto-generated method stub
		
		boardDao.getList();
		
		return null;
	}

	@Override
	public void boardDelete(int num) {//삭제
		// TODO Auto-generated method stub
		
	}

	

}
