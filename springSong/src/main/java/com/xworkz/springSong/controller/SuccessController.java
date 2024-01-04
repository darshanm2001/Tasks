package com.xworkz.springSong.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SuccessController {
	public SuccessController() {
		System.out.println("Created SuccessController");
	}

	@PostMapping("/jaiSriram")
	public String succeed() {
		System.out.println("Invoking succeed()....");
		return "success";
	}
}
