package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/formLoad")
	public String formLoad(Model model) {
		model.addAttribute("user",new User());
		return "index";
	}

	@PostMapping("/formLoad")
	public String handleSubmit(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "index";
		} else {
			System.out.println(user);
			model.addAttribute("msg", "User Saved");
			return "index";
		}
	}
}
