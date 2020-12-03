package com.abd.ssrdemo.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

	@GetMapping("/")
	public String land() {
		return "landpage";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
