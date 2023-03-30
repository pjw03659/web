package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlaylistController {

	@Autowired
	PlaylistDAO dao = new PlaylistDAO();
	
	@RequestMapping("insert4.multi")
	public void insert(PlaylistVO bag) {
		dao.insert(bag);
		System.out.println("insert 요청됨");
		System.out.println(bag);
	}
	
	@RequestMapping("delete4.multi")
	public void delete(PlaylistVO bag) {
		dao.delete(bag);
		System.out.println("delete 요청됨");
		System.out.println(bag);
	}
	
	
	@RequestMapping("one4.multi")
	public void one(int id, Model model) {
		PlaylistVO bag =dao.one(id);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list4.multi")
	public void list(Model model) {
		ArrayList<PlaylistVO> list =dao.list();
		model.addAttribute("list",list);
	}
}
