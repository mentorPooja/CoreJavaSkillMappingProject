package com.niit.JUnitTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.validation.*;

public class ValidateTest {

	@Before
	public void setUp() throws Exception 
	{
		
	}
/*
	@Test
	public void testEmailValidate() {
		assertEquals("Invalid Email","true",Validation.emailValidate("pooja_11@gmail.com"));
	}

	@Ignore
	@Test
	public void testMobileValidate() {
		assertEquals("Invalid Mobile","true",Validation.mobileValidate(9604864655));
		}

	@Ignore
	*/
	@Test
	public void testPasswordValidate() {
		assertEquals("Invalid Password","true",MyValidation.passwordValidate("niit@123"));
		}

}
