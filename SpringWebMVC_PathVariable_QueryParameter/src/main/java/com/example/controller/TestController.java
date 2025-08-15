package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class TestController {

	//Query Parameter Example
	//http://localhost:8181/getTest?name=sachin
	@GetMapping("/getTest")
	@ResponseBody
	public String getTest(@RequestParam("name") String name) {
		return name+", is Java Developer";
	}
	
	//Path Variable
	//http://localhost:8181/getExample/pune
	@GetMapping("/getExample/{city}")
	@ResponseBody
	public String getExample(@PathVariable("city") String city) {
		return city+", is city";
	}
	
}
