package com.learn.springrestdemo.service;

import java.util.List;

import com.learn.springrestdemo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	String addEmployee(Employee employee);
}
