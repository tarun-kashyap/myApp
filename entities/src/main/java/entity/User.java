/**
 * 
 */
package main.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import main.java.AbstractDatabaseIfc;



/**
 * @author dev
 *
 */
@Entity
@Table(name=AbstractDatabaseIfc.TABLE_USER)
public class User{
	
	@Id
	@Column(name=AbstractDatabaseIfc.FIELD_USER_USER_ID)
	private String userId;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_FIRST_NAME)
	private String firstName;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_LAST_NAME)
	private String lastName;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
