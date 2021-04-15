package com.project.StudentManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>
{

	


}
