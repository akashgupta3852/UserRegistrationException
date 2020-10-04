package com.bridgelabz.UserRegistrationException;

import java.util.regex.Pattern;

@FunctionalInterface
interface ICheck{
	public boolean validate(String str) throws UserRegistrationException;
}

public class UserRegistration {
	public String firstName,lastName,emailId,mobileNum,password;
	
	private static final String NAME_PATTERN="^[A-Z][a-z]{2,}";
	private static final String EMAIL_ADDRESS_PATTERN="^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String MOBILE_NUMBER_PATTERN="^[0-9]{2}[\\s]{1}[6-9][0-9]{9}$";
	private static final String PASSWORD_PATTERN="(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W]).{8,}";
	
	public UserRegistration() {
		
	}
	
	public UserRegistration(String firstName, String lastName, String emailId, String mobileNum, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNum = mobileNum;
		this.password = password;
	}
	
	ICheck isEmptyNull = (data) -> {
		if(data==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(data.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
		return false;
	};
										

	ICheck checkFirstName = (fName)-> {
		isEmptyNull.validate(fName);
		Pattern pattern = Pattern.compile(NAME_PATTERN);
			return pattern.matcher(fName).matches();
	};

	ICheck checkLastName = (lName)-> {
		isEmptyNull.validate(lName);
		Pattern pattern = Pattern.compile(NAME_PATTERN);
	    	return pattern.matcher(lName).matches();
	};									

	ICheck checkEmailAddress = (emailAddress)-> {
		isEmptyNull.validate(emailAddress);
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
	    	return pattern.matcher(emailAddress).matches();
	};												

	ICheck checkMobileNumber = (mobileNumber)-> {
		isEmptyNull.validate(mobileNumber);
		Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
	    	return pattern.matcher(mobileNumber).matches();
	};												

	ICheck checkPassword = (password)-> {
		isEmptyNull.validate(password);
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
	    	return pattern.matcher(password).matches();
	};										
	
    public void printWelcome() {
        System.out.println( "Welcome to User Registration Problem" );
    }
    
}
