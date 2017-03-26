package com.example.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mvc.data.entities.Project;
import com.example.mvc.data.entities.Sponsor;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String goHome(Model model) {
		
		Project project = new Project();
		project.setName("First Project");
		Sponsor sponsor = new Sponsor("NASA", "555-55-5555", "hqnews-request@newsletters.nasa.gov");
		project.setSponsor(sponsor );
		project.setDescription("This is a simple project sponsored by NASA");
		
		model.addAttribute("currentProject", project);
		
		return "home";
	}
}
