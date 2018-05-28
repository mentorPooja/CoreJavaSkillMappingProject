package com.niit.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyValidation 
{
	 public  boolean emailValidate(String email)
	    {
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	                             
	        Pattern pat = Pattern.compile(emailRegex);
	        if (email == null)
	            return false;
	        return pat.matcher(email).matches();
	    }
	 
	 
	 public  boolean mobileValidate(long mobile)
	 {
		 String mob = Long.toString(mobile);
		 
		 	// 1) Begins with 0 or 91
	        // 2) Then contains 7 or 8 or 9.
	        // 3) Then contains 9 digits
		 Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		 
		 	// to find matching between given number 
	        // and regular expression
		 
		 Matcher match = p.matcher(mob);
	     
		 return (match.find() && match.group().equals(mobile));
	 }
	 
	 
	 //Must contain at least one digit
	 //Must contain at least one of the following special characters @, #, $
	 //Length should be between 6 to 20 characters.
	 
	 public static boolean passwordValidate(String password)
	 {
		 if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
		                     {
		                                     return true;
		                     }
		                     else
		                     {
		                                     return false;
		                     }
	 }

}