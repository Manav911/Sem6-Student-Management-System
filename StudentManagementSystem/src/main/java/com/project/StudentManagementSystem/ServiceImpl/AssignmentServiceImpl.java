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
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.project.StudentManagementSystem.Model.Assignment;
import com.project.StudentManagementSystem.Repository.AssignmentRepository;
import com.project.StudentManagementSystem.Service.AssignmentService;

@Service
public class AssignmentServiceImpl implements AssignmentService 
{

	@Autowired
	AssignmentRepository assignmentRepository;
	
	private final String UPLOAD_DIR = "D:\\Data";
	
	@Override
	public void uploadAssignment(Assignment assignment, MultipartFile file) throws IOException 
	{
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Path filePath = Paths.get(UPLOAD_DIR+File.separator+fileName);
		Files.copy(file.getInputStream(),filePath, StandardCopyOption.REPLACE_EXISTING);
		assignment.setAssfilepath((filePath.toString()));
		assignmentRepository.save(assignment);
	}

	@Override
	public List<Assignment> getAllAssignments()
	{
		List<Assignment> assignment = assignmentRepository.findAll();
		return assignment;
	}

	@Override
	public void deleteAssignment(int id) {
		assignmentRepository.deleteById(id);
		
	}

}

