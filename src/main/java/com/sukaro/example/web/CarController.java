package com.sukaro.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sukaro.example.domain.model.Car;
import com.sukaro.example.service.CarService;

@Controller
public class CarController {

	@Autowired
	CarService service;

	@ModelAttribute("cars")
	public List<Car> allCars() {
		return service.findAll();
	}

	@RequestMapping(value = "/newcar", method = RequestMethod.GET)
	public String newCar(Model model) {
		Car car = new Car();
		model.addAttribute("car", car);
		return "newCar";
	}

	@RequestMapping(value = "/newcar", method = RequestMethod.POST)
	public String addCar(Car car, Model model) {
		System.out.println(car);
		service.save(car);
		return "redirect:/cars";
	}

	@RequestMapping("/cars")
	public String cars() {
		System.out.println("Serving " + allCars().size() + " cars!");
		return "cars";
	}

}
