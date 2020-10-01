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
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkMobileNumber("91 9559473852");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkMobileNumber("91 955947385");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration();
		 try {
	    	 boolean result = userRegistration.checkMobileNumber(null);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration();
		try {
		    boolean result = userRegistration.checkMobileNumber("");
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkPassword("AbZWcKfghw854asfgdh@");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkPassword("Abc@$67");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result = userRegistration.checkPassword("13213HGGSAabcdHIdffgh");
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenPassword_WhenNull_ShouldReturnEnterProperMood() {
		 UserRegistration userRegistration = new UserRegistration();
		 try {
	    	 boolean result = userRegistration.checkPassword(null);
	    	 Assert.assertEquals(false,result);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());
	    }
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnEnterProperMood() {
	UserRegistration userRegistration = new UserRegistration();
		try {
		    boolean result = userRegistration.checkPassword("");
		    Assert.assertEquals(false,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter Proper Mood", e.getMessage());			
		}
	}
		
}
  
