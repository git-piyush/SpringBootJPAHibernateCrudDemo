package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Employee;
import com.springboot.demo.modelresponse.EmployeeModelResponse;
import com.springboot.demo.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
		
		private EmployeeService employeeService=null;
	
		@Autowired
		public EmployeeController(EmployeeService employeeService) {
			super();
			this.employeeService = employeeService;
		}
		// expose "/employees" and return list of employees
		@GetMapping("/getall")
		public EmployeeModelResponse findAll() {
			EmployeeModelResponse modelResponse = new EmployeeModelResponse();
			modelResponse = employeeService.findAll();
			return modelResponse;
		}
}
