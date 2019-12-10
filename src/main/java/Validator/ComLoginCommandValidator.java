package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Login.ComLoginCommand;

public class ComLoginCommandValidator implements Validator { 

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ComLoginCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "comId", "required");
		ValidationUtils.rejectIfEmpty(errors, "comPw", "required");
		
	}

}
