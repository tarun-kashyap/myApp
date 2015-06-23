/**
 * 
 */
package service;

import java.util.List;

import domain.SearchCriteria;
import entity.User;


/**
 * @author dev
 *
 */
public interface UserService {


	public void addUser(User user);
	
	public List<User> search(SearchCriteria criteria);
	
	public void activate(User user);
	
	public void deActivate(User user);
	
	public void updateUser(User user);
	
}
