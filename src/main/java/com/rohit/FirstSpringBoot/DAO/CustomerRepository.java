package com.rohit.FirstSpringBoot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.FirstSpringBoot.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
