package com.rohit.FirstSpringBoot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rohit.FirstSpringBoot.Entity.Customer;

@RepositoryRestResource(path="members")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
