package com.yespapi.service;

import java.util.List;

import com.yespapi.model.Customer;
import com.yespapi.repository.CustomerRepository;
import com.yespapi.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	public List <Customer> findAll() {
		return customerRepository.findAll();
	}

}
