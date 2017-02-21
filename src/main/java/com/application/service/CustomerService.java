package com.application.service;

import java.util.List;

import com.application.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers() throws Exception;
	public void saveCustomer(Customer customer) throws Exception;
	public Customer getCustomerById(int id) throws Exception;
	public void deleteCustomerById(int id) throws Exception;
}
