package com.sukaro.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.sukaro.example.domain.repository.CarRepository;
import com.sukaro.example.service.CustomerService;

@Configuration

@Component
public class AppConfig {


	@Autowired
	CustomerService customerRepository;

	@Autowired
	CarRepository dataServiceRepository;
	
	public void configure(){
		
//	   	 System.out.println("Customer service: " + repository);
//	     Customer c1 = new Customer("Jack", "Bauer");
//	     Customer c2 = new Customer("Chloe", "O'Brian");
//	     Customer c3 = new Customer("Kim", "Bauer");
//	     Customer c4 = new Customer("David", "Palmer");
//	     Customer c5 = new Customer("Michelle", "Dessler");
//	     
//	     DataService d1 = new DataService("Service#1","A new service", "12eodcf131e290kdcj4378h233");
//	     DataService d2 = new DataService("Service#2","Another service", "asdqwe123");
//	     DataService d3 = new DataService("Service#3","The last service", "rr3342gre224gfsad");
//	     
//	     c1.addDataService(d1);
//	     c1.addDataService(d2);
//	     c2.addDataService(d3);
//	     
//	     customerRepository.save(c1);
//	     customerRepository.save(c2);
//	     customerRepository.save(c3);
//	     customerRepository.save(c4);
//	     customerRepository.save(c5);
//	     
//	     dataServiceRepository.save(d1);
//	     dataServiceRepository.save(d2);
//	     dataServiceRepository.save(d3);
//	     
	     
	     // fetch all customers
//	     Iterable<Customer> customers = repository.findAll();
//	     System.out.println("Customers found with findAll():");
//	     System.out.println("-------------------------------");
//
//	     for (Customer c : customers){
//	    	 System.out.println(c);
//	     }
	    
	}

	

}
