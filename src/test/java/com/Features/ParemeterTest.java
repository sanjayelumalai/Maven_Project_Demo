package com.Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParemeterTest {
	
	
	
	@Test
	@Parameters({"username","password"})
	private static void AccountDetails(@Optional("Smith")String username,@Optional("Smith@1123") String password) {
		
		System.out.println("USERNAME :"+username);
		System.out.println("Password :"+password);
		

	}
	

}
