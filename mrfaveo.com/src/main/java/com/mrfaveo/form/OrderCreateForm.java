/**
 * 
 */
package com.mrfaveo.form;

import java.io.Serializable;
import java.util.List;

/**
 * @author dev
 *
 */
public class OrderCreateForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6890724451978900123L;
	
	public static final String SELECTED_SERVICES_FIELD = "selectedServiceIds";
	
	public static final String SERVICE_LOCATION_FIELD = "serviceLocationId";
	
	public static final String ADDRESS_LINE_1_FIELD = "serviceAddressLine1";
	
	public static final String ADDRESS_LINE_2_FIELD = "serviceAddressLine2";
	
	public static final String ADDRESS_LINE_3_FIELD = "serviceAddressLine3";
	
	public static final String PHONE_NUMBER_FIELD = "phoneNumber";
	
	public static final String PREFERRED_TIME_FIELD = "preferredTime";
	
	
	public static final String SELECTED_SERVICES_MISSING_MESSAGE = "errors.services.missing";
	
	public static final String SERVICE_LOCATION_MISSING_MESSAGE = "errors.location.missing";
	
	public static final String ADDRESS_LINE_1_MISSING_MESSAGE = "errors.addressline1.missing";
	
	public static final String ADDRESS_LINE_2_MISSING_MESSAGE = "errors.addressline2.missing"; 
	
	public static final String ADDRESS_LINE_3_MISSING_MESSAGE = "errors.addressline3.missing";
	
	public static final String PHONE_NUMBER_MISSING_MESSAGE = "errors.phonenumber.missing";
	
	public static final String PREFERRED_TIME_MISSING_MESSAGE = "errors.preferredtime.missing";
	
	
	public static final String ADDRESS_LINE_1_FORMAT_MESSAGE = "errors.addressline1.format";
	
	public static final String ADDRESS_LINE_2_FORMAT_MESSAGE = "errors.addressline2.format";
	
	public static final String ADDRESS_LINE_3_FORMAT_MESSAGE = "errors.addressline3.format";
	
	public static final String PHONE_NUMBER_FORMAT_MESSAGE = "errors.phonenumber.format";
	
	public static final String PREFERRED_TIME_FORMAT_MESSAGE = "errors.preferredtime.format";

	private List<String> selectedServiceIds;
	
	private String serviceLocationId;
	
	private String serviceAddressLine1;
	
	private String serviceAddressLine2;
	
	private String serviceAddressLine3;
	
	private String phoneNumber;
	
	private String preferredTime;

	/**
	 * @return the selectedServiceIds
	 */
	public List<String> getSelectedServiceIds() {
		return selectedServiceIds;
	}

	/**
	 * @param selectedServiceIds the selectedServiceIds to set
	 */
	public void setSelectedServiceIds(List<String> selectedServiceIds) {
		this.selectedServiceIds = selectedServiceIds;
	}

	/**
	 * @return the serviceLocationId
	 */
	public String getServiceLocationId() {
		return serviceLocationId;
	}

	/**
	 * @param serviceLocationId the serviceLocationId to set
	 */
	public void setServiceLocationId(String serviceLocationId) {
		this.serviceLocationId = serviceLocationId;
	}

	/**
	 * @return the serviceAddressLine1
	 */
	public String getServiceAddressLine1() {
		return serviceAddressLine1;
	}

	/**
	 * @param serviceAddressLine1 the serviceAddressLine1 to set
	 */
	public void setServiceAddressLine1(String serviceAddressLine1) {
		this.serviceAddressLine1 = serviceAddressLine1;
	}

	/**
	 * @return the serviceAddressLine2
	 */
	public String getServiceAddressLine2() {
		return serviceAddressLine2;
	}

	/**
	 * @param serviceAddressLine2 the serviceAddressLine2 to set
	 */
	public void setServiceAddressLine2(String serviceAddressLine2) {
		this.serviceAddressLine2 = serviceAddressLine2;
	}

	/**
	 * @return the serviceAddressLine3
	 */
	public String getSericeAddressLine3() {
		return serviceAddressLine3;
	}

	/**
	 * @param serviceAddressLine3 the serviceAddressLine3 to set
	 */
	public void setServiceAddressLine3(String serviceAddressLine3) {
		this.serviceAddressLine3 = serviceAddressLine3;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the preferredTime
	 */
	public String getPreferredTime() {
		return preferredTime;
	}

	/**
	 * @param preferredTime the preferredTime to set
	 */
	public void setPreferredTime(String preferredTime) {
		this.preferredTime = preferredTime;
	}
	
	

}
