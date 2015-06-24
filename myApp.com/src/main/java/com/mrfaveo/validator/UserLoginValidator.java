/**
 * 
 */
package com.mrfaveo.validator;

import com.mrfaveo.form.UserLoginForm;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author dev
 *
 */
@Component
public class UserLoginValidator implements Validator, ValidatorConstants{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserLoginForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object form, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, UserLoginForm.EMAIL_FIELD, UserLoginForm.EMAIL_MISSING_MESSAGE);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, UserLoginForm.PASSWORD_FIELD, UserLoginForm.PASSWORD_MISSING_MESSAGE);
		
		UserLoginForm loginForm = (UserLoginForm) form;
		String enteredEmail = loginForm.getEmail();
		String enteredPassword = loginForm.getPassword();
		if(!enteredEmail.matches(EMAIL_REGEX))
		{
			errors.rejectValue(UserLoginForm.EMAIL_FIELD, UserLoginForm.EMAIL_FORMAT_MESSAGE);
		}
		if(!enteredPassword.matches(PASSWORD_REGEX))
		{
			errors.rejectValue(UserLoginForm.PASSWORD_FIELD, UserLoginForm.PASSWORD_FORMAT_MESSAGE);
		}
		
	}

}
