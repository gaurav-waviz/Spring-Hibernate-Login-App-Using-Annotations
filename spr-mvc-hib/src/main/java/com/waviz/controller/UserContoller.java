package com.waviz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.waviz.model.User;
import com.waviz.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserContoller {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addUserPage() {
		ModelAndView modelAndView = new ModelAndView("add-user-form");
		modelAndView.addObject("user", new User());
	
		return modelAndView;
		
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingTeam(@ModelAttribute User user) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		userService.addUser(user);
		
		String message = "User was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView modelAndView = new ModelAndView("login-user-form");
		modelAndView.addObject("user", new User());
	
		return modelAndView;
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute User user) {
		
		
		boolean isValid = userService.checkUser(user);
		if(isValid){
			String message = "Welcome "+user.getEmail();
			ModelAndView modelAndView = new ModelAndView("welcome-user-page");
			modelAndView.addObject("message", message);
			return modelAndView;
		}
		
			String message = "Invalid email or password";
			ModelAndView modelAndView = new ModelAndView("login-user-form");
			modelAndView.addObject("message", message);
		
		
		
		return modelAndView;
	}
}
