package com.application.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.application.dao.CustomerDAO;
import com.application.entity.Customer;
import com.application.utilities.HibernateUtil;

@Repository
public class CustomerDAOImpl implements CustomerDAO {


	public List<Customer> getCustomers() throws Exception {

		Session session = HibernateUtil.getSessionFactory().openSession();  
		Transaction tx = session.beginTransaction(); 
		List<Customer> customers =null;
		try{			

			Query<Customer> resultSet= session.createQuery("from Customer", Customer.class);
			customers = resultSet.getResultList();
			tx.commit();

		}
		catch(Exception e){
			if(null != tx) tx.rollback();
			e.printStackTrace();
			throw e;
		}finally{
			if(null != session){
				session.close();
			}
		}
		return customers;
	}

	public void saveCustomer(Customer customer) throws Exception {

		
		Session session = HibernateUtil.getSessionFactory().openSession();  
		Transaction tx = session.beginTransaction(); 
		
		//List<Customer> customers =null;
		try{			
		session.saveOrUpdate("Customer",customer);
		tx.commit();
		}
		catch(Exception e){
			if(null != tx) tx.rollback();
			e.printStackTrace();
			throw e;
		}finally{
			if(null != session){
				session.close();
			}
		}


		return;
	}

	public Customer getCustomerById(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();  
		Transaction tx = session.beginTransaction(); 
		Customer customer = null;
		//List<Customer> customers =null;
		try{			

			Query<Customer> resultSet= session.createQuery("from Customer where id='"+id+"'", Customer.class);
			customer = resultSet.getSingleResult();
			tx.commit();

		}
		catch(Exception e){
			if(null != tx) tx.rollback();
			e.printStackTrace();
			throw e;
		}finally{
			if(null != session){
				session.close();
			}
		}
		return customer;
	}

	public void deleteCustomerById(int id) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();  
		Transaction tx = session.beginTransaction(); 
		//List<Customer> customers =null;
		try{			

			Query result= session.createQuery("delete from Customer where id =:deleteID").setParameter("deleteID", id);
			result.executeUpdate();
			tx.commit();

		}
		catch(Exception e){
			if(null != tx) tx.rollback();
			e.printStackTrace();
			throw e;
		}finally{
			if(null != session){
				session.close();
			}
		}
		return;
	}

}
