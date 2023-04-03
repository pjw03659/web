package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class Bbs_DAO {
	public void insert(BbsVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql = "insert into bbs(title, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle());
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

	public void delete(BbsVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql과 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql = "delete from bbs where no =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,bag.getNo());
			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(BbsVO bag) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mysql과 자바 연결할 부품 설정 성공");

			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.mysql 연결 성공.");

			String sql = "update bbs set content =? where NO =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(2, bag.getNo());
			ps.setString(1, bag.getContent());
			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public BbsVO one (int no) {
		ResultSet rs = null; //항목명+결과 데이터를 담고 있는 테이블
		BbsVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");
			
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. mysql 연결 성공.");
			
			
			String sql = "select * from bbs where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) {
				System.out.println("검색 결과 있음 성공.");
			
				int no2= rs.getInt(1);
				String title= rs.getString(2);
				String writer= rs.getString(4);
				String content= rs.getString(3);
				System.out.println(no2+" "
								+title+" "
								+writer+" "
								+content+" ");
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setWriter(writer);
				bag.setContent(content);
				
			}else {
				System.out.println("검색 결과 없음.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
	}
	
	public ArrayList<BbsVO> list() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		//ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<BbsVO> list = new ArrayList();
		
		BbsVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mysql과 자바 연결할 부품 설정 성공.");
			
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. mysql 연결 성공.");
			
			
			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				int no2= rs.getInt(1);
				String title= rs.getString(2);
				String writer= rs.getString(4);
				String content= rs.getString(3);
				/*
				 * System.out.println(no2+" " +title+" " +writer+" " +content+" ");
				 */
				//검색결과를 검색화면 UI부분을 주어야 함.
				//3. 가방을 만들자.
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
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
