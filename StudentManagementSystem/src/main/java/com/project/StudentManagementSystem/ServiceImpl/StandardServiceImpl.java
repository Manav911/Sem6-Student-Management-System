package com.project.StudentManagementSystem.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.Model.Standard;
import com.project.StudentManagementSystem.Repository.StandardRepository;
import com.project.StudentManagementSystem.Service.StandardService;

@Service
public class StandardServiceImpl implements StandardService
{
	@Autowired
	StandardRepository standardRepository;

	@Override
	public void saveStandard(Standard standard) 
	{
		standardRepository.save(standard);

		
	}

	@Override
	public List<Standard> getAllStandard() {
		List<Standard> list = standardRepository.findAll();
		return list;
	}

	@Override
	public void deleteStandard(int id) {
		standardRepository.deleteById(id);
		
	}

	

}
