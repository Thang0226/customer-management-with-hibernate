package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
	List<Customer> findAll();

	void add(Customer customer);

	Customer findById(int id);

	void update(Customer customer);

	void remove(int id);
}
