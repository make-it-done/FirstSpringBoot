package com.rohit.FirstSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@GetMapping(value="/Employees")
	public List<Employee> getAllEmployee() {
		
		List<Employee> employees = employeeDAO.getAllEmployee();
		return employees;
	}
	
	@RequestMapping(value="/Employees/{EmployeeId}")
	public Employee getEmployee (@PathVariable int EmployeeId)
	{
		return employeeDAO.getEmployee(EmployeeId);
	}
	
	@PostMapping(value="/Employees")
	public int addEmployee(@RequestBody Employee employee)
	{
		System.out.println(employee.toString());
		return employeeDAO.addOrUpdateEmployee(employee);
	}

}
