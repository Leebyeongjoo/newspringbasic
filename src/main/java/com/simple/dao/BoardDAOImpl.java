package com.simple.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.simple.command.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	
	ArrayList<BoardVO> DB = new ArrayList<>();
	
	
	
	@Override
	public void boardRegist(BoardVO vo) {//저장
		
		DB.add(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {//불러오기
		
		
		return DB;
	}

	@Override
	public void boardDelete(int num) {//삭제
		
		
	}

}
