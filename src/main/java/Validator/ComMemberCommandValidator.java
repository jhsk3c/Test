package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import CommandMember.ComMemberCommand;

public class ComMemberCommandValidator implements Validator{
	
	private static final String emailRegExp = "^[_A-Za-z0-9-]+(.[_A-Za-z0-9]+)*@(?:\\w+\\.)+\\w+$"; 
	private static final String phoneReExp = "^\\d{3}-\\d{4}-\\d{4}$";
	private static final String licenseNumberReExp = "^\\d{3}-\\d{2}-\\d{5}$";
	
	private Pattern pattern;
	private Pattern phonePattern;
	private Pattern licenseNumberPattern;
	
	public ComMemberCommandValidator() { 
		pattern = Pattern.compile(emailRegExp);
		phonePattern = Pattern.compile(phoneReExp);
		licenseNumberPattern = Pattern.compile(licenseNumberReExp);
	}

	@Override
	public boolean supports(Class<?> clazz) {
	
		return ComMemberCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ComMemberCommand comCmd = (ComMemberCommand) target; 
		if (comCmd.getContactEmail() == null || comCmd.getContactEmail().trim().isEmpty()) {
			errors.rejectValue("contactEmail", "required");
		} else {
			Matcher matcher = pattern.matcher(comCmd.getContactEmail());	
			if(!matcher.matches()) {
				errors.rejectValue("contactEmail", "combad"); 
			}
		}

		if (comCmd.getContactPhoneNum() == null || comCmd.getContactPhoneNum().trim().isEmpty()) {
			errors.rejectValue("contactPhoneNum", "required");
		} else {
			Matcher matcher = phonePattern.matcher(comCmd.getContactPhoneNum());	
			if(!matcher.matches()) {
				errors.rejectValue("contactPhoneNum", "combad1"); 
			}
		}
		
		if (comCmd.getLicenseNumber() == null || comCmd.getLicenseNumber().trim().isEmpty()) {
			errors.rejectValue("licenseNumber", "required");
		} else {
			Matcher matcher = licenseNumberPattern.matcher(comCmd.getLicenseNumber());	
			if(!matcher.matches()) {
				errors.rejectValue("licenseNumber", "combad3"); 
			}
		}
		
		ValidationUtils.rejectIfEmpty(errors, "comPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "comPwCon", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "comRepName", "required"); 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "comName", "required"); 
		ValidationUtils.rejectIfEmpty(errors, "comAddr2", "required");


		
		if(!comCmd.getComPw().isEmpty()){
			if(!comCmd.isPwEqualToPwCon()) {
				errors.rejectValue("comPwCon", "combad2");
			}
		}
	}

}
