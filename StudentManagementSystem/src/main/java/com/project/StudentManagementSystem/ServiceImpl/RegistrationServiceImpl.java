package com.project.StudentManagementSystem.ServiceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.Registration;
import com.project.StudentManagementSystem.Repository.RegistrationRepository;
import com.project.StudentManagementSystem.Service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService 
{

	@Autowired
	RegistrationRepository registrationRepository;
	@Override
	public void registerSave(Registration registration) 
	{
		registrationRepository.save(registration);

		
	}
	@Override
	@Transactional
	public boolean checkLogin(Registration registration) 
	{
		Registration registration2 =registrationRepository.findByUsername(registration.getUsername());
		String login_user = registration.getUsername(); 
		String check_user = registration2.getUsername();
		
		String login_pass = registration.getPassword();
		String check_pass = registration2.getPassword();
		
		if(login_user.equals(check_user) &&  login_pass.equals(check_pass) )
		{
			
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
