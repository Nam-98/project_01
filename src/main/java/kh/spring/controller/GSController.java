package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GSController {

	@RequestMapping
	public void wow() {
		System.out.println("신통방통 ㅋㅋㅋ");
	}
	
}
