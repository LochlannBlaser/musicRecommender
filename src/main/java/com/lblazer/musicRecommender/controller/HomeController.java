package com.lblazer.musicRecommender.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String returnGreeting() {
		return "Arrgh this be it, matey";
	}

}
