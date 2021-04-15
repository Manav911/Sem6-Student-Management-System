package com.project.StudentManagementSystem.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.StudentManagementSystem.Model.Assignment;
import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Faculty;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Model.Subject;
import com.project.StudentManagementSystem.Service.AssignmentService;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.FacultyService;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.SubjectService;



@Controller
public class AssignmentController 
{
	
	
	@Autowired
	AssignmentService assignmentService;
	
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	SubjectService subjectService;
	
	@Autowired
	ClassService classService;
	
	@Autowired
	StandardService standardService;
	

	
	@GetMapping("/loadAssignmentList")
	public String loadAssignmentList(Model model)
	{
		List<Assignment> assignment = assignmentService.getAllAssignments();
		model.addAttribute("assignmentList", assignment);
		return "AssignmentList";
	}
	
	@RequestMapping("/deleteAssignment/{assid}")
	public String deleteAssignment(@PathVariable("assid") int id)
	{
		assignmentService.deleteAssignment(id);
		return"redirect:/loadAssignmentList";
	}
	@GetMapping("/loadAssignmentUpload")
	public String loadAssUploadPage(Model model)
	{
		List<Faculty> facultyList = facultyService.findAll();
		List<Subject> subjectList = subjectService.getAllSubjectName();
		List<ClassModel> classList = classService.getAllClassName();
		List<Standard> standardList = standardService.getAllStandard();
		
		model.addAttribute("UploadAssignment", new Assignment());
		model.addAttribute("faculty", facultyList);
		model.addAttribute("subject", subjectList);
		model.addAttribute("class", classList);
		model.addAttribute("standard", standardList);
		return "AssignmentUpload";
	}
	@RequestMapping("/UploadAssignment")
	public String UploadAssignment(@ModelAttribute("UploadAssignment") Assignment assignment,@RequestParam("file") MultipartFile file) throws IOException
	{
		System.out.println(file);
		assignmentService.uploadAssignment(assignment,file);
		return "redirect:/loadAssignmentList";
	}

}
