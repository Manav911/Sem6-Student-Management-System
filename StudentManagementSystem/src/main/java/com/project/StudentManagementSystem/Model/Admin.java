package com.project.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adminname;
	private String adminemail;
	private String admingender;
	private String adminmobilenumber;
	private String adminpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public String getAdmingender() {
		return admingender;
	}
	public void setAdmingender(String admingender) {
		this.admingender = admingender;
	}
	public String getAdminmobilenumber() {
		return adminmobilenumber;
	}
	public void setAdminmobilenumber(String adminmobilenumber) {
		this.adminmobilenumber = adminmobilenumber;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminname=" + adminname + ", adminemail=" + adminemail + ", admingender="
				+ admingender + ", adminmobilenumber=" + adminmobilenumber + ", adminpassword=" + adminpassword + "]";
	}
	
}
