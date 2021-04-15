package com.project.StudentManagementSystem.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.project.StudentManagementSystem.Model.Assignment;

public interface AssignmentService {

	void uploadAssignment(Assignment assignment, MultipartFile file) throws IOException;

	List<Assignment> getAllAssignments();

	void deleteAssignment(int id);

	

}
