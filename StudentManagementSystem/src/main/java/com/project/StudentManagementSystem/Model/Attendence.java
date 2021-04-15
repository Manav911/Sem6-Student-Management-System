package com.project.StudentManagementSystem.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

import net.bytebuddy.implementation.bind.annotation.Super;

@Entity
public class Attendence implements Cloneable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String date;
	private String attendence;
	private String standard;
	private String classname;

	@ManyToMany
	List<Student> student = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAttendence() {
		return attendence;
	}

	public void setAttendence(String attendence) {
		this.attendence = attendence;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Attendence [id=" + id + ", date=" + date + ", attendence=" + attendence + ", standard=" + standard
				+ ", classname=" + classname + ", student=" + student + "]";
	}

	public Attendence() {

	}

	public Attendence(String date, String attendence, String standard, String classname, List<Student> student) {
		super();
		this.date = date;
		this.attendence = attendence;
		this.standard = standard;
		this.classname = classname;
		this.student = student;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}


}
