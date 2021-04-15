package com.project.StudentManagementSystem.Controller;

import java.util.List;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.
springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Service.AdminService;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.FacultyService;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.StudentService;

@Controller
public class StudentController 
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
	
	
	 @GetMapping("/addstudent")
     public String reg(Model model) 
	 {
		 List<Standard> standardList = standardService.getAllStandard();
		 List<ClassModel> classList = classService.getAllClassName();
		 model.addAttribute("standard", standardList);
		 model.addAttribute("class", classList);
		 model.addAttribute("student", new Student());
		 return "newstudent";
     }
	
	@PostMapping("/save")
	public String add(@ModelAttribute("student") Student student) throws ParseException
	{
		studentService.addStudent(student);
		return "redirect:/Login";
	}
	/*
	 * @GetMapping("/get-student-list") public ResponseEntity<?> getStudents() {
	 * return studentService.getStudentList(); }
	 */
	@RequestMapping("/home")
	public String home(Model model)
	{
		long student = studentService.countStudent();
		long admin = adminService.countAdmin();
		long faculty = facultyService.countFaculty();
		model.addAttribute("admin", admin);
		model.addAttribute("faculty", faculty);
		model.addAttribute("student", student);
		return "home";
	}
	
	@RequestMapping("/getlist")
	public String getList(Model model)
	{
		List<Student> list = studentService.getAll();	
		model.addAttribute("st", list);
		return "list";
	}
	@GetMapping("/delete/{id}")
	public String deletebill(@PathVariable int id)
	{
		studentService.delete(id);
		return "redirect:/getlist";
	}
	
	
	@RequestMapping("/getall")
	public String findAll()
	{	
		return "list";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model model)
	{
		Student st = studentService.find(id);
		model.addAttribute("student", st);
		return "newstudent";
	}


}
