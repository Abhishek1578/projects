package com.event.RepoTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.event.Entity.Customer;
import com.event.Entity.Event;
import com.event.Repository.CustomerRepository;
import com.event.Service.Customerservice;

@SpringBootTest
public class CustomerRepositooryTest {
	
	@Autowired
	Customerservice customerser;
	
	@MockBean
	CustomerRepository customerRepo;
	
	@Test
	void testaddEvent()
	{
		Customer c=new Customer(101,"Abhishek","mumbai","India");
		Mockito.when(customerRepo.save(c)).thenReturn(c);
		assertEquals(c,customerser.addCustomer(c));
	}
	
	@Test
	void testGetAll() {
		List<Customer> listevent=Stream.of(new Customer(101,"Abhi","mumbai","india"),new Customer(102,"Abhishek","mumbai","india")).collect(Collectors.toList());
		Mockito.when(customerRepo.findAll()).thenReturn(listevent);
		assertEquals(2,customerser.getAllCustomer().size());
	}
	@Test
	void testDeleteEvent() {
		customerser.deleteCustomer(101);
		Mockito.verify(customerRepo).deleteById(101);
	}

}
