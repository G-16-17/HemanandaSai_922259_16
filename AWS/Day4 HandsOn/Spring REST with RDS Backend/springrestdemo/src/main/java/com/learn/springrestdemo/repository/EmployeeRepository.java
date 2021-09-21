package com.learn.springrestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springrestdemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
