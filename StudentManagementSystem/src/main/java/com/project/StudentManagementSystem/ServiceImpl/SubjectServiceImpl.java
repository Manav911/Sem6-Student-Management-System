package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.Subject;
import com.project.StudentManagementSystem.Repository.SubjectRepository;
import com.project.StudentManagementSystem.Service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService 
{
	@Autowired
	SubjectRepository subjectRepository;

	//save Subject
	@Override
	public void saveSubject(Subject subject) 
	{
		subjectRepository.save(subject);
		
	}

	@Override
	public List<Subject> getAllSubjectName() {
		List<Subject> list = subjectRepository.findAll();
		return list;
	}

	@Override
	public List<Subject> getSubjectList() {
		List<Subject> subject = subjectRepository.findAll();
		return subject;
	}

	@Override
	public void deleteSubject(int id) {
		subjectRepository.deleteById(id);
		
	}

}
