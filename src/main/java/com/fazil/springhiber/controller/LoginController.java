/*
 * LoginController.java
 */
package com.fazil.springhiber.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fazil.springhiber.model.UserDetail;
import com.fazil.springhiber.model.UserLoginDetail;
import com.fazil.springhiber.service.UserService;

/**
 * Login relater handler
 * @author fazil
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * initial index call
	 * @param model
	 * @return
	 */
	@RequestMapping(value={"/"})
	public String initLoader(ModelMap modelMap,@ModelAttribute("error")String error){
		if(error != null && !error.isEmpty()){
				modelMap.addAttribute("error", error);
		}
		modelMap.addAttribute("userLogin", new UserLoginDetail());
		return "login";
	}
	
	/**
	 * handle the login request
	 * @param userModel
	 * @param modelMap
	 * @param redirect
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)	
	public String doLogin(@ModelAttribute("userLogin") UserLoginDetail userLoginModel,
					Model model,
					RedirectAttributes redirectAttributes,
					HttpServletRequest request){
		UserDetail userDetail = userService.getUserDetailByLogin(userLoginModel);
		if(userDetail == null){
			redirectAttributes.addFlashAttribute("error", "Invalid Username/Password..");
			return "redirect:/";
		}
		request.getSession().setAttribute("userSession", userDetail);
		redirectAttributes.addFlashAttribute("user", userDetail);
		return "redirect:home";
	}
	
	/**
	 * log out handler
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String doLogout(Model model,HttpServletRequest request){
		request.getSession().removeAttribute("userSession");
		return "redirect:/";
	}
}
