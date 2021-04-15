package com.project.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Admin;
import com.project.StudentManagementSystem.Model.Faculty;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{

	Admin findByAdminemail(String email);

	

}
