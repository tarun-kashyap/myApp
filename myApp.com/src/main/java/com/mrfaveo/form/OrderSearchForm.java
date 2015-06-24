/**
 * 
 */
package com.mrfaveo.form;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author dev
 *
 */
public class OrderSearchForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4663991599017816006L;

	private String customerPhone;
	
	private String customerEmail;
	
	private String customerId;
	
	private String serviceProfessionalId;
	
	private String orderStatus;
	
	private Timestamp beginTimestamp;
	
	private Timestamp endTimestamp;

	/**
	 * @return the customerPhone
	 */
	public String getCustomerPhone() {
		return customerPhone;
	}

	/**
	 * @param customerPhone the customerPhone to set
	 */
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * @param customerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the serviceProfessionalId
	 */
	public String getServiceProfessionalId() {
		return serviceProfessionalId;
	}

	/**
	 * @param serviceProfessionalId the serviceProfessionalId to set
	 */
	public void setServiceProfessionalId(String serviceProfessionalId) {
		this.serviceProfessionalId = serviceProfessionalId;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the beginTimestamp
	 */
	public Timestamp getBeginTimestamp() {
		return beginTimestamp;
	}

	/**
	 * @param beginTimestamp the beginTimestamp to set
	 */
	public void setBeginTimestamp(Timestamp beginTimestamp) {
		this.beginTimestamp = beginTimestamp;
	}

	/**
	 * @return the endTimestamp
	 */
	public Timestamp getEndTimestamp() {
		return endTimestamp;
	}

	/**
	 * @param endTimestamp the endTimestamp to set
	 */
	public void setEndTimestamp(Timestamp endTimestamp) {
		this.endTimestamp = endTimestamp;
	}
	

}
