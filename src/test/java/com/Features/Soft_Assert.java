package com.Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {

	@Test
	private void username() {

		String exp = "starc123";

		String act = "smith123";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(exp, act);

		System.out.println("**Done**");

	}
}
