package com.mrfaveo.services.test;
/**
 * 
 */


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mrfaveo.service.UserService;

import com.mrfaveo.entity.User;

/**
 * @author dev
 *
 */
public class CreateUserTest {

	public static void main(String args[]) {
		System.out.println("************** BEGINNING PROGRAM **************");
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/spring-config.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		//user.setUserId("tksharma");
		user.setFirstName("Tarun");
		user.setLastName("Sharma");
		userService.addUser(user);
		System.out.println("User : " + user + " added successfully");
		 
		
		 
		System.out.println("************** ENDING PROGRAM *****************");
	}
}