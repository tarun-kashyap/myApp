/**
 * 
 */
package com.mrfaveo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.mrfaveo.constants.AbstractDatabaseIfc;

/**
 * @author dev
 *
 */
@Embeddable
public class AddressID implements Serializable {

	/** serial version UID */
	private static final long serialVersionUID = -165394115418933343L;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_USER_ID)
	private long userId;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_ID)
	private long addressId;
	
	public AddressID(long userId, long addressId)
	{
		this.userId = userId;
		this.addressId = addressId;
	}
	
	public AddressID()
	{
		
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
	 * @return the addressId
	 */
	public long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	
	@Override
	public int hashCode() {
		return (int) (getUserId()+getAddressId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null || !(obj instanceof AddressID))
		{
			return false;
		}
		AddressID otherKey = (AddressID) obj;
		return getUserId()== otherKey.getUserId() && getAddressId()==otherKey.getAddressId();
	}

}
