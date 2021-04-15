package com.project.StudentManagementSystem.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.StudentManagementSystem.Model.Exam;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Service.ExamService;
import com.project.StudentManagementSystem.Service.StandardService;

@Controller
public class ExamController 
{
	@Autowired
	ExamService examService;
	
	@Autowired
	StandardService standardService;
	
	@GetMapping("/loadExamList")
	public String loadExamList(Model model)
	{
		List<Exam> exam = examService.getAllExamList();
		model.addAttribute("examList", exam);
		return "ExamList";
	}
	
	@RequestMapping("/deleteExam/{examid}")
	public String deleteExam(@PathVariable("examid") int id)
	{
		examService.deleteExam(id);
		return "redirect:/loadExamList";
	}

	@GetMapping("/loadExamPage")
	public String loadExamPage(Model model)
	{
		List<Standard> list = standardService.getAllStandard();
		model.addAttribute("standard", list);
		model.addAttribute("exam",new Exam());
		return "Exam";
	}	 

	@PostMapping("/saveexam")
	public String uploadFile(@ModelAttribute("exam")Exam exam,@RequestParam("files") MultipartFile file) throws IOException
	{
		examService.saveExam(exam, file);
		return "redirect:/loadExamList";
	}

}
