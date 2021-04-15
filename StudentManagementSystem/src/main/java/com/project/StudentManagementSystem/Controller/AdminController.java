package com.project.StudentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.StudentManagementSystem.Model.Admin;
import com.project.StudentManagementSystem.Service.AdminService;

@Controller
public class AdminController
{
	@Autowired
	AdminService adminService;
	

	@GetMapping("/deleteadmin/{id}")
	public String deleteFaculty(@PathVariable("id") int id)
	{
		adminService.deleteAdmin(id);
		return "redirect:/listadmin";
	}
	@GetMapping("/addadmin")
	public String admin(Model model)
	{
		model.addAttribute("admin", new Admin());
		return "Admin";
	}
	@PostMapping("/saveadmin")
	public String savAdmin(@ModelAttribute("admin") Admin  admin)
	{
		adminService.addAdmin(admin);
		return "redirect:/listadmin";
	}
		
	@RequestMapping("/listadmin")
	public String getAdmin(Model model)
	{
		List<Admin> admins = adminService.findAll();
		model.addAttribute("alist", admins);
		return "adminlist";
	}
	
	@GetMapping("/editadmin/{id}")
	public String edit(@PathVariable int id,Model model)
	{
		Admin admin = adminService.finadmin(id);
		model.addAttribute("id", id);
		model.addAttribute("admin", admin);
		return "Admin";
	}
}

