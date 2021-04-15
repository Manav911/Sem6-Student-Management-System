package com.project.StudentManagementSystem.FacultySide.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.StudentManagementSystem.Model.Attendence;
import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Service.AttendenceService;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.StudentService;

@Controller
@RequestMapping("/faculty")
public class FacultyAttendenceContoller 
{
	@Autowired
	StudentService studentService;
	@Autowired
	AttendenceService attendenceService;
	
	@Autowired
	StandardService standardService;
	
	@Autowired
	ClassService classService;
	
	@GetMapping("/AttFilter/{id}")
	public String attendenceFilter(Model model,@PathVariable int id)
	{
		List<Standard> standardList = standardService.getAllStandard();
		List<ClassModel> classList = classService.getAllClassName();
		model.addAttribute("standard", standardList);
		model.addAttribute("class", classList);
		model.addAttribute("AttFilter", new Attendence());
		return "AttFilter";
	}
	@RequestMapping("/attendance")
	public String attendances(Model model,@RequestParam("standard")String standard,
			@RequestParam("classname") String classname, @RequestParam("date")String date)
	{
		
		List<Student> list = studentService.getAllByStandardAndClass(standard,classname);
		model.addAttribute("attlist", list);
		model.addAttribute("attendance", new Attendence());
		return "attendance";
	}

}
