package com.springboot.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Employee;
import com.springboot.demo.modelrequest.EmployeeModelRequest;
import com.springboot.demo.modelresponse.EmployeeModelResponse;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public EmployeeModelResponse findAll() {
		EmployeeModelResponse employeeResponse = new EmployeeModelResponse();
		Query query = entityManager.createQuery("from Employee");
		List<Employee> employeeList = query.getResultList();
		employeeResponse.setEmployeeList(employeeList);
		return employeeResponse;
	}

	@Override
	public EmployeeModelResponse findById(int theId) {
		EmployeeModelResponse employeeResponse = new EmployeeModelResponse();
		Employee employee = entityManager.find(Employee.class, theId);
		employeeResponse.setEmployee(employee);
		return employeeResponse;
	}

	@Override
	@Transactional
	public EmployeeModelResponse save(EmployeeModelRequest modelRequest) {
		EmployeeModelResponse employeeResponse = new EmployeeModelResponse();
		Employee newEmployee = new Employee();
		newEmployee.setFirstName(modelRequest.getFirstName());
		newEmployee.setLastName(modelRequest.getLastName());
		newEmployee.setEmail(modelRequest.getEmail());
		try {
			entityManager.persist(newEmployee);
			employeeResponse.setEmployee(newEmployee);
			employeeResponse.setErrorDec("Below Employee added");
			return employeeResponse;
		} catch (Exception e) {
			// TODO: handle exception
		}
		employeeResponse.setErrorDec("Employee addition failed");
		return employeeResponse;
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
