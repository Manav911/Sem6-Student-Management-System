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

import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.StandardService;

@Controller
@RequestMapping("/faculty")
public class FacultyClassController {
	@Autowired
	ClassService classService;
	
	@Autowired
	StandardService standardService;
	
	@GetMapping("/loadClassList/{id}")
	public String loadClassList(Model model,@PathVariable("id")int id)
	{
		List<ClassModel> classModel = classService.getAllClassList();
		model.addAttribute("id", id);
		model.addAttribute("classList", classModel);
		return "ClassList";
	}
	
	@GetMapping("/loadClassPage/{id}")
	public String loadClassPage(Model model,@PathVariable("id")int id)
	{
		
		List<Standard> list = standardService.getAllStandard();
		model.addAttribute("standard", list);
		model.addAttribute("id", id);
		model.addAttribute("classdata", new ClassModel());
		return "ClassPage";
	}
	@GetMapping("/deleteClass/{classid}/{id}")
	public String deleteClass(Model model,@PathVariable("classid") int classid,@PathVariable("id")int id)
	{
		classService.deleteClass(classid);
		model.addAttribute("id", id);
		return "redirect:/faculty/loadClassList/"+id;
	}
	
	@PostMapping("/saveClass/{id}")
	public String saveStandard(Model model,@ModelAttribute("classdata") ClassModel classModel,@PathVariable("id")int id)
	{
		model.addAttribute("id", id);
		classService.saveClass(classModel);
		return "redirect:/faculty/loadClassList/"+id;
	}
}
