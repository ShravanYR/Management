package com.pcms.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pcms.model.Employee;
import com.pcms.repo.Employeerepository;


@Service
public class empservices {
	
	
	
	/**
	 * to get employeess data from database named pcmsdb
	 */
	@Autowired
	private  Employeerepository employeeRepository;
	
	public List<Employee> getAllEmployees() {

		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}
	
	/**
	 * to create an employee and save it pcmsdb
	 * @param employee
	 * @return
	 */

	
	
}
