package com.xworkz.springMagnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClickController {
	public ClickController() {
		System.out.println("Invoking ClickController");
	}

	@PostMapping("/info")
	public String clicking() {
		System.out.println("Invoking clicking.....");
		return "index";
	}
}
