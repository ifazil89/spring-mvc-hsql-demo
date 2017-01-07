package com.fazil.springhiber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fazil.springhiber.model.UserLoginDetail;
import com.fazil.springhiber.service.UserService;

@Controller
//@SessionAttributes(names="userSession")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value={"/home","/list"})
	public String listAllUsers(ModelMap model){
		List<UserLoginDetail> listUsers = userService.findAllUsers();
		//model.addAttribute("user", userDetail);
		model.addAttribute("users", listUsers);
		return "home";
	}
}

