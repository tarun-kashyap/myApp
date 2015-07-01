/**
 * 
 */
package com.mrfaveo.service;

import java.util.List;

import javax.persistence.PersistenceException;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.entity.Customer;

/**
 * @author dev
 *
 */
public interface CustomerService {
	
	public List<Customer>findCustomer(SearchCriteria criteria) throws PersistenceException;
	
	public void addCustomer(Customer customer) throws PersistenceException;
	
	public void updateCustomer(Customer customer) throws PersistenceException;

}
