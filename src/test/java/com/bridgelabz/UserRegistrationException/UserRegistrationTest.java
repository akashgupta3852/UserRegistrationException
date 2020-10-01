package com.bridgelabz.UserRegistrationException;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Ak@sh","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Ak","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenWithNumericChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration(null,"Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		 try {
	    	 boolean result = userRegistration.checkFirstName(null);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration("","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
		    boolean result = userRegistration.checkFirstName(userRegistration.firstName);
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue () throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupt@","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gu","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenWithNumericChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta123","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName(userRegistration.lastName);
		Assert.assertEquals(false,result);
	}	
	
	@Test
	public void givenLastName_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration("Akash",null,"akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		 try {
	    	 boolean result = userRegistration.checkLastName(userRegistration.lastName);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration("Akash","","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
		    boolean result = userRegistration.checkLastName(userRegistration.lastName);
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}	
	
	
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkEmailAddress(userRegistration.emailId);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail..com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkEmailAddress(userRegistration.emailId);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration("Akash","Gupta",null,"91 9559473852","AS@#A7123");
		 try {
	    	 boolean result = userRegistration.checkEmailAddress(userRegistration.emailId);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration("Akash","Gupta","","91 9559473852","AS@#A7123");
		try {
		    boolean result = userRegistration.checkEmailAddress(userRegistration.emailId);
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkMobileNumber(userRegistration.mobileNum);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 955947385","AS@#A7123");
		boolean result = userRegistration.checkMobileNumber(userRegistration.mobileNum);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com",null,"AS@#A7123");
		 try {
	    	 boolean result = userRegistration.checkMobileNumber(userRegistration.mobileNum);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","","AS@#A7123");
		try {
		    boolean result = userRegistration.checkMobileNumber(userRegistration.mobileNum);
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AbZWcKfghw854asfgdh@");
		boolean result = userRegistration.checkPassword(userRegistration.password);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","Abc@$67");
		boolean result = userRegistration.checkPassword(userRegistration.password);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","13213HGGSAabcdHIdffgh");
		boolean result = userRegistration.checkPassword(userRegistration.password);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenPassword_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852",null);
		 try {
	    	 boolean result = userRegistration.checkPassword(userRegistration.password);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","");
		try {
		    boolean result = userRegistration.checkPassword(userRegistration.password);
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
		
}
  
