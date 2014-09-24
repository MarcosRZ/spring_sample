package com.sukaro.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukaro.example.domain.model.Customer;
import com.sukaro.example.domain.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cr;

	public List<Customer> findAll(){
		Iterator<Customer> i = cr.findAll().iterator();
		List<Customer> l = new ArrayList<Customer>();
		
		while(i.hasNext())
			l.add(i.next());
		
		return l;
		
	}
	
	public void save(Customer c){
		cr.save(c);
	}
}
