/**
 * 
 */
package com.mrfaveo.validator;

/**
 * @author dev
 *
 */
public interface ValidatorConstants {
	
	public static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	
	public static final String PASSWORD_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})";
	
	public static final String PHONE_REGEX = "^[789]\\d{9}$";
	
	public static final String NAME_REGEX = "^[\\p{L} .'-].{2,30}$";

}
