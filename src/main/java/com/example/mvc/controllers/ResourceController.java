package com.example.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mvc.data.entities.Resource;

@Controller
@RequestMapping("/resource")
public class ResourceController {
	
	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("resource", new Resource());
		return "resource_add";
	}
	
	@RequestMapping("/save")
	public String save() {
		System.out.println("invoking the save() method");
		return "resource_add";
	}
}
