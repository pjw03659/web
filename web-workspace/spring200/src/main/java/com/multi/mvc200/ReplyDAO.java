package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class ReplyDAO {
	public void insert(ReplyVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql = "insert into reply(bbsno, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getBbsno());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());

			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		//ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<ReplyVO> list = new ArrayList();
		
		ReplyVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");
			
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. mysql 연결 성공.");
			
			
			String sql = "select * from reply where bbsno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			//PreparedStatement
			ps.setInt(1, bbsno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery();
			//select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				int no2= rs.getInt(1);
				int bbsno2= rs.getInt(2);
				String writer= rs.getString(4);
				String content= rs.getString(3);
				/*
				 * System.out.println(no2+" " +bbsno+" " +writer+" " +content+" ");
				 */
				//검색결과를 검색화면 UI부분을 주어야 함.
				//3. 가방을 만들자.
				bag = new ReplyVO();
				bag.setNo(no2);
				bag.setBbsno(bbsno2);
				bag.setWriter(writer);
				bag.setContent(content);
				
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			//System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
}
