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

import com.project.StudentManagementSystem.Model.Faculty;
import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Model.Subject;
import com.project.StudentManagementSystem.Service.FacultyService;
import com.project.StudentManagementSystem.Service.SubjectService;

@Controller
public class FacultyController 
{
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	SubjectService subjectService;
	
	@GetMapping("/addfaculty")
	public String add(Model model)
	{
		List<Subject> list = subjectService.getAllSubjectName();
		model.addAttribute("subject", list);
		model.addAttribute("faculty",new Faculty());
		return "faculty";
		
	}
	
	@PostMapping("/savefaculty")
	public String addfaculty(@ModelAttribute("faculty") Faculty faculty)
	{
		facultyService.saveFaculty(faculty);
		return "redirect:/home";
	}
	
	@RequestMapping("/findlist")
	public String findList(Model model)
	{
		List<Faculty> facultylist = facultyService.findAll();
		model.addAttribute("fst", facultylist);
		return "FacultyList";
	}
	@GetMapping("/deletefaculty/{facultyid}")
	public String deleteFaculty(@PathVariable("facultyid") int facultyid)
	{
		facultyService.deleteFaculty(facultyid);
		return "redirect:/findlist	";
	}
	@GetMapping("/editfaculty/{facultyid}")
	public String edit(@PathVariable int facultyid,Model model)
	{
		Faculty fst = facultyService.findfaculty(facultyid);
		model.addAttribute("faculty", fst);
		return "faculty";
	}
}
