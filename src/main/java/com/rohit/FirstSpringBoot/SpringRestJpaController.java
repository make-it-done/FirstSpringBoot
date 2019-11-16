package com.rohit.FirstSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rohit.FirstSpringBoot.DAO.EmployeeRepository;
import com.rohit.FirstSpringBoot.Entity.Employee;

@RestController()
@RequestMapping(value= "/jpa")
public class SpringRestJpaController {

	@Autowired
	private EmployeeRepository employeeDAO;
	
	@RequestMapping(value="/hello" )
	public String getValue() {
		
		return "My name is Rohit";
	}
	
	
	@GetMapping(value="/Employees")
	public List<Employee> getAllEmployee() {
		
		List<Employee> employees = employeeDAO.findAll();
		return employees;
	}
	
	@RequestMapping(value="/Employees/{EmployeeId}")
	public Employee getEmployee (@PathVariable int EmployeeId)
	{
		Optional<Employee> optional =employeeDAO.findById(EmployeeId);
		
		return optional.get();
	}
	
	@PostMapping(value="/Employees")
	public int addEmployee(@RequestBody Employee employee)
	{
		System.out.println(employee.toString());
		Employee employee2= employeeDAO.save(employee);
		return employee2.getId();
	}
}
