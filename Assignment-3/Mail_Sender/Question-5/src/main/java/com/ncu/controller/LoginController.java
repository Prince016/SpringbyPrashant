package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.models.User2;



@Controller
@SessionAttributes("user")

//@RequestMapping("/LoginController")
public class LoginController {
	@ModelAttribute("user")
	   public User2 setUpUserForm() {
	      return new User2();
	   }

	   @RequestMapping("/")
	   public String index(Model model) {
	     model.addAttribute("user", new User2());
		   return "index";
	   }

	   @RequestMapping(value="/dologin", method=RequestMethod.GET)
	   public String doLogin(@ModelAttribute("user") User2 user, Model model) {

	      // Implement your business logic
	      if (user.getEmail().equals("abc@gmail.com") && user.getPassword().equals("abc@123")) {
	         // Set user dummy data
	        System.out.println(user.getEmail());
	    	  user.setFname("Prashant");
	         user.setMname("p");
	         user.setLname("Sharma");
	         user.setAge(4);
	         model.addAttribute(user);
	      } else {
	         model.addAttribute("message","Login failed. Try again.");
	         System.out.println("login failed");
	         return "index";
	      }
	      return "success";
	   }
}