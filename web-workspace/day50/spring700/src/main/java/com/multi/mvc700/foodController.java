package com.multi.mvc700;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.mvc700.foodVO;

@Controller
public class foodController {
	@Autowired
	foodDAO dao;
	
	@RequestMapping("insert")
	public void insert(foodVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(foodVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(int no) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("one")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		foodVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<foodVO> list = dao.list();
		model.addAttribute("list",list);
	}
}
