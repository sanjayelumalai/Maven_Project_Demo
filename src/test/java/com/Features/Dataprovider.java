package com.Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider = "Data_Pass")
	private static void AccountDetails(String username, String password) {

		System.out.println("USERNAME :" + username);
		System.out.println("Password :" + password);

	}

	@DataProvider
	private Object[][] Data_Pass() {

		return new Object[][] { { "Steve", "1234" }, { "Smith@123", "Smi1233" }, { "Sam", "1236" }

		};

	}
}
