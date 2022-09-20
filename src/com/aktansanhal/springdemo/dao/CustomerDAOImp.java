package com.aktansanhal.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aktansanhal.springdemo.entity.Customer;

@Repository
public class CustomerDAOImp implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Customer> customers = session.createQuery("from Customer order by firstName",Customer.class).getResultList();
		
		
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		
		session.save(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		
		return customer;
	}
	



	@Override
	public void deleteCustomer(int theId) {

		
		Session currentSession = sessionFactory.getCurrentSession();
		
	

		currentSession.createQuery("delete from Customer where id=:customerId").setParameter("customerId", theId).executeUpdate();
		
		
	}
	

	

	
}
