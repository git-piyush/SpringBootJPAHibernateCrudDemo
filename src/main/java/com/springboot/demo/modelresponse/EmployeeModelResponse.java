package com.springboot.demo.modelresponse;

import java.util.List;

import com.springboot.demo.entity.Employee;

public class EmployeeModelResponse {

	public List<Employee> employeeList;

	public EmployeeModelResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeModelResponse(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
}
