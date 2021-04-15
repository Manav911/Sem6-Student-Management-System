package com.project.StudentManagementSystem.Service;

import java.util.List;

import com.project.StudentManagementSystem.Model.Admin;

public interface AdminService 
{
	public void addAdmin(Admin admin);
	List<Admin> findAll();
	void deleteAdmin(int adminid);
	public Admin finadmin(int adminid);
	
	//Login
	public boolean CheckLogin(String email, String pass);
	
	public long countAdmin();
}
