/**
 * 
 */
package com.mrfaveo.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.entity.User;

/**
 * @author dev
 *
 */
@Component
public class UserManagerImpl implements UserManager {

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.UserManager#registerUser(com.mrfaveo.domain.User)
	 */
	@Override
	public boolean registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.UserManager#searchUser(com.mrfaveo.domain.SearchCriteria)
	 */
	@Override
	public List<User> searchUser(SearchCriteria criteria) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.UserManager#deActiateUser(com.mrfaveo.domain.User)
	 */
	@Override
	public void deActiateUser(User user) throws UserException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.UserManager#activateUser(com.mrfaveo.domain.User)
	 */
	@Override
	public void activateUser(User user) throws UserException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.user.UserManager#updateUser(com.mrfaveo.domain.User)
	 */
	@Override
	public void updateUser(User user) throws UserException {
		// TODO Auto-generated method stub

	}

}
