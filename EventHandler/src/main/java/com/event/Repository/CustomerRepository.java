package com.event.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	public List<Customer> findCustomerBycid(int cid);
	public List<Customer> findCustomerBycname(String cname);
	

}
