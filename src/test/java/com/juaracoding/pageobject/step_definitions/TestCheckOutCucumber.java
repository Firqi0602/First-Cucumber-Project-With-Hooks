package com.juaracoding.pageobject.step_definitions;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.LoginAccountCucumber;
import com.juaracoding.pageobject.pages.SampleWishlistCucumber;
import com.juaracoding.pageobject.utils.one.Constants;

import io.cucumber.java.Before;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCheckOutCucumber {
	public static WebDriver driver;
	private LoginAccountCucumber loginAccountCucumber;
	private SampleWishlistCucumber sampleWishlistCucumber;

	public TestCheckOutCucumber() {
		driver = Hooks.driver;
	}

	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		loginAccountCucumber = new LoginAccountCucumber();
		sampleWishlistCucumber = new SampleWishlistCucumber();
	}
	
	
	@When("Go to Web automationpractice")
	public void Go_to_Web_automationpractice() {
		driver.get(Constants.URL);
	}
	
	@And("User enter email address password invalid")
	public void User_enter_email_address_password_invalid() {
		loginAccountCucumber.login("nandiardana0@gmail.com", "firqi0602");			
	}
	
	@And("User press button login")
	public void User_press_button_login() {
		loginAccountCucumber.btnLogin();
	}
	
	@Then("User authentication failed")
	public void User_authentication_failed() {
		assertEquals(loginAccountCucumber.msgFailed(), "Authentication failed.");
	}
	
	@When("User enter email address password valid")
	public void User_enter_email_address_password_valid() {
		loginAccountCucumber.login("nandiardana08@gmail.com", "firqi0602");
	}
	
	@And("User press button login valid")
	public void User_press_button_login_valid() {
		loginAccountCucumber.btnLogin();
	}
	 
	@Then("User can see my account text")
	public void User_can_see_my_account_text() {
		assertEquals(loginAccountCucumber.getTxtMyAccount(), "MY ACCOUNT");
	}
	
	@When("User type printed dress")
	public void User_type_printed_dress() {
		sampleWishlistCucumber.Search("printed dress");
	}
	
	@And("User click button search")
	public void User_click_button_search() {
		sampleWishlistCucumber.btnSearchProduct();
	}
	
	@Then("User can see printed dress product")
	public void User_can_see_printed_dress_product() {
		assertEquals(sampleWishlistCucumber.msgResult(), "5 results have been found.");
		scroll(450);
	}
	
	@Given("User select add to chart in first product")
	public void User_select_add_to_chart_in_first_product() {
		sampleWishlistCucumber.cssPilih1();
		sampleWishlistCucumber.btnChart1();
	}
	
	@And("After succes close first product")
	public void After_succes_close_first_product() {
		sampleWishlistCucumber.btnCloseChart1();
	}
	
	@And("User select add to chart in second product")
	public void User_select_add_to_chart_in_second_product() {
		sampleWishlistCucumber.cssPilih2();
		sampleWishlistCucumber.btnChart2();
	}
	
	@And("User click proceed to checkout")
	public void User_click_proceed_to_checkout() {
		sampleWishlistCucumber.btnCheckOut();
	}
	
	@Then("User can see shoppingcart summary")
	public void User_can_see_shoppingcart_summary(){
		System.out.println(sampleWishlistCucumber.msgSummary()+"xxxxxx");
		assertEquals(sampleWishlistCucumber.msgSummary(), "Your shopping cart contains: 2 Products");
	scroll(200);
	delay(5);
	scroll(200);
	delay(5);
	scroll(300);
	}
	
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}

