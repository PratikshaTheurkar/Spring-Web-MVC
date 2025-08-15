package com.example.controller;

import java.security.KeyStore.PrivateKeyEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public ModelAndView getFormLoading() {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("userObj",new User());
		mv.setViewName("index");
		return mv;
	}
	
	@PostMapping("/user")
	public ModelAndView handleUserForm(User user) {
		System.out.println(user);
		userRepository.save(user);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","User Details Saved");
		mv.setViewName("success");
		
		return mv;
	}
}
