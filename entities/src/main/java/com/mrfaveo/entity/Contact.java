/**
 * 
 */
package com.mrfaveo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.mrfaveo.constants.AbstractDatabaseIfc;

/**
 * @author dev
 *
 */
@Entity
@Table(name=AbstractDatabaseIfc.TABLE_CONTACT)
public class Contact implements Serializable {

	/** serial version UID */
	private static final long serialVersionUID = -4024904443708644300L;
	
	@EmbeddedId
	private ContactID id;
	
	@Column(name=AbstractDatabaseIfc.FIELD_CONTACT_TYPE)
	private String contactType;
	
	@Column(name=AbstractDatabaseIfc.FIELD_CONTACT_VALUE)
	private String contactValue;

	/**
	 * @return the id
	 */
	public ContactID getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ContactID id) {
		this.id = id;
	}

	/**
	 * @return the contactType
	 */
	public String getContactType() {
		return contactType;
	}

	/**
	 * @param contactType the contactType to set
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	/**
	 * @return the contactValue
	 */
	public String getContactValue() {
		return contactValue;
	}

	/**
	 * @param contactValue the contactValue to set
	 */
	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Contact))
		{
			return false;
		}
		Contact otherContact = (Contact) obj;
		return (this.getContactType().equals(otherContact.getContactType()) && this.getContactValue().equals(otherContact.getContactValue()));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getContactType()).append(getContactValue());
		return sb.toString();
	}

}
