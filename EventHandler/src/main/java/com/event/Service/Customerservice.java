package com.event.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.Entity.Customer;

@Service
public interface Customerservice {
	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public List<Customer> findCustomerById(int cid);
	public void deleteCustomer(int cid);
	public Customer updateCustomer(Customer customer);
	public List<Customer> findCustomerByName(String cname);
	
	

}
