package com.sukaro.example.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sukaro.example.domain.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
