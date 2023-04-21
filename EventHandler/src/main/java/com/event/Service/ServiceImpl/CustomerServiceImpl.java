package com.event.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.event.Entity.Customer;
import com.event.Repository.CustomerRepository;
import com.event.Service.Customerservice;

@Repository
public class CustomerServiceImpl implements Customerservice {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> findCustomerById(int cid) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerBycid(cid);
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(cid);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stubcustomerRepository
		Customer _customer=customerRepository.findById(customer.getCid()).get();
		_customer.setCid(customer.getCid());
		_customer.setCname(customer.getCname());
		_customer.setCcity(customer.getCcity());
		_customer.setCcountry(customer.getCcountry());
		customerRepository.save(_customer);
		return _customer;
	}

	@Override
	public List<Customer> findCustomerByName(String cname) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerBycname(cname);
	}

}
