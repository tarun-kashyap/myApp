/**
 * 
 */
package com.mrfaveo.user;

import java.util.List;

import com.mrfaveo.domain.SearchCriteria;
import com.mrfaveo.entity.User;
/**
 * @author dev
 *
 */
public interface UserManager {
	
	public boolean registerUser(User user) throws UserException;
	
	public List<User> searchUser(SearchCriteria criteria) throws UserException;
	
	public void deActiateUser(User user) throws UserException;
	
	public void activateUser(User user) throws UserException;
	
	public void updateUser(User user) throws UserException;

}
