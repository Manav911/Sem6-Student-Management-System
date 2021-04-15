package com.project.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Standard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stid;
	private String standard;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Standard [stid=" + stid + ", standard=" + standard + "]";
	}
	
	
	

}
