package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	@RequestMapping("/welcome")
	public ModelAndView welcome()
	{
		String message="<h1>Hello From Spring MVC</h1>";
		ModelAndView mav=new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("msg",message);
		return mav;
		
	}
}
