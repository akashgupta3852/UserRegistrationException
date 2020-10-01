package com.bridgelabz.UserRegistrationException;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_PATTERN="^[A-Z][a-z]{2,}";
	
	public boolean checkFirstName(String fName) throws UserRegistrationException {
		if(fName==null)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL ,"Enter Proper Mood");
		if(fName.length()==0)
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_EMPTY ,"Enter Proper Mood");
	    Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
	    	return pattern.matcher(fName).matches();
    }
	
    public void printWelcome() {
        System.out.println( "Welcome to User Registration Problem" );
    }
    
}