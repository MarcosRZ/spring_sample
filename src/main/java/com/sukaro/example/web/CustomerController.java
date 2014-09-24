package com.sukaro.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sukaro.example.domain.model.Customer;
import com.sukaro.example.service.CustomerService;


@Controller
public class CustomerController {

	
	@Autowired
	CustomerService cs;
	
	@ModelAttribute("customers")
	public List<Customer> allCustomers(){
		return cs.findAll();
	}
	
    @RequestMapping(value = "/newcustomer", method=RequestMethod.GET)
    public String newCustomer( Model model){
    	Customer c = new Customer();
    	model.addAttribute("customer",c);
    	return "newCustomer";	
    }
    
    @RequestMapping(value = "/newcustomer", method=RequestMethod.POST)
    public String addCustomer(Customer c, Model model){
    	System.out.println(c);
    	cs.save(c);
    	return "redirect:/customers";	
    }
    
    @RequestMapping("/customers")
    public String customers() {
    	System.out.println("Serving " + allCustomers().size() + " customers!");
    	return "customers";
    }

}
