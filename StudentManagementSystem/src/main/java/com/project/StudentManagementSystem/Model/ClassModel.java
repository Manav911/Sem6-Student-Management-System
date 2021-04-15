package com.project.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "class")
@Entity
public class ClassModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classid;
	
	private String classname;
	private String classstandard;
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getClassstandard() {
		return classstandard;
	}
	public void setClassstandard(String classstandard) {
		this.classstandard = classstandard;
	}
	@Override
	public String toString() {
		return "ClassModel [classid=" + classid + ", classname=" + classname + ", classstandard=" + classstandard + "]";
	}
	
	
	
	
	
	

	

}
