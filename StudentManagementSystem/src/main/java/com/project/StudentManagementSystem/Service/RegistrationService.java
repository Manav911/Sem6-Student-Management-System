package com.project.StudentManagementSystem.Service;

import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.Registration;
@Service
public interface RegistrationService
{

	void registerSave(Registration registration);

	boolean checkLogin(Registration registration);

}
