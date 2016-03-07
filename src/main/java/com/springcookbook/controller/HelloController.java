package com.springcookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcookbook.service.UserService;

@Controller
public class HelloController {

	@Autowired
	private ApplicationContext applicationContext;

	@RequestMapping("/hi")
	@ResponseBody
	public String hi() {
		StringBuilder sb = new StringBuilder();
		String[] beans = applicationContext.getBeanDefinitionNames();
		for (String bean : beans) {
			sb.append("<br/>");
			sb.append(bean);
			sb.append(" # ");
		}
		UserService userService = (UserService) applicationContext.getBean("userService");
		return "Hello, world " + "\n" + sb.toString() + "\n" + userService.findNumberOfUsers();
	}

}
