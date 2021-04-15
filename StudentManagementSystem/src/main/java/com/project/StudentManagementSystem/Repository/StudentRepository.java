package com.project.StudentManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

	List<Student> findAllByStandard(String standard);
	
	//@Query(value="select * from student s LEFT JOIN attendence a ON a.standard = ?1 and a.classname = ?2 and a.date = ?3",nativeQuery = true)
	
	//@Query(value="select * from student s LEFT JOIN attendence a ON s.studentid = a.student_studentid where a.date is NULL OR (a.standard = ?1 AND a.classname = ?2) ",nativeQuery = true)
	List<Student> findAllByStandardAndClassname(String standard, String classname);

	//Login
	Student findByEmail(String email);

	@Query(value = "Select * from student where studentid =?1",nativeQuery = true )
	List<Student> findUsingId(int studentid);



	
	
}
