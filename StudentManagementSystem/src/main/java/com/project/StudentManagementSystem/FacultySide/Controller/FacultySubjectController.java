package com.project.StudentManagementSystem.FacultySide.Controller;

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
@RequestMapping("/faculty")
public class FacultySubjectController 
{
	@Autowired
	SubjectService subjectService;
	
	@Autowired
	StandardService standardService;
	
	@GetMapping("/loadSubjectList/{id}")
	public String loadSubjectList(Model model,@PathVariable int id)
	{
		List<Subject> subject = subjectService.getSubjectList();
		model.addAttribute("id", id);
		model.addAttribute("subList", subject);
		return "SubjectList";
	}
	
	@GetMapping("/loadSubjectPage/{id}")
	public String addNewSubject(Model model,@PathVariable("id")int id)
	{
		List<Standard> list = standardService.getAllStandard();
		model.addAttribute("standard", list);
		model.addAttribute("id", id);
		model.addAttribute("newSubject", new Subject());
		return "Subject";
	}
	
	@RequestMapping("/deleteSubject/{subjectid}/{id}")
	public String deleteSubject(Model model ,@PathVariable("subjectid") int subjectid,@PathVariable("id")int id)
	{
		subjectService.deleteSubject(subjectid);
		model.addAttribute("id", id);
		return "redirect:/faculty/loadSubjectList/"+id;
	}
	@PostMapping("/saveSubject/{id}")
	public String saveSubject(Model model,@ModelAttribute("newSubject")Subject subject,@PathVariable("id")int id)
	{
		model.addAttribute("id", id);
		subjectService.saveSubject(subject);
		return "redirect:/faculty/loadSubjectList/"+id;
	}
	

}
