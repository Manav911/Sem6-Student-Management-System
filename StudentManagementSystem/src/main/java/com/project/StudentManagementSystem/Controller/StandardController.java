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

import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Model.Subject;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.StandardService;

@Controller
public class StandardController 
{
	@Autowired
	StandardService standardService;
	
	@Autowired
	ClassService classService;
	
	@GetMapping("/loadStandardList")
	public String loadStandardList(Model model)
	{
		List<Standard> standard = standardService.getAllStandard();
		model.addAttribute("stdList", standard);
		return "StandardList";
	}
	
	@RequestMapping("/deleteStandard/{stid}")
	public String deleteStandard(@PathVariable("stid") int id)
	{
		standardService.deleteStandard(id);
		return "redirect:/loadStandardList";
	}
	
	@GetMapping("/loadStandardPage")
	public String loadStandardPage(Model model)
	{
		List<ClassModel> list= classService.getAllClassName();
		model.addAttribute("classname", list);
		model.addAttribute("standard", new Standard());
		return "Standard";
	}
	@PostMapping("/saveStandard")
	public String saveStandard(@ModelAttribute("standard") Standard standard)
	{
		standardService.saveStandard(standard);
		return "redirect:/loadStandardList";
	}

}
