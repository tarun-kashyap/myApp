/**
 * 
 */
package com.mrfaveo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrfaveo.entity.User;
import com.mrfaveo.dao.UserDAO;
import com.mrfaveo.domain.SearchCriteria;

/**
 * @author dev
 *
 */
@Service
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
	 * @see com.mrfaveo.service.UserService#addUser(com.mrfaveo.domain.User)
	 */
	@Override
	public void addUser(User user) {
		userDAO.insert(user);

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.service.UserService#search(com.mrfaveo.domain.SearchCriteria)
	 */
	@Override
	public List<User> search(SearchCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.service.UserService#activate(com.mrfaveo.domain.User)
	 */
	@Override
	public void activate(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.service.UserService#deActivate(com.mrfaveo.domain.User)
	 */
	@Override
	public void deActivate(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.service.UserService#updateUser(com.mrfaveo.domain.User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

}
