package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.models.User2;

@Controller
public class UserController2 {

	

	@RequestMapping(value="/newinfo", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute("user") User2 user) {

	      System.out.println("Email: " + user.getEmail());
	      System.out.println("First Name: " + user.getFname());

	      return "newuser";
	   }
	
}
