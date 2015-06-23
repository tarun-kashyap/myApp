/**
 * 
 */
package com.myApp.form;

import java.io.Serializable;

/**
 * @author dev
 *
 */
public class UserRegisterForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8653840197541023381L;
	
	public static final String FULL_NAME_FIELD = "fullName";
	
	public static final String GENDER_FIELD = "gender";
	
	public static final String EMAIL_ADDRESS_FIELD = "emailAddress";
	
	public static final String PHONE_NUMBER_FIELD = "phoneNumber";
	
	public static final String PASSWORD_FIELD = "password";
	
	public static final String CONFIRM_PASSWORD_FIELD = "confirmPassword";
	
	
	public static final String FULL_NAME_MISSING_MESSAGE = "error.fullname.missing";
	
	public static final String EMAIL_MISSING_MESSAGE = "error.email.missing";
	
	public static final String PHONE_MISSING_MESSAGE = "error.phone.missing";
	
	public static final String PASSWORD_MISSING_MESSAGE = "error.password.missing";
	
	public static final String FULL_NAME_FORMAT_MESSAGE = "error.fullname.format";
	
	public static final String EMAIL_FORMAT_MESSAGE = "error.email.format";
	
	public static final String PHONE_FORMAT_MESSAGE = "error.phone.format";
	
	public static final String PASSWORD_FORMAT_MESSAGE = "error.password.format";
	
	public static final String PASSWORD_MISMATCH_MESSAGE = "error.password.mismatch";

	private String fullName;
	
	private char gender;
	
	private String emailAddress;
	
	private String phoneNumber;
	
	private String password;
	
	private String confirmPassword;
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	
	

}
