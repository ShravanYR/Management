package com.pcms.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.pcms.constants.empconstants;
import com.pcms.model.Employee;
import com.pcms.repo.Employeerepository;
import com.pcms.services.empservices;





@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class Empcontrollers {
	  
	@Autowired
	private  empservices empservice;
	@Autowired
	private  Employeerepository employeeRepository;
	
	
	//get all employees
	@GetMapping(value=empconstants.GET_ALL_EMP)
	public List<Employee> getAllEmployees(){
		List<Employee> empList = empservice.getAllEmployees();
		return  empList;
	}
	
	//to create a new employee and save in db
	@PostMapping(value=empconstants.ADD_NEW_EMP)
	public Employee saveNewEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
}

