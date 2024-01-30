package com.example.demoliquibase.repository;

import com.example.demoliquibase.orm.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
