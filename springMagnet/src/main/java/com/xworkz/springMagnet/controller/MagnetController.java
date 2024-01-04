package com.xworkz.springMagnet.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springMagnet.dto.MagnetDTO;
import com.xworkz.springMagnet.service.MagnetService;

@Controller
@RequestMapping("/")
public class MagnetController {
	@Autowired
	private MagnetService service;

	public MagnetController() {
		System.out.println("Invoking MagnetController");
	}

	@PostMapping("/push")
	public String save(@Valid MagnetDTO dto,BindingResult errors,Model model) {
		System.out.println("Invoking save in MagnetController....");
		System.out.println("Is dto valid:"+errors.hasErrors());
		model.addAttribute("dto", dto);
		
		if(errors.hasErrors()) {
			
		List<ObjectError> objectErrors=errors.getAllErrors();
		objectErrors.forEach(mag-> System.err.println(mag.getObjectName() + ":message " + mag.getDefaultMessage()));
        model.addAttribute("errors",objectErrors);
		return "magnet";
		}else {
			
	
			boolean succeed=this.service.valiadteAndSave(dto);
			if(succeed) {
				model.addAttribute("msg", "Details saved successfully");
			}
			else {
				model.addAttribute("msg", "Details not saved successfully...");
		}
		return "success";
		}
	}
}
