package com.project.StudentManagementSystem.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.StudentManagementSystem.Model.Attendence;
import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Repository.AttendenceRepository;
import com.project.StudentManagementSystem.Repository.StudentRepository;
import com.project.StudentManagementSystem.Service.AttendenceService;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.StudentService;

@Controller
public class AttendenceController
{
	@Autowired
	StudentService studentService;
	@Autowired
	AttendenceService attendenceService;
	
	@Autowired
	StandardService standardService;
	
	@Autowired
	ClassService classService;
	
	@Autowired
	AttendenceRepository attendenceRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/AttFilter")
	public String attendenceFilter(Model model)
	{
		List<Standard> standardList = standardService.getAllStandard();
		List<ClassModel> classList = classService.getAllClassName();
		model.addAttribute("standard", standardList);
		model.addAttribute("class", classList);
		model.addAttribute("AttFilter", new Attendence());
		return "AttFilter";
	}
	@RequestMapping("/attendance")
	public ModelAndView attendances(Model model,@RequestParam("standard")String standard,
			@RequestParam("classname") String classname, @RequestParam("date")String date)
	{
		
		List<Student> list = studentService.getAllByStandardAndClass(standard,classname);
		Attendence attendence = new Attendence();
		attendence.setStudent(list);
		
		return new ModelAndView("attendance", "attendence", attendence);
	}
	
	@RequestMapping("/saveAttendance/{id}/{standard}/{classname}/{date}")
	public String saveAttendance(@PathVariable int id,@PathVariable("standard")String standard,
			@PathVariable("classname")String classname,@PathVariable("date") String date,@ModelAttribute Attendence attendence)
	{
		
		Student student = studentService.find(id);
		//attendence.setStudent(student);
		//student.setAttendence(attendence);
		//attendence.setAttendence("Present");
		attendence.setDate(date);
		attendence.setStandard(standard);
		attendence.setClassname(classname);
		attendenceService.saveAttendance(attendence);
		
		
		
		//System.out.println("Data "+attendence);
//		Student st = new Student();
//		st.setAttendence(attendence);
//		attendence.setStudent(st);
//		attendenceService.saveAttendance(attendence);
		return "redirect:/home";
		
	}
	@RequestMapping("/saveAttendanceOfAbsent/{id}/{standard}/{classname}/{date}")
	public String saveAttendanceOfAbsent(@PathVariable int id,@PathVariable("standard")String standard,
			@PathVariable("classname")String classname,@PathVariable("date") String date,@ModelAttribute Attendence attendence)
	{
		
		Student student = studentService.find(id);
		//attendence.setStudent(student);
		//student.setAttendence(attendence);
		//attendence.setAttendence("Absent");
		attendence.setDate(date);
		attendence.setClassname(classname);
		attendence.setStandard(standard);
		attendenceService.saveAttendance(attendence);
		
		
		
		//System.out.println("Data "+attendence);
//		Student st = new Student();
//		st.setAttendence(attendence);
//		attendence.setStudent(st);
//		attendenceService.saveAttendance(attendence);
		return "redirect:/home";
		
	}
	@RequestMapping(value = "/saveAtt/{date}",method = RequestMethod.POST)
	public String saaveAtt(@ModelAttribute("attendance") Attendence attendence,@PathVariable("date") String date) throws CloneNotSupportedException
	{
//		System.out.println(attendence);
//		System.out.println(attendence.getStudent());
//		System.out.println(attendence.getAttendence());
		List<Student> students =  attendence.getStudent();
		String str = attendence.getAttendence();
		String[] arrOfStr = str.split(",");
		List<String> list = new ArrayList<String>();
		for(String a  : arrOfStr)
		{
			list.add(a);
		}
		int a = 0;
			
			for(Student student : students)
			{
				List<Student> st =studentRepository.findUsingId(student.getStudentid());
				attendence.setStudent(st);
				attendence.setClassname(student.getClassname());
				attendence.setStandard(student.getStandard());
				attendence.setAttendence(list.get(a));
				a++;
				attendence.setDate(date);
				Attendence att = (Attendence) attendence.clone();
				attendenceRepository.save(att);
				
				
			}
			return "redirect:/home";
	}

}
