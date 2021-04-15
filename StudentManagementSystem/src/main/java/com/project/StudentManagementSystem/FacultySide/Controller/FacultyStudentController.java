package com.project.StudentManagementSystem.FacultySide.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Service.AdminService;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.FacultyService;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.StudentService;

@Controller
@RequestMapping("/faculty")
public class FacultyStudentController 
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	StandardService standardService;
	
	@Autowired
	ClassService classService;
	
	
	@RequestMapping("/getlist/{id}")
	public String getList(Model model,@PathVariable("id")int id)
	{
		List<Student> list = studentService.getAll();	
		model.addAttribute("st", list);
		return "list";
	}
	@RequestMapping("/delete/{studentid}/{id}")
	public String deleteStudent(@PathVariable("studentid") int studentid,@PathVariable("id") int id)
	{
		studentService.delete(studentid);
		return "redirect:/faculty/getlist/"+id;
	}
	
	

}
