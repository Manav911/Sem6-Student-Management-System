package com.project.StudentManagementSystem.Service;

import java.util.List;

import com.project.StudentManagementSystem.Model.Subject;

public interface SubjectService 
{
	//save Subject
	void saveSubject(Subject subject);

	List<Subject> getAllSubjectName();

	List<Subject> getSubjectList();

	void deleteSubject(int id);



}
