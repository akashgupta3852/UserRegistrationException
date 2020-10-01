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
		boolean result1 = userRegistration.checkEmailAddress("abc@yahoo.com");
		boolean result2 = userRegistration.checkEmailAddress("abc-100@yahoo.com");
		boolean result3 = userRegistration.checkEmailAddress("abc.100@yahoo.com");
		boolean result4 = userRegistration.checkEmailAddress("abc111@abc.com");
		boolean result5 = userRegistration.checkEmailAddress("abc-100@abc.net");
		boolean result6 = userRegistration.checkEmailAddress("abc.100@abc.com.au");
		boolean result7 = userRegistration.checkEmailAddress("abc@gmail.com.com");
		boolean result8 = userRegistration.checkEmailAddress("abc@1.com");
		boolean result9 = userRegistration.checkEmailAddress("abc+100@gmail.com");
		Assert.assertEquals(true,result1);
		Assert.assertEquals(true,result2);
		Assert.assertEquals(true,result3);
		Assert.assertEquals(true,result4);
		Assert.assertEquals(true,result5);
		Assert.assertEquals(true,result6);
		Assert.assertEquals(true,result7);
		Assert.assertEquals(true,result8);
		Assert.assertEquals(true,result9);
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration();
		boolean result1 = userRegistration.checkEmailAddress("abc");
		boolean result2 = userRegistration.checkEmailAddress("abc@.com.my");
		boolean result3 = userRegistration.checkEmailAddress("abc123@gmail.a");
		boolean result4 = userRegistration.checkEmailAddress("abc123@.com");
		boolean result5 = userRegistration.checkEmailAddress("abc123@.com.com");
		boolean result6 = userRegistration.checkEmailAddress(".abc@abc.com");
		boolean result7 = userRegistration.checkEmailAddress("abc()*@gmail.com");
		boolean result8 = userRegistration.checkEmailAddress("abc@%*.com");
		boolean result9 = userRegistration.checkEmailAddress("abc..2002@gmail.com");
		boolean result10 = userRegistration.checkEmailAddress("abc.@gmail.com");
		boolean result11 = userRegistration.checkEmailAddress("abc@abc@gmail.com");
		boolean result12 = userRegistration.checkEmailAddress("abc@gmail.com.1a");
		boolean result13 = userRegistration.checkEmailAddress("abc@gmail.com.aa.au");
		Assert.assertEquals(false,result1);
		Assert.assertEquals(false,result2);
		Assert.assertEquals(false,result3);
		Assert.assertEquals(false,result4);
		Assert.assertEquals(false,result5);
		Assert.assertEquals(false,result6);
		Assert.assertEquals(false,result7);
		Assert.assertEquals(false,result8);
		Assert.assertEquals(false,result9);
		Assert.assertEquals(false,result10);
		Assert.assertEquals(false,result11);
		Assert.assertEquals(false,result12);
		Assert.assertEquals(false,result13);
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
  
