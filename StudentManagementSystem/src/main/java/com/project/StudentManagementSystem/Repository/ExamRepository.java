package com.project.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StudentManagementSystem.Model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer>
{

}
