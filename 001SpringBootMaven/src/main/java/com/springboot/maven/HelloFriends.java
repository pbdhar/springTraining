package com.springboot.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.Model.User;
import com.springboot.maven.repository.UserRepository;

@Controller
public class HelloFriends {
	@Autowired
	private UserRepository userrepo;
	
	UserEntity ue =new UserEntity();
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello Spring 5.0?";
	}
	
	@RequestMapping("/")
	public String welcome()
		{
			return "index";
		}
	
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user)
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("adduser");
		mv.addObject("adduser",user);
		UserEntity ue =new UserEntity();
		ue.setFname(user.getFname());
		ue.setLname(user.getLname());
		
		//UserEntity userEntity=new UserEntity();
		
		//userEntity.setFname();
		userrepo.save(ue);
		
		System.out.println(user.getFname() + " " +user.getLname());
		return mv;
	}
	
}
