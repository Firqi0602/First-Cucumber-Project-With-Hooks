package com.juaracoding.pageobject.hooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSample {
	
	@When("I complete action")
	public void I_complete_action() {
		System.out.println("I complete action");
	}
	
	@And("some other action")
	public void some_other_action() {
		System.out.println("some other action");
	}

	@And("yet another action")
	public void yet_another_action() {
		System.out.println("yet another action");
	}

	@Then("I validate the outcomes")
	public void I_validate_the_outcomes() {
		System.out.println("I validate the outcomes");
	}






}
