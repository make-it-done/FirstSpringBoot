package com.rohit.FirstSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.FirstSpringBoot.DAO.EmployeeDAO;
import com.rohit.FirstSpringBoot.Entity.Employee;


@RestController
public class SpringRestController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@RequestMapping(value="/hello" )
	public String getValue() {
		
		return "My name is Rohit";
	}
	
	
	@RequestMapping(value="/Employees")
	public List<Employee> getAllEmployee() {
		
		List<Employee> employees = employeeDAO.getAllEmployee();
		return employees;
	}

}
