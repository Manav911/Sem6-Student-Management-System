package com.project.StudentManagementSystem.StudentSide.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.project.StudentManagementSystem.Model.Attendence;
import com.project.StudentManagementSystem.Service.AttendenceService;
import com.project.StudentManagementSystem.Service.ClassService;
import com.project.StudentManagementSystem.Service.StandardService;
import com.project.StudentManagementSystem.Service.StudentService;

@Controller
public class StudentAttendenceController {
		@Autowired
		StudentService studentService;
		@Autowired
		AttendenceService attendenceService;
		@Autowired
		StandardService standardService;
		@Autowired
		ClassService classService;
		

//		
//@RequestMapping("/present/{studentid}")
//public String gotoPresent(@PathVariable("studentid") int studentid, Model model)
//{
//	Student st = studentService.find(studentid);
//	model.addAttribute("student", st);	
//	
//						return "present";
//}
//
//@RequestMapping("/absent/{studentid}")
//public String gotoAbsent(@PathVariable("studentid") int studentid, Model model)
//{
//	Student st = studentService.find(studentid);
//	model.addAttribute("student", st);	
//	
//						return "absent";
//}

//@RequestMapping("/gotolist")
//public String gotolist(@RequestParam("studentid") int studentid,@RequestParam("startdate")  String startdate,@RequestParam("enddate") String enddate)
//{
//			String sd = startdate;
//			String ed = enddate;
//			int studenid = studentService.findbyStudentId(studentid);
//			return "redirect:/getattlist/"+studenid+"/"+sd+"&"+ed;
//}
@GetMapping("getId/getattlist/{studentid}/{startdate}&{enddate}")
public String getList(Model model,@PathVariable int studentid,@PathVariable String startdate,@PathVariable String enddate)
{
			List<Attendence> attendences = attendenceService.getallattendence(studentid, startdate, enddate);
			model.addAttribute("allattendance", attendences);
			return "attendancelist";
}
	
		
//		@RequestMapping("/waytolist")
//		public String gotoAbsentlist(@RequestParam("studentid") int studentid,@RequestParam("startdate")String startdate,@RequestParam("enddate")String enddate)
//		{
//			String sd = startdate;
//			String ed = enddate;
//			int studenid = studentService.findbyStudentId(studentid);
//			return "redirect:/getabsentlist/"+studenid+"/"+sd+"&"+ed;
//			//return "home";
//		}
		@GetMapping("getId/getabsentlist/{studentid}/{startdate}&{enddate}")
		public String getAbsentList(Model model,@PathVariable int studentid,@PathVariable String startdate,@PathVariable String enddate)
		{
			List<Attendence> attendences = attendenceService.getallabsentattendence(studentid, startdate, enddate);
			model.addAttribute("allattendance", attendences);
			return "attendancelist";
		}

	}

