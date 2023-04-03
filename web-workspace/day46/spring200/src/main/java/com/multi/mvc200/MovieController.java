package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public void mov(MovieVO vo, Model model) {
		model.addAttribute("vo",vo);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> tour = new ArrayList<String>();
		tour.add("제주도");
		tour.add("미국 동부");
		tour.add("미국 서부");
		tour.add("홍콩");
		tour.add("평창");
		model.addAttribute("tour", tour);
	}
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("딸기");
		list.add("참외");
		list.add("포도");
		model.addAttribute("list", list);
	}
}
