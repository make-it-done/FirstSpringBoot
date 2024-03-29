package com.rohit.FirstSpringBoot.DAO;

import java.util.List;

import com.rohit.FirstSpringBoot.Entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(int id);
	
	public int  addOrUpdateEmployee(Employee employee);

}
