package com.project.StudentManagementSystem.Service;

import java.util.List;

import com.project.StudentManagementSystem.Model.ClassModel;

public interface ClassService {

	

	void saveClass(ClassModel classModel);

	List<ClassModel> getAllClassName();

	List<ClassModel> getAllClassList();

	void deleteClass(int id);

}
