package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HLController {
	
	@RequestMapping
	public void surprise() {
		System.out.println("신기합니다");

		System.out.println("ABC");
		System.out.println("DEF");
		
		System.out.println("신남희 그녀는 김인가? ");
	}
}
