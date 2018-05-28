package com.niit.JUnitTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.niit.entities.Employee;

public class EmployeeTest {

	Employee emp;
	@Before
	public void setUp() throws Exception
	{
		  emp=new Employee();
		   
	}

	 @Test
	    public void testValidate() {
	        assertEquals("Validation Input Error","Failed!!!",emp.validate());    
	    }
	
}
