package com.simple.basic;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class) //�����������ӿ�ũ���� ���������� �׽�Ʈȯ���� ����
@Configuration("file:src/main/webapp/WEB-INF/config/root-context.xml") //�ش������� ������ �������Ϸ� ����
public class JDBCHikari {
   
   @Autowired
   DataSource dataSource;
   
   
   @Test
   public void test() {
      
      
      try {
         
         Connection conn = dataSource.getConnection();
         System.out.println("���Ȯ�� : " + conn);
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }

}