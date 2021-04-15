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
public class FacultyStandardController 
{
	@Autowired
	StandardService standardService;
	
	@Autowired
	ClassService classService;
	
	@GetMapping("/loadStandardList/{id}")
	public String loadStandardList(Model model,@PathVariable("id")int id)
	{
		List<Standard> standard = standardService.getAllStandard();
		model.addAttribute("id", id);
		model.addAttribute("stdList", standard);
		return "StandardList";
	}
	
	@RequestMapping("/deleteStandard/{stid}/{id}")
	public String deleteStandard(Model model,@PathVariable("stid") int stid,@PathVariable("id")int id)
	{
		standardService.deleteStandard(stid);
		model.addAttribute("id",id);
		return "redirect:/faculty/loadStandardList/"+id;
	}
	
	@GetMapping("/loadStandardPage/{id}")
	public String loadStandardPage(Model model,@PathVariable("id")int id)
	{
		List<ClassModel> list= classService.getAllClassName();
		model.addAttribute("id", id);
		model.addAttribute("classname", list);
		model.addAttribute("standard", new Standard());
		return "Standard";
	}
	@PostMapping("/saveStandard/{id}")
	public String saveStandard(Model model,@ModelAttribute("standard") Standard standard,@PathVariable("id")int id)
	{
		model.addAttribute("id", id);
		standardService.saveStandard(standard);
		return "redirect:/faculty/loadStandardList/"+id;
	}

}
