package com.Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Demo {

	@Test(retryAnalyzer = Analyser.class)
	private void username() {

		String exp = "starc123";

		String act = "smith123";

		Assert.assertEquals(act, exp);

		System.out.println("**Done**");

	}

	@Test
	private void password() {

		String exp = "starc@123";

		String act = "smith@123";

		Assert.assertEquals(act, exp);

		System.out.println("**Done**");

	}
}
