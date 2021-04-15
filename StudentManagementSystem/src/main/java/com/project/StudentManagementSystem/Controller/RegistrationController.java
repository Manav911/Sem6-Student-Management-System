package com.project.StudentManagementSystem.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.StudentManagementSystem.Model.Registration;
import com.project.StudentManagementSystem.Service.RegistrationService;

@Controller
public class RegistrationController
{
	@Autowired
	RegistrationService registrationService;
	@RequestMapping("/Register")
	public String signup(Model model)
	{
		Registration registration = new Registration();
		model.addAttribute("Registration", registration);
		return "Registration";
	}
	
	@PostMapping("/NewRegistration")
	public String Save(@ModelAttribute("Registration")Registration registration)
	{
		registrationService.registerSave(registration);
		return "Registration";
	}
	@GetMapping("/Login1")
	public String LoginPage1(Model model )
	{
		Registration registration = new Registration();
		model.addAttribute("login", registration);
		return "LoginPage";
	}
	@RequestMapping("/check")
	public String Check(@ModelAttribute("login")Registration registration ,HttpSession httpSession)
	{
		boolean check = registrationService.checkLogin(registration);
		
		
		if(check)
		{
			return  "redirect:/home";
		}
		else
		{
		

			return  "redirect:/LoginPage";
		}
	}

}
