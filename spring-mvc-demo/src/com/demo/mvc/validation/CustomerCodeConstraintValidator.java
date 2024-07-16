package com.demo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerCodeConstraintValidator
		implements ConstraintValidator<CustomerCode, String> {

	private String CodePrefix;

	//
	public void initialize(CustomerCode customerCode) {
		CodePrefix = customerCode.value();
	}

	@Override
	public boolean isValid(String customerCode,
			ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		if(customerCode != null){
			result = customerCode.startsWith(CodePrefix);
		} else {
			result = true;
		}
		return result;
	}

}
