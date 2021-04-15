package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.Admin;
import com.project.StudentManagementSystem.Model.Faculty;
import com.project.StudentManagementSystem.Repository.AdminRepository;
import com.project.StudentManagementSystem.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService 
{
	
	@Autowired
	AdminRepository adminRepository;
	
	
	
	@Override
	public void addAdmin(Admin admin) {
		adminRepository.save(admin);
		
	}

	@Override
	public List<Admin> findAll()
	{
		List<Admin> adminlist = adminRepository.findAll();
		return adminlist;
	}

	@Override
	public void deleteAdmin(int id) {
		adminRepository.deleteById(id);
		
	}

	@Override
	public Admin finadmin(int id) {
		Admin admin = adminRepository.getOne(id);
		return admin;
	}

	@Override
	public boolean CheckLogin(String email, String pass)
	{
			Admin admin = adminRepository.findByAdminemail(email);
			if(admin == null)
			{
				return false;
			}
			if(email.equals(admin.getAdminemail()) && pass.equals( admin.getAdminpassword()))
			{
				return true;
			}
			else
			{
				return false;
			
		}
	}

	@Override
	public long countAdmin() {
		long totalAdmin = adminRepository.count();
		return totalAdmin;
	}

}
