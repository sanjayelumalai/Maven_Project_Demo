package com.Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {

	
	private static void username() {
		
		String exp = "starc123";
		
		String act ="smith123";
		
		Assert.assertNotEquals(act, exp);
		
		System.out.println("**Done**");

	}
	public static void main(String[] args) {
		username();
		
	}
	
	
}
