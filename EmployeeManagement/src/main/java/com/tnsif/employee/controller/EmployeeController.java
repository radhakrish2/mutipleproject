package com.tnsif.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.employee.model.Employee;
import com.tnsif.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepository;
	
	public List<Employee> getAllEmployees()
	{
		return empRepository.findAll();
	}
	
	
	
}
