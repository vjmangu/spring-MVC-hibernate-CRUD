package com.application.dao;

import java.util.List;

import com.application.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers() throws Exception;

	public void saveCustomer(Customer customer)throws Exception;

	public Customer getCustomerById(int id) throws Exception;

	public void deleteCustomerById(int id) throws Exception;
}
