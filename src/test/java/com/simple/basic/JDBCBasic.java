package com.simple.basic;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCBasic {
	//junit - �����׽�Ʈȯ��(�ڹٿ��� ���������� �и��ؼ� �׽���)
	//@Test������̼��� ���� �޼��带 main�޼���ó�� ����
	

	@Test
	public void JDBCBasic() {
		String url = "jdbc:oracle:thin:@host:1521/XEPDB1";
		String uid = "spring";
		String upw = "spring";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,uid,upw);
			System.out.println("���Ȯ��:"+ conn);
		} catch (Exception e) {
			
		}
		
	}
}
