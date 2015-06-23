/**
 * 
 */
package com.myApp.validator;

import com.myApp.form.UserRegisterForm;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author dev
 *
 */
public class UserRegisterValidator implements Validator, ValidatorConstants {

	
	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegisterForm.class.isAssignableFrom(clazz);
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object form, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, UserRegisterForm.FULL_NAME_FIELD, UserRegisterForm.FULL_NAME_MISSING_MESSAGE);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, UserRegisterForm.EMAIL_ADDRESS_FIELD, UserRegisterForm.EMAIL_MISSING_MESSAGE);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, UserRegisterForm.PHONE_NUMBER_FIELD, UserRegisterForm.PHONE_MISSING_MESSAGE);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, UserRegisterForm.PASSWORD_FIELD, UserRegisterForm.PASSWORD_MISSING_MESSAGE);
		UserRegisterForm userRegisterForm = (UserRegisterForm) form;
		String enteredFullName = userRegisterForm.getFullName();
		String enteredEmail = userRegisterForm.getEmailAddress();
		String enteredPhone = userRegisterForm.getPhoneNumber();
		String enteredPassword = userRegisterForm.getPassword();
		if(!enteredEmail.matches(EMAIL_REGEX))
		{
			errors.rejectValue(UserRegisterForm.EMAIL_ADDRESS_FIELD, UserRegisterForm.EMAIL_FORMAT_MESSAGE);
		}
		if(!enteredPassword.matches(PASSWORD_REGEX))
		{
			errors.rejectValue(UserRegisterForm.PASSWORD_FIELD, UserRegisterForm.PASSWORD_FORMAT_MESSAGE);
		}
		if(!enteredFullName.matches(NAME_REGEX))
		{
			errors.rejectValue(UserRegisterForm.FULL_NAME_FIELD, UserRegisterForm.FULL_NAME_FORMAT_MESSAGE);
		}
		
		if(!enteredPhone.matches(PHONE_REGEX))
		{
			errors.rejectValue(UserRegisterForm.PHONE_NUMBER_FIELD, UserRegisterForm.PHONE_FORMAT_MESSAGE);
		}

	}

}
