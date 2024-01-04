package com.xworkz.springSong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClickController {
	public ClickController() {
		System.out.println("Created ClickController");
	}
	
	@PostMapping("/info")
	public String clicking() {
		System.out.println("invoking Clicking..");
		return "index";
	}
	

}
