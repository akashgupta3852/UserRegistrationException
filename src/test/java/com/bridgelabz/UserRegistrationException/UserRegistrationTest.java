package com.bridgelabz.UserRegistrationException;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkFirstName.validate(userRegistration.firstName);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnEnterProperFirstName() {
		UserRegistration userRegistration =  new UserRegistration("Ak@sh","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkFirstName.validate(userRegistration.firstName);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper First Name", e.getMessage());
	    }
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnEnterProperFirstName() {
		UserRegistration userRegistration =  new UserRegistration("Ak","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkFirstName.validate(userRegistration.firstName);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper First Name", e.getMessage());
	    }
	}
	
	@Test
	public void givenFirstName_WhenWithNumericChars_ShouldReturnEnterProperFirstName() {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkFirstName.validate(userRegistration.firstName);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper First Name", e.getMessage());
	    }
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnEnterProperFirstName() {
		 UserRegistration userRegistration = new UserRegistration(null,"Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		 try {
			 userRegistration.checkFirstName.validate(userRegistration.firstName);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());
	    }
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnEnterProperFirstName() {
	UserRegistration userRegistration = new UserRegistration("","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkFirstName.validate(userRegistration.firstName);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());			
		}
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkLastName.validate(userRegistration.lastName);
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnEnterProperLastName() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupt@","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkLastName.validate(userRegistration.lastName);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Last Name", e.getMessage());
	    }
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnEnterProperLastName() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gu","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkLastName.validate(userRegistration.lastName);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Last Name", e.getMessage());
	    }
	}
	
	@Test
	public void givenLastName_WhenWithNumericChars_ShouldReturnEnterProperLastName() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta123","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkLastName.validate(userRegistration.lastName);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Last Name", e.getMessage());
	    }
	}	
	
	@Test
	public void givenLastName_WhenNull_ShouldReturnEnterProperLastName() {
		 UserRegistration userRegistration = new UserRegistration("Akash",null,"akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		 try {
			 userRegistration.checkLastName.validate(userRegistration.lastName);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());
	    }
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnEnterProperLastName() {
	UserRegistration userRegistration = new UserRegistration("Akash","","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkLastName.validate(userRegistration.lastName);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());			
		}
	}	
	
	
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkEmailAddress.validate(userRegistration.emailId);
	    Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnEmailAddress() {
		UserRegistration userRegistration =  new UserRegistration("Akash123","Gupta","akashgupta3852@gmail..com","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkEmailAddress.validate(userRegistration.emailId);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Email Address", e.getMessage());
	    }
	}
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnEnterProperEmailAddress() {
		 UserRegistration userRegistration = new UserRegistration("Akash","Gupta",null,"91 9559473852","AS@#A7123");
		 try {
			 userRegistration.checkEmailAddress.validate(userRegistration.emailId);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());
	    }
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnEnterProperEmailAddress() {
	UserRegistration userRegistration = new UserRegistration("Akash","Gupta","","91 9559473852","AS@#A7123");
		try {
			userRegistration.checkEmailAddress.validate(userRegistration.emailId);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());			
		}
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AS@#A7123");
		boolean result = userRegistration.checkMobileNumber.validate(userRegistration.mobileNum);
	    Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenMobileNumber_WhenNotProper_ShouldReturnEnterProperMobileNumber() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 955947385","AS@#A7123");
		try {
			userRegistration.checkMobileNumber.validate(userRegistration.mobileNum);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Mobile Number", e.getMessage());			
		}
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnEnterEnterProperMobileNumber() {
		 UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com",null,"AS@#A7123");
		 try {
			 userRegistration.checkMobileNumber.validate(userRegistration.mobileNum);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());
	    }
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnEnterProperMobileNumber() {
	UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","","AS@#A7123");
		try {
			userRegistration.checkMobileNumber.validate(userRegistration.mobileNum);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());			
		}
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","AbZWcKfghw854asfgdh@");
		boolean result = userRegistration.checkPassword.validate(userRegistration.password);
	    Assert.assertEquals(true,result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnEnterProperPassword() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","Ab@$67");
		try {
		    userRegistration.checkPassword.validate(userRegistration.password);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Password", e.getMessage());			
		}
	}
	
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnEnterProperPassword() {
		UserRegistration userRegistration =  new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","13213HGGSAabcdHIdffgh");
		try {
			userRegistration.checkPassword.validate(userRegistration.password);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Password", e.getMessage());			
		}
	}
	
	@Test
	public void givenPassword_WhenNull_ShouldReturnEnterProperPassword() {
		 UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852",null);
		 try {
	    	 userRegistration.checkPassword.validate(userRegistration.password);
	    }catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());
	    }
	}
	
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnEnterProperPassword() {
	UserRegistration userRegistration = new UserRegistration("Akash","Gupta","akashgupta3852@gmail.com","91 9559473852","");
		try { 
			userRegistration.checkPassword.validate(userRegistration.password);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
			Assert.assertEquals("Enter proper data", e.getMessage());			
		}
	}
		
}
  
