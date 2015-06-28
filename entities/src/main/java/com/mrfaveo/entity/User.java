/**
 * 
 */
package com.mrfaveo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mrfaveo.constants.AbstractDatabaseIfc;



/**
 * @author dev
 *
 */
@Entity
@Table(name=AbstractDatabaseIfc.TABLE_USER)
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name=AbstractDatabaseIfc.FIELD_USER_USER_TYPE, discriminatorType=DiscriminatorType.STRING)
public class User implements Serializable{
	
	/** serial version UID */
	private static final long serialVersionUID = -2280208465586751881L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name=AbstractDatabaseIfc.FIELD_USER_USER_ID)
	private long userId;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_USER_NAME)
	private String userName;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_FIRST_NAME)
	private String firstName;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_LAST_NAME)
	private String lastName;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_GENDER)
	private String gender;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_USER_TYPE)
	private String userType;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_PASSWORD)
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name=AbstractDatabaseIfc.FIELD_USER_CREATION_TIMESTAMP)
	private Date creationTimestamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name=AbstractDatabaseIfc.FIELD_USER_MODIFIED_TIMESTAMP)
	private Date modifiedTimestamp;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_LAST_MODIFIER_ID)
	private String lastModifierId;
	
	@Column(name=AbstractDatabaseIfc.FIELD_USER_STATUS)
	private String status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name=AbstractDatabaseIfc.FIELD_USER_EFFECTIVE_TIMESTAMP)
	private Date effectiveDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name=AbstractDatabaseIfc.FIELD_USER_EXPIRATION_TIMESTAMP)
	private Date expirationDate;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL, targetEntity=Contact.class)
	private List<Contact> contacts;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL, targetEntity=Address.class)
	private List<Address> addresses;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the creationTimestamp
	 */
	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	/**
	 * @param creationTimestamp the creationTimestamp to set
	 */
	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	/**
	 * @return the modifiedTimestamp
	 */
	public Date getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	/**
	 * @param modifiedTimestamp the modifiedTimestamp to set
	 */
	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	/**
	 * @return the lastModifierId
	 */
	public String getLastModifierId() {
		return lastModifierId;
	}

	/**
	 * @param lastModifierId the lastModifierId to set
	 */
	public void setLastModifierId(String lastModifierId) {
		this.lastModifierId = lastModifierId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	/**
	 * @return the contacts
	 */
	public List<Contact> getContacts() {
		return contacts;
	}

	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public void addContact(Contact contact)
	{
		if(!getContacts().contains(contact))
		{
			getContacts().add(contact);
		}
	}
	
	public void addAddress(Address address)
	{
		if(!getAddresses().contains(address))
		{
			getAddresses().add(address);
		}
	}

	@Override
	public int hashCode() {
		
		return (int) userId;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if ((obj == null) || !(obj instanceof User)) 
		 {
	         return false;
	     }
		User otherUser = (User) obj;
		
		return (this.getUserType().equals(otherUser.getUserType())
				&& this.getUserName().equals(otherUser.getUserName()));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getFirstName()).append(getLastName()).append(getUserType());
		return sb.toString();
	}

}
