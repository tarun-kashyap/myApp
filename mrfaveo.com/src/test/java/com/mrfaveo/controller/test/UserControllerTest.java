/**
 * 
 */
package com.mrfaveo.controller.test;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mrfaveo.controller.UserController;
import com.mrfaveo.user.UserManager;


/**
 * @author dev
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	private static final Logger logger = Logger.getLogger(UserControllerTest.class);
	@InjectMocks
	private UserController userController;
	
	@Mock
	private UserManager manager;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	@Test
	public void testUserRegisterFormInvalidUser() throws Exception
	{
		logger.debug("invalid user test");
		Assert.assertNotNull(manager);
		
	}

}
