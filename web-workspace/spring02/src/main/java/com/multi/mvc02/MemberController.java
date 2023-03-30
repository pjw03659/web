package com.multi.mvc02;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드
	@Autowired
	MemberDAO3 dao;
	
	
	
	@RequestMapping("login")
	public String login(MemberVO bag) {
		System.out.println(bag);
		int result = dao.login(bag);
		if(result==1) {
			return "ok";
		} else {
			return "no";
		}
	}
	
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
	public void one(String id, Model model) {
		System.out.println("one 요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		
		model.addAttribute("bag",bag);
		
	}
	
	@RequestMapping("list.multi")
	public void list(Model model) {
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list",list);	
	}
}
