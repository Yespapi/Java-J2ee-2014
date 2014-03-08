package com.yespapi.repository;
import java.util.List;

import com.yespapi.model.Customer;
public interface CustomerRepository {

	List <Customer> findAll();

}