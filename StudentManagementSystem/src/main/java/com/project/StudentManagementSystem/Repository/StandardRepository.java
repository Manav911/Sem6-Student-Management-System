package com.project.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Standard;

@Repository
public interface StandardRepository extends JpaRepository<Standard, Integer>
{
	

}
