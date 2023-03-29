package com.multi.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping
	public String movie(String movie) {
		if(movie.equals("드라마")) {
			return "drama";
		}else if(movie.equals("코믹")) {
			return "comic";
		}else if(movie.equals("액션")) {
			return "action";
		}else {
			return "no";
		}
		
	}
}