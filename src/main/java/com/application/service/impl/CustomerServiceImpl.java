package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.CustomerDAO;
import com.application.entity.Customer;
import com.application.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	public List<Customer> getCustomers() throws Exception {
		return customerDAO.getCustomers();
		
	}
	public void saveCustomer(Customer customer) throws Exception {
		 customerDAO.saveCustomer(customer);
		 return;
		
	}
	public Customer getCustomerById(int id) throws Exception {
		return customerDAO.getCustomerById(id);
	}
	public void deleteCustomerById(int id) throws Exception {
		
		 customerDAO.deleteCustomerById(id);
	}

}
