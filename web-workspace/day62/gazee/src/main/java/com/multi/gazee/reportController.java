package com.multi.gazee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class reportController {

	@Autowired
	reportDAO dao;
	
	@RequestMapping("insert")
	public void insert(reportVO bag) {
		dao.insert(bag);
		System.out.println("insert요청됨");
		System.out.println(bag);
	}
	
	@RequestMapping("delete")
	public void delete(reportVO bag) {
		System.out.println(bag);
		dao.delete(bag);
	}
	
	@RequestMapping("update")
	public void update(reportVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one")
	public void one(int no, Model model) {
		System.out.println(no);
		reportVO vo = dao.one(no);
		model.addAttribute("vo",vo);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<reportVO> list = dao.list();
		model.addAttribute("list",list);
	}
	
}
