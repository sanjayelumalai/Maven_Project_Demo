package com.Features;

import java.io.Closeable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotaions {

	@BeforeSuite
	private void Setproperty() {
		System.out.println(" Set Property");
	}

	@BeforeTest
	private void Browserlaunch() {
		System.out.println(" browser launched");
	}

	@BeforeClass
	private void urllaunch() {
		System.out.println("Url launched");
	}

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}

	@Test(priority = -1,invocationCount = 3,enabled = false)
	private void mobile() {
		System.out.println("Mobile");

	}

	@Test(priority = 1)

	private void dress() {
		System.out.println("dress");

	}

	@Test()
	private void headphone() {
		System.out.println("headphone");
	}

	@AfterMethod
	private void Logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void HomePage() {
		System.out.println(" HomePage");
	}

	@AfterTest
	private void Cookies() {
		System.out.println(" Remove Cookies");
	}

	@AfterSuite
	private void close() {
		System.out.println(" browser Closed");
	}
}
