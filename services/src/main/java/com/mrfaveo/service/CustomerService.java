/**
 * 
 */
package com.mrfaveo.service;

import java.util.List;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.entity.Customer;

/**
 * @author dev
 *
 */
public interface CustomerService {
	
	public List<Customer>findCustomer(SearchCriteria criteria);

}
