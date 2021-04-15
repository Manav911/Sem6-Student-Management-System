package com.project.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> 
{

}
