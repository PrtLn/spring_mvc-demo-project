package com.example.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@RequestMapping(value="/add", method=RequestMethod.GET)	
	public String addProject() {
		System.out.println("invoking addProject method");		
		return "project_add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)	
	public String saveProject() {
		System.out.println("invoking saveProject method");		
		return "project_add";
	}
	
	
	// handling method for the selecting options	
	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi"})	
	public String saveMultiYearProject() {
		System.out.println("invoking saveMultiProject method");		
		return "project_add";
	}
	
	// handling method for the CheckBox selection
	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi", "special"})	
	public String saveSpecialProject() {
		System.out.println("invoking saveSpecialProject method");		
		return "project_add";
	}
	
	
}