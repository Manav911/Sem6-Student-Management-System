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

import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Model.Subject;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.SubjectService;

@Controller
public class SubjectContoller 
{
	@Autowired
	SubjectService subjectService;
	
	@Autowired
	StandardService standardService;
	
	@GetMapping("/loadSubjectList")
	public String loadSubjectList(Model model)
	{
		List<Subject> subject = subjectService.getSubjectList();
		model.addAttribute("subList", subject);
		return "SubjectList";
	}
	
	@RequestMapping("/deleteSubject/{subjectid}")
	public String deleteSubject(@PathVariable("subjectid") int id)
	{
		subjectService.deleteSubject(id);
		return "redirect:/loadSubjectList";
	}
	
	@GetMapping("/loadSubjectPage")
	public String addNewSubject(Model model)
	{
		List<Standard> list = standardService.getAllStandard();
		model.addAttribute("standard", list);
		model.addAttribute("newSubject", new Subject());
		return "Subject";
	}
	@PostMapping("/saveSubject")
	public String saveSubject(@ModelAttribute("newSubject")Subject subject)
	{
		subjectService.saveSubject(subject);
		return "redirect:/loadSubjectList";
	}
}
