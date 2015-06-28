/**
 * 
 */
package com.mrfaveo.user;

import java.util.List;

import com.mrfaveo.entity.Customer;

/**
 * @author dev
 *
 */
public interface CustomerManager {
	
	public Customer findCustomerById(String customerId);
	
	public List<Customer> findCustomers(String lastName, String phone, String email);
	
	public List<Customer> findCustomers(String postalCode, String location);

}
