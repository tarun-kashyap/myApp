/**
 * 
 */
package com.mrfaveo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.domain.SearchCriteriaImpl;
import com.mrfaveo.domain.SearchCriteria.SearchType;
import com.mrfaveo.entity.Customer;
import com.mrfaveo.service.CustomerService;

/**
 * @author dev
 *
 */
@Component
public class CustomerManagerImpl implements CustomerManager {

	@Autowired
	private CustomerService service;
	/* (non-Javadoc)
	 * @see com.mrfaveo.user.CustomerManager#findCustomerById(java.lang.String)
	 */
	@Override
	public Customer findCustomerById(String customerId) {
		SearchCriteria criteria = new SearchCriteriaImpl();
		criteria.setSearchType(SearchType.SEARCH_BY_ID);
		criteria.setId(customerId);
		List<Customer> customer = getService().findCustomer(criteria);
		return customer.get(0);
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.CustomerManager#findCustomers(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Customer> findCustomers(String lastName, String phone,
			String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.CustomerManager#findCustomers(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Customer> findCustomers(String postalCode, String location) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the service
	 */
	public CustomerService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(CustomerService service) {
		this.service = service;
	}

}
