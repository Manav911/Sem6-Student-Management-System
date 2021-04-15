package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.Attendence;
import com.project.StudentManagementSystem.Repository.AttendenceRepository;
import com.project.StudentManagementSystem.Service.AttendenceService;

@Service
public class AttendenceServiceImpl implements AttendenceService
{
	@Autowired
	AttendenceRepository attendenceRepository;

	@Override
	public void saveAttendance(Attendence attendence) 
	{
		attendenceRepository.save(attendence);
	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Attendence> getallattendence(int studentid, String startdate, String enddate) 
	{
		List<Attendence> attendance = attendenceRepository.getAllAbsent(studentid, startdate, enddate);
		return attendance;
		
	}
	@Override
	public List<Attendence> getallabsentattendence(int studentid, String startdate, String enddate) 
	{
		List<Attendence> attendance = attendenceRepository.getAllAbsent(studentid, startdate, enddate);
		return attendance;
	}

	

}
