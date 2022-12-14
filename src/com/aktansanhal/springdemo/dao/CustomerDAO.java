package com.aktansanhal.springdemo.dao;

import java.util.List;

import com.aktansanhal.springdemo.entity.*;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int theId);
	
}
