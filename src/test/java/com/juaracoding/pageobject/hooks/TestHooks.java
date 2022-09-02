package com.juaracoding.pageobject.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class TestHooks {
	
	@Before
	public void methodBefore() {
		System.out.println("Method Before");
	}

	@AfterAll
	public static void methodAfter() {
		System.out.println("Method After All");
	}



}
