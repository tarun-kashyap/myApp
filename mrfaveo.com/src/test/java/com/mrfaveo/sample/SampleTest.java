/**
 * 
 */
package com.mrfaveo.sample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mrfaveo.user.UserManager;

/**
 * @author dev
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:**/spring-config-web.xml","classpath:/spring-config-managers.xml","classpath:/spring-config-services.xml"})
public class SampleTest {
	
	@Autowired
	private UserManager manager;
	
	@Test
	public void testUserManager()
	{
		Assert.assertNotNull(manager);
	}

}
