package com.project.StudentManagementSystem.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.StudentManagementSystem.Model.Faculty;
import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Repository.FacultyRepository;
import com.project.StudentManagementSystem.Repository.StudentRepository;
import com.project.StudentManagementSystem.Service.AdminService;
import com.project.StudentManagementSystem.Service.FacultyService;
import com.project.StudentManagementSystem.Service.StudentService;

@Controller
public class LoginContoller 
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	FacultyService facultyService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	FacultyRepository facultyRepository;
	
	@GetMapping("/")
	public String Login()
	{
		return"redirect:/Login";
	}
	
	@GetMapping("/Login")
	public String LoadLoginPage()
	{
		return "LoginPage";
	}
	@PostMapping("/checkUser")
	public String checkUser(Model model,@RequestParam("type")String type,@RequestParam("email")String email,@RequestParam("pass")String pass)
	{
		if(type.equals("Student"))
		{
			boolean check = studentService.CheckLogin(email,pass);
			String  mail = studentService.findByMail(email);
			if(check)
			{
				return "redirect:/checkprofile/"+mail;
			}
			else
			{
				return "redirect:/Login";
			}
		}
		if(type.equals("Faculty"))
		{
			boolean check = facultyService.CheckLogin(email,pass);
			int id = facultyService.getIdByEmailAndPass(email,pass);
			if(check)
			{
				
//				int id =getFaculty.get(0).getFacultyid();
//				model.addAttribute("id", id);
				
				return "redirect:/faculty/loadHomePage/"+id;
			}
			else
			{
				return "redirect:/Login";
			}
		}
		 if(type.equals("Admin"))
		{
			 boolean check = adminService.CheckLogin(email,pass);
				if(check)
				{
					return "redirect:/home";
				}
				else
				{
					return "redirect:/Login";
				}
		}
		else
		 {
			return "redirect:/Login";
			 
		 }
		
	}
	@GetMapping("/checkprofile/{email}")
	public String edit(@PathVariable String email,Model model)
	{
		Student st = studentService.findByEmail(email);
		model.addAttribute("student", st);
		return "StudentSide";
	}
	@GetMapping("/getId/{email}")
	public String getId(@PathVariable String email,Model model)
	{
		Student st = studentService.findByEmail(email);
		model.addAttribute("student", st);	
		
	 model.addAttribute("attendence",st);
		return "AttendanceView";
	}
	@RequestMapping("/seeprofile/{email}")
	public String getIdForAttendance( @PathVariable String email,HttpServletRequest req)
	{
			String  mail = studentService.findByMail(email);
			
				return "redirect:/getId/"+mail;
		
	}
	

}
