package com.project.StudentManagementSystem.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.project.StudentManagementSystem.Model.Exam;

public interface ExamService 
{
	public void saveExam(Exam exam, MultipartFile file) throws IOException;

	public List<Exam> getAllExamList();

	public void deleteExam(int id);
}
