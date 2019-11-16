package com.rohit.FirstSpringBoot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.FirstSpringBoot.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
