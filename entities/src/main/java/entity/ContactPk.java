/**
 * 
 */
package main.java.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import main.java.AbstractDatabaseIfc;

/**
 * @author dev
 *
 */
@Embeddable
public class ContactPk implements Serializable {

	/** serial version UID */
	private static final long serialVersionUID = 7561747404337586825L;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_USER_ID)
	private long userId;
	
	@Column(name=AbstractDatabaseIfc.FIELD_CONTACT_ID)
	private long contactId;
	
	public ContactPk(long userId, long contactId)
	{
		this.userId = userId;
		this.contactId = contactId;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the contactId
	 */
	public long getContactId() {
		return contactId;
	}

	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	
	@Override
	public int hashCode() {
		
		return (int) (getUserId()+getContactId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof ContactPk))
		{
			return false;
		}
		ContactPk otherKey = (ContactPk) obj;
		return (this.getUserId()== otherKey.getUserId() && this.getContactId() == otherKey.getContactId());
	}

}
