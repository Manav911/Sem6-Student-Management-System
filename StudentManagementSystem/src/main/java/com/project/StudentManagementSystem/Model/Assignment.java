package com.project.StudentManagementSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Assignment 
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int assid;
		private String asstitle;
		private String assdescription;
		private String givenbyname;
		private String classname;
		private String subject;
		private String standard;
		private String assfilepath;
		public int getAssid() {
			return assid;
		}
		public void setAssid(int assid) {
			this.assid = assid;
		}
		public String getAsstitle() {
			return asstitle;
		}
		public void setAsstitle(String asstitle) {
			this.asstitle = asstitle;
		}
		public String getAssdescription() {
			return assdescription;
		}
		public void setAssdescription(String assdescription) {
			this.assdescription = assdescription;
		}
		public String getGivenbyname() {
			return givenbyname;
		}
		public void setGivenbyname(String givenbyname) {
			this.givenbyname = givenbyname;
		}
		public String getClassname() {
			return classname;
		}
		public void setClassname(String classname) {
			this.classname = classname;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getStandard() {
			return standard;
		}
		public void setStandard(String standard) {
			this.standard = standard;
		}
		public String getAssfilepath() {
			return assfilepath;
		}
		public void setAssfilepath(String assfilepath) {
			this.assfilepath = assfilepath;			
		}
		@Override
		public String toString() {
			return "Assignment [assid=" + assid + ", asstitle=" + asstitle + ", assdescription=" + assdescription
					+ ", givenbyname=" + givenbyname + ", classname=" + classname + ", subject=" + subject
					+ ", standard=" + standard + ", assfilepath=" + assfilepath + "]";
		}
		
		
		
}
