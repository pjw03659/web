package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드
	@Autowired
	MemberDAO3 dao = new MemberDAO3();
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		
		dao.insert(bag);
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		
	}
	
	@RequestMapping("delete")
	public void delete(MemberVO bag) {
		System.out.println("delete 요청됨.");
		
	}
	
	@RequestMapping("one")
	public void one(MemberVO bag) {
		
	}
	
	@RequestMapping("list.multi")
	public void list() {
		
	}
}
