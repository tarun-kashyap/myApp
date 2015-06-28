/**
 * 
 */
package com.mrfaveo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.entity.Customer;

/**
 * @author dev
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.mrfaveo.service.CustomerService#findCustomer(com.mrfaveo.domain.SearchCriteria)
	 */
	@Override
	public List<Customer> findCustomer(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
