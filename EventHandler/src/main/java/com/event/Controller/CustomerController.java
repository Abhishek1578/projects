package com.event.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.Entity.Customer;
import com.event.Service.Customerservice;

@RestController
public class CustomerController {
	
	@Autowired
	Customerservice customerservice;
	
	@PostMapping(value = "/addcustomer")
	public Customer addCustomer(@Valid @RequestBody Customer customer)
	{
		return customerservice.addCustomer(customer);
		
	}
	@GetMapping(value = "/getallcustomer")
	public List<Customer> getAllCustomer()
	{
		return customerservice.getAllCustomer();
	}
	@GetMapping(value = "/customerid/{cid}")
	public List<Customer> getCustomerById(@Valid @PathVariable int cid)
	{
		return customerservice.findCustomerById(cid);
	}
	@DeleteMapping(value = "/deletecustomer/{cid}")
	public String deleteCustomer(@Valid @PathVariable int cid)
	{
	    customerservice.deleteCustomer(cid);
		return "Customer deleted";
	}
	@PutMapping(value = "/updatecustomer")
	public Customer updateCustomer(@Valid @RequestBody Customer customer)
	{
		return customerservice.updateCustomer(customer);
	}
	@GetMapping(value = "/customername/{cname}")
	public List<Customer> getCustomerByName(@Valid @PathVariable String cname)
	{
		return customerservice.findCustomerByName(cname);
	}
	

}
