/**
 * 
 */
package main.java.com.myApp.form;

import java.io.Serializable;



/**
 * @author dev
 *
 */
public class UserLoginForm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7845110834059659528L;
	
	public static final String EMAIL_FIELD = "email";
	
	public static final String PASSWORD_FIELD = "password";
	
	public static final String EMAIL_MISSING_MESSAGE = "error.email.missing";
	
	public static final String PASSWORD_MISSING_MESSAGE = "error.password.missing";
	
	public static final String EMAIL_FORMAT_MESSAGE = "error.email.format";
	
	public static final String PASSWORD_FORMAT_MESSAGE = "error.password.format";
	
	String email;
	
	String password;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

}
