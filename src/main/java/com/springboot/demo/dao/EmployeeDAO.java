package com.springboot.demo.dao;

import java.util.List;

import com.springboot.demo.entity.Employee;
import com.springboot.demo.modelresponse.EmployeeModelResponse;

public interface EmployeeDAO {

    public EmployeeModelResponse findAll();
	
	public EmployeeModelResponse findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
