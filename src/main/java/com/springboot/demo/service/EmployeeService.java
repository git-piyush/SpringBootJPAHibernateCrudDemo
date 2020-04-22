package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.Employee;
import com.springboot.demo.modelresponse.EmployeeModelResponse;

public interface EmployeeService {

    public EmployeeModelResponse findAll();
	
	public EmployeeModelResponse findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
