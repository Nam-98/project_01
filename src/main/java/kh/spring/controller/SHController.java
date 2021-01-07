package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SHController {
	
	@RequestMapping
	public void hungry() {
		System.out.println("배고프다");
	}
	
	

}
