/**
 * 
 */
package main.java.service;

import main.java.dao.UserDAO;
import main.java.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dev
 *
 */
@Component
public class UserService {

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void addUser(User user)
	{
		getUserDAO().insert(user);
	}
}
