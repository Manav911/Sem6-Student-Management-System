package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Repository.StudentRepository;
import com.project.StudentManagementSystem.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{



		@Autowired
		StudentRepository studentRepository;
		@Override
		public void addStudent(Student student)
		{
			//Student student = DtoToModel(dto);
			studentRepository.save(student);
		}

//		public Student DtoToModel(StudentDto dto)
//		{
//			Student student = new Student();
//			student.setStudentname(dto.getStudentname());
//			student.setAddress(dto.getAddress());
//			student.setEmail(dto.getEmail());
//			student.setMobilenumber(dto.getMobilenumber());
//			student.setSemester(dto.getSemester());
//			student.setGender(dto.getGender());
//			student.setBdate(dto.getBdate());
//			student.setStream(dto.getStream());
//			student.setClassname(dto.getClassname());
//			return student;
//			
//		}

		
		@Override
		public String home()
		{
			return "home";
		}
		@Override
		public List<Student> getAll()
		{
			 List<Student> list =  studentRepository.findAll();
			 return list;
		}
		@Override
		public void delete(int studentid)
		{
			studentRepository.deleteById(studentid);
		}
		@Override
		public Student fetchData(int studentid)
		{
			Student student = studentRepository.getOne(studentid);
			return student;
		}

		@Override
		public Student find(int id)
		{
			Student st = studentRepository.getOne(id);
			return st;
		}

		//attendence
		@Override
		public List<Student> getAllByStandard(String standard)
		{
			List<Student> list = studentRepository.findAllByStandard(standard);
			return list;
		}

		@Override
		public List<Student> getAllByStandardAndClass(String standard, String classname) {
			
			List<Student> list = studentRepository.findAllByStandardAndClassname(standard,classname);
			return list;
		}

		@Override
		public boolean CheckLogin(String email, String pass)
		{
			Student student = studentRepository.findByEmail(email);
			if(student == null)
			{
				return false;
			}
			if(email.equals(student.getEmail()) && pass.equals( student.getPassword()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		@Override
		public long countStudent() {
			long totalStudent = studentRepository.count();
			return totalStudent;
		}

		@Override
		public Student findByEmail(String email) 
		{
			Student sp = studentRepository.findByEmail(email);
			return sp;
		}

		@Override
		public String findByMail(String email)
		{
			Student student = studentRepository.findByEmail(email);
			email = student.getEmail();
			return email;
		}
}
