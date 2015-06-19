/**
 * 
 */
package main.java.com.myApp.controller;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dev
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
public class UserControllerTest {
	
	//static final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);
	@Autowired
	private UserController userController;

}
