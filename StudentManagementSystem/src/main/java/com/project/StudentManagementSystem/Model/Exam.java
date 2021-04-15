package com.project.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Exam")
@Entity
public class Exam 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examid;
	private String examname;
	private String examdate;
	private String standard;
	private String examFilePath;
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getExamdate() {
		return examdate;
	}
	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getExamFilePath() {
		return examFilePath;
	}
	public void setExamFilePath(String examFilePath) {
		this.examFilePath = examFilePath;
	}
	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", examname=" + examname + ", examdate=" + examdate + ", standard=" + standard
				+ ", examFilePath=" + examFilePath + "]";
	}
	
	
	
	
	
}
