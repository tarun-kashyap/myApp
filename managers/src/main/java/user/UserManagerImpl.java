/**
 * 
 */
package user;

import java.util.List;

import domain.SearchCriteria;
import entity.User;

/**
 * @author dev
 *
 */
public class UserManagerImpl implements UserManager {

	/* (non-Javadoc)
	 * @see main.java.user.UserManager#registerUser(main.java.domain.User)
	 */
	@Override
	public boolean registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see main.java.user.UserManager#searchUser(main.java.domain.SearchCriteria)
	 */
	@Override
	public List<User> searchUser(SearchCriteria criteria) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see main.java.user.UserManager#deActiateUser(main.java.domain.User)
	 */
	@Override
	public void deActiateUser(User user) throws UserException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.java.user.UserManager#activateUser(main.java.domain.User)
	 */
	@Override
	public void activateUser(User user) throws UserException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.java.user.UserManager#updateUser(main.java.domain.User)
	 */
	@Override
	public void updateUser(User user) throws UserException {
		// TODO Auto-generated method stub

	}

}
