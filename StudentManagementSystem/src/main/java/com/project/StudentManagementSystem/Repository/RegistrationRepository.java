package com.project.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.StudentManagementSystem.Model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration	, Integer>
{

	Registration findByUsername(String string);

}
