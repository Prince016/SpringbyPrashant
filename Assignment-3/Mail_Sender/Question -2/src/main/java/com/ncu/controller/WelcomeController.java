package com.ncu.controller;




import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.ncu.models.Users;

@Controller
public class WelcomeController {

	
	

//	--------------------------------------------
	
//	@RequestMapping("/init")
//	public String initView(Model model) {
//	System.out.println("Handler method is called.");
//
//
//
//	model.addAttribute("welcome_msg", "Spring Mvc Internationalization Example");
//	return "welcome";
//	}
	

	
//	-----------------------------------------------------------
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	
	@RequestMapping("/")
	public String helloMsg()
	{
		return "welcome";
	}
	

	
	@RequestMapping("/reg")
	public String Home(Model model) {
		model.addAttribute("UserModel", new Users());
		
		return "client";
	}
	
	
	
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String doLogin(@Valid @ModelAttribute("UserModel") Users use ,BindingResult theBindingResult) {
		
		
		System.out.println("Name:->  "+use.getUserid()+"  ");	
		System.out.println("Password:->  "+use.getPwd()+"  ");	
		System.out.println("Email:->  "+use.getEmail()+"  ");	
		System.out.println("Age:->  "+use.getAge()+"  ");	
		System.out.println("Gender:->  "+use.getGender()+"  ");	
		System.out.println("Area:->  "+use.getArea()+"  ");	
		System.out.println("State:->  "+use.getState()+"  ");	
		System.out.println("Country:->  "+use.getCountry()+"  ");	
	
		if (theBindingResult.hasErrors()) {
			return "client";
		}
		else {
			return "fullsuccess";
		}
			

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		








