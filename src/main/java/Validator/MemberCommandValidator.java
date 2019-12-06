package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import CommandMember.MemberCommand;

public class MemberCommandValidator implements Validator{

	private static final String emailRegExp = "^[_A-Za-z0-9-]+(.[_A-Za-z0-9]+)*@(?:\\w+\\.)+\\w+$"; 
	private static final String birthReExp = "^\\d{4}-\\d{2}-\\d{2}$";
	private static final String phoneReExp = "^\\d{3}-\\d{4}-\\d{4}$";
	
		

	private Pattern pattern;
	private Pattern birthPattern;
	private Pattern phonePattern;
	
	public MemberCommandValidator() { 
		pattern = Pattern.compile(emailRegExp);
		birthPattern = Pattern.compile(birthReExp);
		phonePattern = Pattern.compile(phoneReExp);
	}
	
	public boolean supports(Class<?> clazz) {
		
		return MemberCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		MemberCommand memCmd = (MemberCommand) target; 
		if (memCmd.getMemEmail() == null || memCmd.getMemEmail().trim().isEmpty()) {
			errors.rejectValue("memEmail", "required");
		} else {
			Matcher matcher = pattern.matcher(memCmd.getMemEmail());	
			if(!matcher.matches()) {
				errors.rejectValue("memEmail", "bad"); 
			}
		}

		if (memCmd.getMemBirth() == null || memCmd.getMemBirth().trim().isEmpty()) {
			errors.rejectValue("memBirth", "required");
		} else {
			Matcher matcher = birthPattern.matcher(memCmd.getMemBirth());	
			if(!matcher.matches()) {
				errors.rejectValue("memBirth", "bad1"); 
			}
		}
		
		if (memCmd.getMemTel() == null || memCmd.getMemTel().trim().isEmpty()) {
			errors.rejectValue("memTel", "required");
		} else {
			Matcher matcher = phonePattern.matcher(memCmd.getMemTel());	
			if(!matcher.matches()) {
				errors.rejectValue("memTel", "bad2"); 
			}
		}
		

		ValidationUtils.rejectIfEmpty(errors, "memId", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPwCon", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memName", "required"); 
		ValidationUtils.rejectIfEmpty(errors, "memAddr2", "required");
		
		
		
	}

}
