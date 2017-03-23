package com.example.mvc.controllers;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mvc.data.services.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/{projectId}")
	public String findProject(Model model, @PathVariable("projectId") Long projectId) {
		model.addAttribute("project", this.projectService.find(projectId));
		return "project";
	}
	
	@RequestMapping(value="/find")
	public String find(Model model) {
		model.addAttribute("projects", this.projectService.findAll());		
		return "projects";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)	
	public String addProject(HttpSession session) {
		
		session.setAttribute("token", "123456");
		
		System.out.println("invoking addProject method");		
		return "project_add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)	
	public String saveProject(HttpServletRequest request, HttpSession session) {
		
		System.out.println(session.getAttribute("token"));
		System.out.println(request.getParameter("name"));
				
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
