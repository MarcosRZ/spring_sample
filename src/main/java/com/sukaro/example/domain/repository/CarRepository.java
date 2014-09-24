package com.sukaro.example.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sukaro.example.domain.model.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByPlateNumber(String serviceKey);
}
