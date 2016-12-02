package com.fazil.springhiber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fazil.springhiber.model.UserLoginInfo;
import com.fazil.springhiber.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/","/list"})
	public String listAllUsers(ModelMap model){
		List<UserLoginInfo> listUsers = userService.findAllUsers();
		model.addAttribute("users", listUsers);
		return "home";
	}
}
