package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.multi.mvc300.MemberVO;

//import 화면DB연결.MemberVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게!라고 설정해야함.
//2가지방법을 할 수 있음.
//어노테이션(표시)방법, XML방법
@Component
public class MemberDAO { // CRUD

	@Autowired
	SqlSessionTemplate my;
	
	
//	 public int login(MemberVO bag) { return result; }
//	 
//	 public ArrayList<MemberVO> list() { return list; }
//	 
	 public MemberVO one(String id) {
		 MemberVO bag =my.selectOne("member.one", id);
		 return bag; 
	}
 
	 public int delete(String id) { 
		 int result = my.delete("member.del", id);
		 
		 return result; 
	}
//	 
	 public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//                     "namespace.id"
		return result;
	 }
	 
	 public int update(MemberVO bag) {
		 int result = my.update("member.up", bag);
		 
		 return result;
	 }
}
