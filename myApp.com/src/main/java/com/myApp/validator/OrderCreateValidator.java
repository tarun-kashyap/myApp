/**
 * 
 */
package com.myApp.validator;

import com.myApp.form.OrderCreateForm;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author dev
 *
 */
public class OrderCreateValidator implements Validator, ValidatorConstants {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return OrderCreateForm.class.isAssignableFrom(clazz);
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object form, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, OrderCreateForm.ADDRESS_LINE_1_FIELD, OrderCreateForm.ADDRESS_LINE_1_MISSING_MESSAGE);

	}

}
