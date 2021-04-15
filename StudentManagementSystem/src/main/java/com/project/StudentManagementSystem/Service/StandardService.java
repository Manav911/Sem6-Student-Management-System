package com.project.StudentManagementSystem.Service;

import java.util.List;

import com.project.StudentManagementSystem.Model.Standard;

public interface StandardService
{

	void saveStandard(Standard standard);

	List<Standard> getAllStandard();


	void deleteStandard(int id);



}
