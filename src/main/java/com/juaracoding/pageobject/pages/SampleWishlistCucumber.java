package com.juaracoding.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class SampleWishlistCucumber {
	private WebDriver driver;

	public SampleWishlistCucumber() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	//input[@id='search_query_top']
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement btnSearchProduct;
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	private WebElement msgResult;
	
	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")
	private WebElement btnChart1;
	
	@FindBy(xpath = "//span[@title='Close window']")
	private WebElement btnCloseChart1;
	
	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line hovered']//span[contains(text(),'Add to cart')]")
	private WebElement btnChart2;
	
	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	private WebElement btnCheckout;
	
	@FindBy(xpath = "//*[@id=\"cart_title\"]/span")
	private WebElement msgSummary;
	
	public void Search(String product) {
		this.btnSearch.sendKeys(product);
	}
	
	public void btnSearch() {
		btnSearch.click();
	}
	
	public void btnSearchProduct() {
		btnSearchProduct.click();
	}
	
	public String msgResult() {
		return msgResult.getText();
	}
	
	public void cssPilih1() {
		WebElement mouse = driver.findElement(By.cssSelector(".replace-2x.img-responsive[src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouse).build().perform();
	}
	
	
	public void btnChart1() {
		btnChart1.click();
	}
	
	public void btnCloseChart1() {
		btnCloseChart1.click();
	}
	
	public void cssPilih2() {
		WebElement mouse = driver.findElement(By.cssSelector(".replace-2x.img-responsive[src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouse).build().perform();
	}
	
	public void btnChart2() {
		btnChart2.click();
	}
	
	public void btnCheckOut() {
		btnCheckout.click();
	}
	 
	public String msgSummary() {
		return msgSummary.getText();
	}
	
}


