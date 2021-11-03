package com.care.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	public MyController() {
		System.out.println("MyController 생성자 실행");
	}

	@RequestMapping(value = "my/index", method = RequestMethod.GET)
	public String index() {
		return "/get_post/index";
	}

	@GetMapping("my/result")
	public String result_get(HttpServletRequest request,Model model) {
		System.out.println("get방식으로 들어왔습니다");
		return "/get_post/result";
	}
	
	//@PostMapping("my/result")
	@RequestMapping(value = "my/result", method = RequestMethod.POST)
	public String result_post() {
		System.out.println("post방식으로 들어왔습니다");
		return "/get_post/result";
	}
	
	
}
