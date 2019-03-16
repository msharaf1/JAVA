package com.web.bindingres.controllers;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.bindingres.models.Employee;;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String mainPage() {
		return "index";
	}
	
	
	   @GetMapping("/added")
	   public String showEmp(
//			   @RequestParam(value="firstName", required=false) String firstName, 
//			   @RequestParam(value="lastName", required=false) String lastName,
//			   @RequestParam(value="age", required=false) String age,
//			   @RequestParam(value="id", required=false) String id,
			   HttpSession session) {
		   	
//		   	session.getAttribute(firstName);
//		   	session.getAttribute(lastName);
//		   	session.getAttribute(age);
//		   	session.getAttribute(id);
		   return "employee";
	   }
	   
	   @PostMapping("/addEmployee")
	   public String addEmp(@Valid@RequestParam(value="firstName", required=false) String firstName, 
			   @RequestParam(value="lastName", required=false) String lastName,
			   @RequestParam(value="age", required=false) int age,
			   @RequestParam(value="id", required=false) int id,
			   Model model, HttpSession session) {
		   
//		   BindingResult result
		   Employee  emp = new Employee();
		   
		   //Validation must be added:
//		   if(firstName == null) {
//			   return "redirect:/";
//		   }else if (lastName == null) {
//			   return "redirect:/";
//		   }else if (age < 0) {
//			   return "redirect:/";
//		   }else if (id < 0) {
//			   return "redirect:/";
//		   }
		   

		   
//		 if(emp.getFirstName() == null) {
//			 return "redirect:/";
//		 }else if(emp.getLastName() == null) {
//			 return "redirect:/";
//		 }else if(emp.getAge() < 0) {
//			 return "redirect:/";
//		 }else if(emp.getId() < 0) {
//			 return "redirect:/";
//		 }
		   
		   
		   emp.setFirstName(firstName);
		   emp.setLastName(lastName);
		   emp.setAge(age);
		   emp.setId(id);
		   //make sure it send int
		   
		  
		   
//		   session.getAttribute(firstName);
		   session.setAttribute("firstName", firstName);
		   session.setAttribute("lastName", lastName);
		   session.setAttribute("age", age);
		   session.setAttribute("id", id);
		   
//		   emp.setLastName();
		   System.out.println(emp.getFirstName() + emp.getLastName() + emp.getAge() + emp.getId());
		   return "redirect:/added";
	   }
	   

}
