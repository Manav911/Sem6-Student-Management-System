package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.ClassModel;
import com.project.StudentManagementSystem.Repository.ClassRepository;
import com.project.StudentManagementSystem.Service.ClassService;

@Service
public class ClassServiceImpl implements ClassService
{

	@Autowired
	ClassRepository classRepository;
	@Override
	public void saveClass(ClassModel classModel)
	{
		classRepository.save(classModel);
		
	}
	@Override
	public List<ClassModel> getAllClassName() 
	{
		List<ClassModel> list = classRepository.findAll();
		return list;
	}
	@Override
	public List<ClassModel> getAllClassList() {
		List<ClassModel> classModel = classRepository.findAll();
		return classModel;
	}
	@Override
	public void deleteClass(int id) {
		classRepository.deleteById(id);
		
	}
	

}
