package com.project.StudentManagementSystem.Service;

import java.util.List;
import com.project.StudentManagementSystem.Model.Student;

public interface StudentService 
{
	public void addStudent(Student student);
	String home();
  	void delete(int studentid);
  	public Student fetchData(int studentid);
  	List<Student> getAll();
	public Student find(int id);
	List<Student> getAllByStandard(String standard);
	
	
	public List<Student> getAllByStandardAndClass(String standard, String classname);
	
	//Login Contoller
	public boolean CheckLogin(String email, String pass);
	
	
	public long countStudent();
	public String findByMail(String email);
	public Student findByEmail(String email);
}
