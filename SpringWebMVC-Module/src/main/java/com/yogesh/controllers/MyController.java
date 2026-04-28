package com.yogesh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/getHello")
	public ModelAndView getHello() {
		
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
}
