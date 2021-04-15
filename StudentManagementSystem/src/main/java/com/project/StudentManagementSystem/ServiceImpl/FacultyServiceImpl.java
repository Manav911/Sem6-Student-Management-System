package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.StudentManagementSystem.Model.Faculty;
import com.project.StudentManagementSystem.Model.Student;
import com.project.StudentManagementSystem.Repository.FacultyRepository;
import com.project.StudentManagementSystem.Service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService
{
	@Autowired
	FacultyRepository facultyRepository;

	@Override
	public void saveFaculty(Faculty faculty)
	{
			facultyRepository.save(faculty);
	}



	@Override
	public List<Faculty> findAll() 
	{
		List<Faculty> facultylist = facultyRepository.findAll();
		return facultylist;
	}

	@Override
	public void deleteFaculty(int facultyid) 
	{
		facultyRepository.deleteById(facultyid);
	}

	@Override
	public Faculty findfaculty(int fid) 
	{
		Faculty fst = facultyRepository.getOne(fid);
		return fst;
	}

	
	
	//Login
	@Override
	public boolean CheckLogin(String email, String pass) 
	{
		
		Faculty faculty = facultyRepository.findByEmail(email);
		if(faculty == null)
		{
			return false;
		}
		if(email.equals(faculty.getEmail()) && pass.equals( faculty.getPassword()))
		{
			return true;
		}
		else
		{
			return false;
		
	}
}



	@Override
	public long countFaculty() 
	{
		long totalFaculty = facultyRepository.count();
		return totalFaculty;
	}



	@Override
	public int getIdByEmailAndPass(String email, String pass) 
	{
		Faculty faculty = facultyRepository.findByEmailAndPassword(email,pass);
		int id = faculty.getFacultyid();
		return id;
	}
}