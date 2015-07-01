/**
 * 
 */
package com.mrfaveo.services.test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.domain.SearchCriteriaImpl;
import com.mrfaveo.domain.SearchCriteria.SearchType;
import com.mrfaveo.entity.Address;
import com.mrfaveo.entity.AddressID;
import com.mrfaveo.entity.Contact;
import com.mrfaveo.entity.ContactID;
import com.mrfaveo.entity.Customer;
import com.mrfaveo.service.CustomerService;

/**
 * @author dev
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring-config-services.xml"})
public class CustomerServiceTest {
	
	final static Logger logger = Logger.getLogger(CustomerServiceTest.class);
	
	@Autowired
	CustomerService service;
	
	@Test
	@Ignore
	public void testCreateCustomer()
	{
		logger.debug("************** BEGINNING CREATE CUSTOMER **************");
		try {
			Customer c = new Customer();
			c.setGender("M");
			c.setUserName("tarun.kashyap");
			c.setFirstName("Tarun");
			c.setLastName("kashyap");
			c.setLastModifierId("testcase1");
			c.setPassword("Welcome1");
			Date currDate = Calendar.getInstance().getTime();
			c.setCreationTimestamp(currDate);
			c.setEffectiveDate(currDate);
			c.setModifiedTimestamp(currDate);
			c.setStatus("Active");
			service.addCustomer(c);
		}catch(Throwable t)
		{
			logger.error("Exception occured ", t);
		}
		logger.debug("************** ENDING CREATE CUSTOMER *****************");
	}
	
	@Test
	@Ignore
	public void testUpdateCustomer()
 {
		logger.debug("************** BEGINNING UPDATE CUSTOMER **************");
		try {
			SearchCriteria criteria = new SearchCriteriaImpl();
			criteria.setId("1001");
			criteria.setSearchType(SearchType.SEARCH_BY_ID);
			List<Customer> customers = service.findCustomer(criteria);
			Assert.assertNotNull(customers);
			Customer customer = customers.get(0);
			AddressID addressID = new AddressID(customer.getUserId(), 1L);
			Address address = new Address();
			address.setId(addressID);
			address.setAddressLine1("line 1");
			address.setAddressLine2("line 2");
			address.setAddressLine3("line 3");
			address.setCity("Bangalore");
			address.setState("Karnataka");
			address.setPostalCode("560068");
			customer.addAddress(address);
			service.updateCustomer(customer);
		} catch (Throwable t) {
			logger.error("Exception occured ", t);
		}
		logger.debug("************** ENDING UPDATE CUSTOMER *****************");
	}
	
	@Test
	public void testUpdateCustomerContact()
	 {
			logger.debug("************** BEGINNING UPDATE CUSTOMER **************");
			try {
				SearchCriteria criteria = new SearchCriteriaImpl();
				criteria.setId("1001");
				criteria.setSearchType(SearchType.SEARCH_BY_ID);
				List<Customer> customers = service.findCustomer(criteria);
				Assert.assertNotNull(customers);
				Customer customer = customers.get(0);
				ContactID contactID = new ContactID(customer.getUserId(), 1L);
				Contact contact = new Contact();
				contact.setId(contactID);
				contact.setContactType("Phone");
				contact.setContactValue("9871567333");
				customer.addContact(contact);
				service.updateCustomer(customer);
			} catch (Throwable t) {
				logger.error("Exception occured ", t);
			}
			logger.debug("************** ENDING UPDATE CUSTOMER *****************");
		}


}
