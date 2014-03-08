package com.yespapi.repository;

import java.util.ArrayList;
import java.util.List;

import com.yespapi.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Aly");
		customer.setLastname("Yespapi : dedite to my Papi ");
		
		customers.add(customer);
		
		return customers;
		
	}

}

