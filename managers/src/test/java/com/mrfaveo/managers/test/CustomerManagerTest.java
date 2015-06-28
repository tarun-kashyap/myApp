/**
 * 
 */
package com.mrfaveo.managers.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mrfaveo.entity.Customer;
import com.mrfaveo.user.CustomerManager;

/**
 * @author dev
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring-config-managers.xml","classpath:/spring-config-services.xml"})
public class CustomerManagerTest {

	final static Logger logger = Logger.getLogger(CustomerManagerTest.class);
	
	@Autowired
	private CustomerManager manager;
	
	@Test
	public void testFindCustomerById()
	{
		logger.debug("************** BEGINNING CustomerSearch **************");
		Customer customer = getManager().findCustomerById("1");
		Assert.assertNotNull(customer);
		logger.debug("************** ENDING CustomerSearch *****************");
	}

	/**
	 * @return the manager
	 */
	public CustomerManager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(CustomerManager manager) {
		this.manager = manager;
	}
}
