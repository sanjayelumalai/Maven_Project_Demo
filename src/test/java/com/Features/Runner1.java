package com.Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Runner1 {

	@Test
	private void Mobile() {
		System.out.println("Mobile");
	}
	
	@Test(priority = -1)
	private void Username() {
		System.out.println("Username");
	}
	@Test(priority = 1)
	private void Login() {
		System.out.println("Login");
	}
	
	@Ignore
	@Test
	
	private void Mobile1() {
		System.out.println("Mobile Ignore");
	}
	

}
