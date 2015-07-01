package com.mrfaveo.services.test;
/**
 * 
 */


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mrfaveo.service.UserService;
import com.mrfaveo.entity.User;

/**
 * @author dev
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/spring-config-services.xml"})
public class CreateUserTest {

	final static Logger logger = Logger.getLogger(CreateUserTest.class);
	
	@Autowired
	UserService userService;
	@Test
	public void testUserCreate() throws Exception{
		logger.debug("************** BEGINNING PROGRAM **************");
		
		User user = new User();
		user.setFirstName("Tarun");
		user.setLastName("Sharma");
		user.setPassword("password");
		user.setUserName("tarun.sharma");
		try {
			userService.addUser(user);
		} catch (Throwable e) {
			logger.error("Exception occured ", e);
		}
		logger.debug("User : " + user + " added successfully");
		 
		logger.debug("************** ENDING PROGRAM *****************");
	}
}
