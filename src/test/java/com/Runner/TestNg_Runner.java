package com.Runner;

import org.testng.annotations.Test;

public class TestNg_Runner {

	@Test(groups = "book")
	private void PSNovel() {
		System.out.println("PS novel");
	}

	@Test(groups = "SM")
	private void Facebook() {
		System.out.println("facebook");
	}

	@Test(groups = "SM")
	private void instagram() {
		System.out.println("Insta");
	}

	@Test(groups = "book")
	private void yourname() {
		System.out.println("Book");
	}

	@Test(groups = "music")
	private void wynkmusic() {
		System.out.println("Wynk Music");
	}

	@Test(groups = "music")
	private void Spotify() {
		System.out.println(" Spotify Music ");
	}

}
