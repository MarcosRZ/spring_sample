package com.sukaro.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukaro.example.domain.model.Car;
import com.sukaro.example.domain.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository repository;

	public List<Car> findAll(){
		Iterator<Car> i = repository.findAll().iterator();
		List<Car> l = new ArrayList<Car>();
		
		while(i.hasNext())
			l.add(i.next());
		
		return l;
		
	}
	
	public void save(Car c){
		repository.save(c);
	}
}
