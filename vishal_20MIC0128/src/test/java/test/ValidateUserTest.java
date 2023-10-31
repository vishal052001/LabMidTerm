package test;

import static org.junit.Assert.*;

import org.junit.Test;

import vishal_20MIC0128.ValidateUser;

public class ValidateUserTest {

	@Test 
	public void testValidUser() { 
		boolean n = ValidateUser.validate("Ram", "3025"); 
		System.out.println("1 Welcome Ram");	
	} 
	
	@Test public void testInvalidUser() { 
		boolean n = ValidateUser.validate("Vishal", "abcd"); 
		System.out.println("Not Authorized");
		}

}
