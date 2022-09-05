package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ParaBankRegisterPage {

	public WebDriver driver;

	public ParaBankRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Initialize the WebElements
	@FindBy(how = How.XPATH, using = "//input[@id='customer.firstName']")
	WebElement firstName;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.lastName']")
	WebElement lastName;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.street']")
	WebElement streetAddress;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.city']")
	WebElement city;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.state']")
	WebElement state;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.zipCode']")
	WebElement zipCode;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.phoneNumber']")
	WebElement phoneNo;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.ssn']")
	WebElement ssn;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.username']")
	WebElement userName;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.password']")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@id='repeatedPassword']")
	WebElement confirmPassword;

	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Register']")
	WebElement submitBtn;

	// Methods for WebElements
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
		System.out.println("First name is " + fname);
	}

	public void setLastName(String lname) {
		lastName.sendKeys(lname);
		System.out.println("Last name is " + lname);
	}


	public void setStreetAddress(String strtAdd) {
		streetAddress.sendKeys(strtAdd);
		System.out.println("Street Address is " + strtAdd);
	}

	public void setCity(String cityName) {
		city.sendKeys(cityName);
		System.out.println("City is " + cityName);
	}

	public void setState(String stateName) {
		state.sendKeys(stateName);
		System.out.println("State is " + stateName);
	}

	public void setZipCode(String zip) {
		zipCode.sendKeys(zip);
		System.out.println("Zip Code is " + zip);
	}

	public void setPhoneNo(String phNo) {
		phoneNo.sendKeys(phNo);
		System.out.println("Phone Number is " + phNo);
	}

	public void setSSN(String ssNo) {
		ssn.sendKeys(ssNo);
		System.out.println("SSN is " + ssNo);
	}

	public void setUserName(String usrNm) {
		userName.sendKeys(usrNm);
		System.out.println("User Name is " + usrNm);
	}


	public void setPassword(String pswd) {
		password.sendKeys(pswd);
		System.out.println("Password is " + pswd);
	}

	public void setConfirmPassword(String cpswd) {
		confirmPassword.sendKeys(cpswd);
		System.out.println("Confirm Password is " + cpswd);
	}

	public String getPassword() {
		String pswd = password.getText();
		return pswd;
	}

	public String getConfirmPassword() {
		String cpswd = confirmPassword.getText();
		return cpswd;
	}

	public void clickSubmitBtn() {
		submitBtn.click();
		System.out.println("Registration Form Submitted Successfully !");
	}


}
