package com.project.StudentManagementSystem.Service;

import java.util.List;

import com.project.StudentManagementSystem.Model.Faculty;

public interface FacultyService 
{
	public void saveFaculty(Faculty faculty);
	List<Faculty> findAll();
	void deleteFaculty(int facultyid);
	public Faculty findfaculty(int facultyid);
	
	//Login
	public boolean CheckLogin(String email, String pass);
	
	public long countFaculty();
	
	public int getIdByEmailAndPass(String email, String pass);
	

}
