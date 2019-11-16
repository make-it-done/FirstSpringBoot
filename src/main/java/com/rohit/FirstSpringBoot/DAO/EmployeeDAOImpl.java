package com.rohit.FirstSpringBoot.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohit.FirstSpringBoot.Entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);
		
		Query<Employee> query= session.createQuery("From Employee",Employee.class);
		
		List<Employee> employees = query.getResultList();
		for(Employee employee : employees)
			System.out.println(employee.toString());
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Employee employee = session.get(Employee.class, id);
		
		return employee;
	}

	@Override
	public int addOrUpdateEmployee(Employee employee) {
		
		Session session= entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(employee);
		
		return employee.getId();
	}
	
	

}
