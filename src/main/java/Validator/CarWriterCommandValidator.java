package Validator;



import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Car.CarWriterCommand;



public class CarWriterCommandValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return CarWriterCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		CarWriterCommand carWriterRegReq = (CarWriterCommand)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"driveName","carrequired");
		
		if(!carWriterRegReq.getDriveName().equals(carWriterRegReq.getCarMemName())) {
			errors.rejectValue("driveName", "notNameMatch");
		}
		
		
	}
	


	

}
