/**
 * 
 */
package main.java.user;

import java.util.List;

import main.java.domain.User;

import org.springframework.stereotype.Component;

/**
 * @author dev
 *
 */
@Component
public interface UserManager {
	
	public void createUser(User user);
	
	public List<User> getUser();
	
	public void deActiateUser(User user);
	
	public void activateUser(User user);
	
	public void updateUser(User user);

}
