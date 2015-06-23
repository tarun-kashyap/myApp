/**
 * 
 */
package main.test.com.myApp.controller;






import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import main.java.com.myApp.controller.UserController;
import main.java.com.myApp.form.UserRegisterForm;
import main.java.user.UserManager;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.any;


/**
 * @author dev
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	//static final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);
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
		
		UserRegisterForm form = any(UserRegisterForm.class);
		//when(manager.createUser(user)).thenReturn(true);
	}

}
