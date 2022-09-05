package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SuccessValidationPage {

	public WebDriver driver;

	public SuccessValidationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Initialize the WebElements
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your account was created successfully')]")
	WebElement successMsg;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Log Out')]")
	WebElement logout;



	// Method for WebElements
	public String getSuccessMsg() {
		String actSuccessMsgText = successMsg.getText();
		return actSuccessMsgText;
	}

	public void clickLogOut() {
		logout.click();
		System.out.println("Logged Out of the Account !");
	}

}
