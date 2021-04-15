package com.project.StudentManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.StandardService;

@Controller
public class ClassController 
{
	@Autowired
	ClassService classService;
	
	@Autowired
	StandardService standardService;
	
	@GetMapping("/loadClassList")
	public String loadClassList(Model model)
	{
		List<ClassModel> classModel = classService.getAllClassList();
		model.addAttribute("classList", classModel);
		return "ClassList";
	}
	
	@GetMapping("/deleteClass/{classid}")
	public String deleteClass(@PathVariable("classid") int id)
	{
		classService.deleteClass(id);
		return "redirect:/loadClassList";
	}
	@GetMapping("/loadClassPage")
	public String loadClassPage(Model model)
	{
		
		List<Standard> list = standardService.getAllStandard();
		model.addAttribute("standard", list);
		model.addAttribute("classdata", new ClassModel());
		return "ClassPage";
	}
	@PostMapping("/saveClass")
	public String saveStandard(@ModelAttribute("classdata") ClassModel classModel)
	{
		
		classService.saveClass(classModel);
		return "redirect:/loadClassList";
	}

}
