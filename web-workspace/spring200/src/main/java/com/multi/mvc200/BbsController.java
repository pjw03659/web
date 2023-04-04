package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.mvc200.BbsVO;

@Controller
public class BbsController {
	@Autowired
	Bbs_DAO dao;

	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		dao.insert(bag);
		System.out.println("insert요청됨.");
		System.out.println(bag);
	}
	
	@RequestMapping("update2")
	public void update(BbsVO bag) {
		dao.update(bag);
		System.out.println("update요청됨");
		System.out.println(bag);
	}
	
	@RequestMapping("delete2")
	public void delete(BbsVO bag) {
		dao.delete(bag);
		System.out.println("delete 요청됨");
		System.out.println(bag);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		BbsVO bag = dao.one(no);
		model.addAttribute("bag",bag);
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list2.multi")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list",list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list",list);
	}
	
	@RequestMapping("one6")
	public void one6(int bbsno, Model model) {
		BbsVO bag = dao.one(bbsno);
		model.addAttribute("bag",bag);
		ArrayList<ReplyVO> list = dao2.list(bbsno);
		model.addAttribute("list", list);
	}
	
}
