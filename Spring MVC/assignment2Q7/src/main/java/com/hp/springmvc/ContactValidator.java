package com.hp.springmvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactValidator implements ConstraintValidator<Contact, String> {

	@Override
	public void initialize(Contact arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		if (arg0.length() == 11)
			return false;
		else
			return true;
	}

}
