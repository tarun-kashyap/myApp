/**
 * 
 */
package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import entity.User;
import dao.UserDAO;
import domain.SearchCriteria;

/**
 * @author dev
 *
 */
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	/* (non-Javadoc)
	 * @see main.java.service.UserService#addUser(main.java.domain.User)
	 */
	@Override
	public void addUser(User user) {
		userDAO.insert(user);

	}

	/* (non-Javadoc)
	 * @see main.java.service.UserService#search(main.java.domain.SearchCriteria)
	 */
	@Override
	public List<User> search(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see main.java.service.UserService#activate(main.java.domain.User)
	 */
	@Override
	public void activate(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.java.service.UserService#deActivate(main.java.domain.User)
	 */
	@Override
	public void deActivate(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.java.service.UserService#updateUser(main.java.domain.User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

}
