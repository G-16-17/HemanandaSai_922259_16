package com.learn.springrestdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springrestdemo.model.Employee;
import com.learn.springrestdemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	@Override
	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee with id "+employee.getId()+"added successfully";
	}
}
