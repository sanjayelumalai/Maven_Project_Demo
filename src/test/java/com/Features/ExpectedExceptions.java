package com.Features;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	
	@Test(expectedExceptions =ArithmeticException.class )
	private void Data1() {
		int a=10;
		int b=0;
		System.out.println(a/b);

	}
	

}
