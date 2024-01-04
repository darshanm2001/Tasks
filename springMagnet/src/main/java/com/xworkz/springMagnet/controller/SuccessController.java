package com.xworkz.springMagnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SuccessController {
	public SuccessController() {
		System.out.println("Invoking SuccessController");
	}

	@PostMapping("/jaiSriram")
	public String complete() {
		System.out.println("Invoking complete....");
		return "success";

	}
}
