package com.project.StudentManagementSystem.Service;

import java.util.List;

import com.project.StudentManagementSystem.Model.Attendence;

public interface AttendenceService
{

	void saveAttendance(Attendence attendence);
	void findAll();
	List<Attendence> getallattendence(int studentid, String startdate, String enddate);
	List<Attendence> getallabsentattendence(int studentid, String startdate, String enddate);
	

}
