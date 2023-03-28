package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	Bbs_DAO dao = new Bbs_DAO();
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		dao.insert(bag);
		System.out.println("insert요청됨.");
		System.out.println(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		dao.update(bag);
		System.out.println("update요청됨");
		System.out.println(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(BbsVO bag) {
		dao.delete(bag);
		System.out.println("delete 요청됨");
		System.out.println(bag);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no) {
		dao.one(no);
	}
	
	@RequestMapping("list2.multi")
	public void list() {
		
	}
}
