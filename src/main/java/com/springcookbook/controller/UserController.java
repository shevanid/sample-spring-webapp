package com.springcookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcookbook.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/user/list")
	public void userList(Model model) {
	  model.addAttribute("nbUsers", userService.findNumberOfUsers());
	}

}
