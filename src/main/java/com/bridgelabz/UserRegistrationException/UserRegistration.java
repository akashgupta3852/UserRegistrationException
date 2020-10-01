package com.bridgelabz.UserRegistrationException;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String NAME_PATTERN="^[A-Z][a-z]{2,}";
	private static final String EMAIL_ADDRESS_PATTERN="^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	private static final String MOBILE_NUMBER_PATTERN="^[0-9]{2}[\\s]{1}[6-9][0-9]{9}$";
	private static final String PASSWORD_PATTERN=".{8,}";
	
	public boolean checkFirstName(String fName) throws UserRegistrationException {
		if(fName==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(fName.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	    Pattern pattern = Pattern.compile(NAME_PATTERN);
	    	return pattern.matcher(fName).matches();
    }
	
	public boolean checkLastName(String lName) throws UserRegistrationException {
		if(lName==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(lName.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	    Pattern pattern = Pattern.compile(NAME_PATTERN);
	    	return pattern.matcher(lName).matches();
    }
	
	public boolean checkEmailAddress(String emailAddress) throws UserRegistrationException {
		if(emailAddress==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(emailAddress.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	    Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
	    	return pattern.matcher(emailAddress).matches();
    }
	
	public boolean checkMobileNumber(String mobileNumber) throws UserRegistrationException {
		if(mobileNumber==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(mobileNumber.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	    Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
	    	return pattern.matcher(mobileNumber).matches();
    }
	
	public boolean checkPassword(String password) throws UserRegistrationException {
		if(password==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(password.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	    Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
	    	return pattern.matcher(password).matches();
    }
	
    public void printWelcome() {
        System.out.println( "Welcome to User Registration Problem" );
    }
}
