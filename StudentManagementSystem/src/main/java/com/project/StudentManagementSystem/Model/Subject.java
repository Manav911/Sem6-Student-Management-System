package com.project.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectid;
	private String subname;
	private String substandard;
	
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getSubstandard() {
		return substandard;
	}
	public void setSubstandard(String substandard) {
		this.substandard = substandard;
	}
	@Override
	public String toString() {
		return "Subject [subjectid=" + subjectid + ", subname=" + subname + ", substandard=" + substandard + "]";
	}
	
	
	
	

}
