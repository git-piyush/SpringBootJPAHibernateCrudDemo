package com.springboot.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Employee;
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
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
