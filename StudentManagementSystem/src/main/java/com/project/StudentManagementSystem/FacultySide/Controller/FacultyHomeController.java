package com.project.StudentManagementSystem.FacultySide.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.StudentManagementSystem.Service.AdminService;
import com.project.StudentManagementSystem.Service.FacultyService;
import com.project.StudentManagementSystem.Service.StudentService;


@Controller
@RequestMapping("/faculty")
public class FacultyHomeController 
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/loadHomePage/{id}")
	public String loadHomePage(Model model,@PathVariable("id")int id)
	{
		long student = studentService.countStudent();
		long admin = adminService.countAdmin();
		long faculty = facultyService.countFaculty();
		model.addAttribute("admin", admin);
		model.addAttribute("faculty", faculty);
		model.addAttribute("student", student);
		model.addAttribute("id", id);
		return "FacultySide";
	}
	

}
