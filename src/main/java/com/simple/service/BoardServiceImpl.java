package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public void boardRegist(BoardVO vo) { //����
		// TODO Auto-generated method stub
		boardDao.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {//�ҷ�����
		// TODO Auto-generated method stub
		
		boardDao.getList();
		
		return null;
	}

	@Override
	public void boardDelete(int num) {//����
		// TODO Auto-generated method stub
		
	}

	

}
