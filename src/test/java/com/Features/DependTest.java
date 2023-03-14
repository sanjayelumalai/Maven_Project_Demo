package com.Features;

import org.testng.annotations.Test;

public class DependTest {
	
	
	
	@Test(enabled = true)
	private void Secoundry() {
		System.out.println("6'th To 10Th ");

	}
	@Test(dependsOnMethods = "Secoundry")
	private void HigherSecoundry() {
		System.out.println("11'th To 12'th");

	}
	
	@Test(dependsOnMethods ="HigherSecoundry" )
	private void College() {
		System.out.println("4 years");
	}
	
	

}
