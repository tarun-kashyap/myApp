/**
 * 
 */
package main.java.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import main.java.AbstractDatabaseIfc;

/**
 * @author dev
 *
 */
@Entity
@Table(name=AbstractDatabaseIfc.TABLE_ADDRESS)
public class Address implements Serializable{

	/** serial version UID */
	private static final long serialVersionUID = -4726060810837347831L;
	
	@EmbeddedId
	private AddressPk id;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_LINE1)
	private String addressLine1;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_LINE2)
	private String addressLine2;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_LINE3)
	private String addressLine3;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_CITY)
	private String  city;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_STATE)
	private String state;
	
	@Column(name=AbstractDatabaseIfc.FIELD_ADDRESS_POSTALCODE)
	private String postalCode;

	/**
	 * @return the id
	 */
	public AddressPk getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(AddressPk id) {
		this.id = id;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null || !(obj instanceof Address))
		{
			return false;
		}
		Address otherAddress = (Address) obj;
		return this.getPostalCode().equals(otherAddress.getPostalCode());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

}
