package com.mrfaveo.services.test;
/**
 * 
 */


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

	@Autowired
	UserService userService;
	@Test
	public void testUserCreate() throws Exception{
		System.out.println("************** BEGINNING PROGRAM **************");
		
		User user = new User();
		//user.setUserId("tksharma");
		user.setFirstName("Tarun");
		user.setLastName("Sharma");
		userService.addUser(user);
		System.out.println("User : " + user + " added successfully");
		 
		
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}
}
