package com.bridgelabz.UserRegistrationException;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Akash");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Ak@sh");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Ak");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenWithNumericChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkFirstName("Akash123");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration();
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
	UserRegistration userRegistration = new UserRegistration();
		try {
		    boolean result = userRegistration.checkFirstName("");
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue () throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gupta");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gupt@");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gu");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenLastName_WhenWithNumericChars_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkLastName("Gupta123");
		Assert.assertEquals(false,result);
	}	
	
	@Test
	public void givenLastName_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration();
		 try {
	    	 boolean result = userRegistration.checkLastName(null);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration();
		try {
		    boolean result = userRegistration.checkLastName("");
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}	
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkEmailAddress("akashgupta3852@gmail.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkEmailAddress("akashgupta3852@gmail..com");
		Assert.assertEquals(false,result);
	}	
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration();
		 try {
	    	 boolean result = userRegistration.checkEmailAddress(null);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration();
		try {
		    boolean result = userRegistration.checkEmailAddress("");
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}	
		
}
  
