package com.aktansanhal.springdemo.service;

import java.util.List;

import com.aktansanhal.springdemo.entity.*;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomers(int id);
	
	public void deleteCustomer(int theId);
}
