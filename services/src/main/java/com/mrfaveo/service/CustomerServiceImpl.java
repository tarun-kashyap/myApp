/**
 * 
 */
package com.mrfaveo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.domain.SearchCriteria.SearchType;
import com.mrfaveo.entity.Customer;

/**
 * @author dev
 *
 */
@Service("customerService")
@Transactional(propagation=Propagation.REQUIRED)
public class CustomerServiceImpl extends AbstractJPAService implements CustomerService {

	  @PersistenceContext(unitName=PERSISTENCE_UNIT_NAME)
	    private EntityManager entityManager;
	
	public CustomerServiceImpl() {
		super();
	}
	
	@PostConstruct
    public void init()
    {
        super.initialize(entityManager);
    }
	
	/* (non-Javadoc)
	 * @see com.mrfaveo.service.CustomerService#findCustomer(com.mrfaveo.domain.SearchCriteria)
	 */
	@Override
	public List<Customer> findCustomer(SearchCriteria criteria) throws PersistenceException{
		SearchType searchType = criteria.getSearchType();
		List<Customer> results = null;
		switch (searchType) {
		case SEARCH_BY_ID: {
			if(criteria.getId() != null)
			{
				results = new ArrayList<Customer>();
				results.add((Customer) find(Customer.class, Long.parseLong(criteria.getId())));
			}
		}
		case SEARCH_BY_INFO: {

		}
		case UNDEFINED :
		{
			// Exception case
		}
		}
		return results;
	}

	@Override
	public void addCustomer(Customer customer) throws PersistenceException{
		persist(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) throws PersistenceException{
		merge(customer);		
	}

}
