package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ParaBankHomePage {

	public WebDriver driver;

	public ParaBankHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Initialize the Weblements
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
	WebElement registrationPageLink;

	// Method for WebElements
	public void navigateToRegistrationForm()
	{
		registrationPageLink.click();

		Reporter.log("Navigated to Para Bank Registration Page");

	}


}
