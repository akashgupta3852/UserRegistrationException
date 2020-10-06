package com.bridgelabz.UserRegistrationException;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidEmailTest {
	private String emailToTest;
	
	public ValidEmailTest(String emailToTest) {
		this.emailToTest = emailToTest;
	}
	
	@Parameterized.Parameters
	public static Collection data() {
		Object emailCollections[][]=new Object[][] { {"abc@yahoo.com"},
										   {"abc-100@yahoo.com"},
										   {"abc.100@yahoo.com"},
										   {"abc111@abc.com"},
										   {"abc-100@abc.net"},
										   {"abc.100@abc.com.au"},
										   {"abc@1.com"},
										   {"abc+100@gmail.com"},
										   {"abc@gmail.com.com"},
										   {"abc"},
										   {"abc@.com.my"},
										   {"abc123@gmail.a"},
										   {"abc123@.com"},
										   {"abc123@.com.com"},
										   {".abc@abc.com"},
										   {"abc()*@gmail.com"},
										   {"abc@%*.com"},
										   {"abc..2002@gmail.com"},
										   {"abc.@gmail.com"},
										   {"abc@abc@gmail.com"},
										   {"abc@gmail.com.1a"},
										   {"abc@gmail.com.aa.au"} };
        return Arrays.asList(emailCollections);
	}
	
	@Test
	public void givenEmailAsVar_ShouldReturnAsPerParameterizedResult() {
		UserRegistration userRegistration =  new UserRegistration();
		try {
		    boolean result = userRegistration.checkEmailAddress.validate(emailToTest);
		    Assert.assertEquals(true,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_INVALID, e.exceptionType);
			Assert.assertEquals("Enter Proper Email Address", e.getMessage());			
		}
	}	

}
