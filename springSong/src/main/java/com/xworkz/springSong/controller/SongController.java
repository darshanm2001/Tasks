package com.xworkz.springSong.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springSong.dto.SongDTO;
import com.xworkz.springSong.service.SongService;

@Controller
@RequestMapping("/")
public class SongController {
	@Autowired
	private SongService service;

	public SongController() {
		System.out.println("Invoking SongController");
	}

	@PostMapping("/music")
	public String save(@Valid SongDTO dto, BindingResult errors, Model model) {
		System.out.println("Invoking save");
		System.out.println("Song DTO is valid" + errors.hasErrors());
		model.addAttribute("dto", dto);
		if (errors.hasErrors()) {
			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(e -> System.err.println(e.getObjectName() + ":meassage " + e.getDefaultMessage()));

			model.addAttribute("errors", objectErrors);
			return "song";
		} else {
			boolean saved = this.service.validateAndsave(dto);
			if (saved) {
				System.out.println("SongDTO" + dto);
				model.addAttribute("msg", "Song details saved successfully");
			} else {
				model.addAttribute("msg", "Song details not saved ");
			}
		}
		return "success";
	}
}
