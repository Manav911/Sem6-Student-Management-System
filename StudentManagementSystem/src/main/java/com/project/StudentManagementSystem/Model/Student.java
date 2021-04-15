package com.project.StudentManagementSystem.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Table(name = "student")
@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	private String studentname;
	private String classname;
	private String gender;
	private String standard;
	private String mobilenumber;
	private String email;
	private String bdate;
	private String address;
	private String password;
	@ManyToMany(mappedBy = "student",fetch = FetchType.LAZY)
	List<Attendence> attendence = new ArrayList<>();
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Attendence> getAttendence() {
		return attendence;
	}
	public void setAttendence(List<Attendence> attendence) {
		this.attendence = attendence;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", classname=" + classname
				+ ", gender=" + gender + ", standard=" + standard + ", mobilenumber=" + mobilenumber + ", email="
				+ email + ", bdate=" + bdate + ", address=" + address + ", password=" + password + ", attendence="
				+ attendence + "]";
	}
	
	public Student()
	{
		
	}
	public Student(int studentid, String studentname, String classname, String gender, String standard,
			String mobilenumber, String email, String bdate, String address, String password,
			List<Attendence> attendence) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.classname = classname;
		this.gender = gender;
		this.standard = standard;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
		this.password = password;
		this.attendence = attendence;
	} 
	
	
	
	
	
}
