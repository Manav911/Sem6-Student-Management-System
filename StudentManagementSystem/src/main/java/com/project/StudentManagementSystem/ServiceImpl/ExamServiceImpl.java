package com.project.StudentManagementSystem.ServiceImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.StudentManagementSystem.Model.Exam;
import com.project.StudentManagementSystem.Repository.ExamRepository;
import com.project.StudentManagementSystem.Service.ExamService;

@Service
public class ExamServiceImpl  implements ExamService
{

	@Autowired
	ExamRepository examRepository;
	
	
	private final String UPLOAD_DIR = "D:\\Exam";


	@Override
	public void saveExam(Exam exam, MultipartFile file) throws IOException
	{
		String filename = file.getOriginalFilename();
		Path path = Paths.get(UPLOAD_DIR + File.separator + filename);
		Files.copy(file.getInputStream(), path ,StandardCopyOption.REPLACE_EXISTING);
		//	Exam exam1 = new Exam(filename, file.getContentType(), file.getBytes());
			exam.setExamFilePath(path.toString());
			examRepository.save(exam);

	}


	@Override
	public List<Exam> getAllExamList() {
		List<Exam> exam = examRepository.findAll();
		return exam;
	}


	@Override
	public void deleteExam(int id) {
		examRepository.deleteById(id);		
	}

//
//	@Override
//	public void saveExam(Exam exam, MultipartFile file) throws IOException 
//	{
//		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//		Path path = Paths.get(UPLOAD_DIR + File.separator + fileName);
//		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
//		exam.setExamFilePath(path.toString());
//		examRepository.save(exam);
//	}

	

}
