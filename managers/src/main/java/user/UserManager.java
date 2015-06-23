/**
 * 
 */
package main.java.user;

import java.util.List;

import main.java.domain.SearchCriteria;
import main.java.entity.User;

import org.springframework.stereotype.Component;

/**
 * @author dev
 *
 */
@Component
public interface UserManager {
	
	public boolean registerUser(User user) throws UserException;
	
	public List<User> searchUser(SearchCriteria criteria) throws UserException;
	
	public void deActiateUser(User user) throws UserException;
	
	public void activateUser(User user) throws UserException;
	
	public void updateUser(User user) throws UserException;

}
