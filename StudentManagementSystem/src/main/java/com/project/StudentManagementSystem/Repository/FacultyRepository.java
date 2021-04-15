package com.project.StudentManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Faculty;
import com.project.StudentManagementSystem.Model.Student;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer>
{

	Faculty findByEmail(String email);

	Faculty findByEmailAndPassword(String email, String pass);




}
