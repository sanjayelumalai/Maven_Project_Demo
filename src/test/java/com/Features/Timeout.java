package com.Features;

import org.testng.annotations.Test;

public class Timeout {

	@Test(invocationCount = 3,invocationTimeOut = 3)
	private void data1() {
		System.out.println("Clcik the button");

	}
	@Test(timeOut = 3000)
	private void Value1() {
		System.out.println("value");
	}
}
