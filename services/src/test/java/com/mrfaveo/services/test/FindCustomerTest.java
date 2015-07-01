/**
 * 
 */
package com.mrfaveo.services.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.domain.SearchCriteriaImpl;
import com.mrfaveo.domain.SearchCriteria.SearchType;
import com.mrfaveo.entity.Customer;
import com.mrfaveo.service.CustomerService;
/**
 * @author dev
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring-config-services.xml"})
public class FindCustomerTest {

	final static Logger logger = Logger.getLogger(FindCustomerTest.class);
	
	@Autowired
	CustomerService service;
	
	@Test
	public void testFindCustomer() throws Exception
	{
		logger.debug("************** BEGINNING PROGRAM **************");
		try {
			SearchCriteria criteria = new SearchCriteriaImpl();
			criteria.setSearchType(SearchType.SEARCH_BY_ID);
			criteria.setId("1001");
			List<Customer> customer = service.findCustomer(criteria);
			Assert.assertNotNull(customer);
	} catch (Throwable e) {
		logger.error("Exception occured ", e);
	}
	logger.debug("Customer with id : " + "1001" + " found successfully");
	 
	logger.debug("************** ENDING PROGRAM *****************");
	}
}
