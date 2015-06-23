/**
 * 
 */
package main.java;

/**
 * @author dev
 *
 */
public interface AbstractDatabaseIfc {
	
	public static final String TABLE_USER = "USR";	
	public static final String FIELD_USER_USER_ID = "USR_ID";
	public static final String FIELD_USER_USER_NAME = "USR_NM";
	public static final String FIELD_USER_FIRST_NAME = "F_NM";
	public static final String FIELD_USER_LAST_NAME = "L_NM";
	public static final String FIELD_USER_USER_TYPE = "USR_TYPE";
	public static final String FIELD_USER_PASSWORD = "PASSWORD";
	public static final String FIELD_USER_GENDER = "GENDER";
	public static final String FIELD_USER_CREATION_TIMESTAMP = "TS_CRT";
	public static final String FIELD_USER_MODIFIED_TIMESTAMP = "TS_MDF";
	public static final String FIELD_USER_LAST_MODIFIER_ID = "MDFR_ID";
	public static final String FIELD_USER_STATUS = "STATUS";
	public static final String FIELD_USER_EFFECTIVE_TIMESTAMP = "TS_EF";
	public static final String FIELD_USER_EXPIRATION_TIMESTAMP = "TS_EP";
	
	public static final String TABLE_CUSTOMER = "CUSTOMER";
	public static final String FIELD_CUSTOMER_ID = "CUST_ID";
	
	public static final String TABLE_EMPLOYEE = "EMPLOYEE";
	public static final String FIELD_EMPLOYEE_ID = "EMP_ID";
	
	public static final String TABLE_PROFESSIONAL = "PROF";
	public static final String FIELD_PROFESSIONAL_ID = "PROF_ID";
	
	public static final String TABLE_ADDRESS = "ADDRESS";
	public static final String FIELD_ADDRESS_ID = "ADDR_ID";
	public static final String FIELD_ADDRESS_LINE1 = "ADDRESS_LINE_1";
	public static final String FIELD_ADDRESS_LINE2 = "ADDRESS_LINE_2";
	public static final String FIELD_ADDRESS_LINE3 = "ADDRESS_LINE_3";
	public static final String FIELD_ADDRESS_CITY = "CITY";
	public static final String FIELD_ADDRESS_STATE = "STATE";
	public static final String FIELD_ADDRESS_POSTALCODE = "POSTAL_CODE";
	
	public static final String TABLE_CONTACT = "CONTACT";
	public static final String FIELD_CONTACT_ID = "CNCT_ID";
	public static final String FIELD_CONTACT_TYPE = "CNCT_TYPE";
	public static final String FIELD_CONTACT_VALUE = "CNCT_VAL";

}
