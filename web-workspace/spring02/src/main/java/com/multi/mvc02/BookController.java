package com.multi.mvc02;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao = new BookDAO();
	
	@RequestMapping("insert3.multi")
	public void insert(BookDTO bag) {
		dao.insert(bag);
		System.out.println("insert 요청됨");
		System.out.println(bag);
		System.out.println(dao);
	}
	
	@RequestMapping("update3.multi")
	public void update(BookDTO bag) {
		dao.update(bag);
		
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		BookDTO bag =dao.one(id);
		model.addAttribute("bag",bag);
	}
	
	
	
}
