package com.telus.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.telus.pages.ParaBankHomePage;
import com.telus.pages.ParaBankRegisterPage;
import com.telus.pages.SuccessValidationPage;

public class ParaBankRegisterationFlow {

	public WebDriver driver;
	public WebDriverWait wait;

	// Inputs
	String firstNameInput = "Ankit";
	String lastNameInput = "Saxena";
	String streetAddressInput = "Lane-4, Sector-2";
	String cityInput = "Noida";
	String stateInput = "Uttar Pradesh";
	String zipCodeInput = "201204";
	String phoneNumberInput = "7766554422";
	String ssnInput = "999999999";
	String userNameInput = "ankitsaxena21";
	String pswdInput = "22334455";
	String confirmPswdInput = "22334455";
	String expSuccessMsgText = "Your account was created successfully";

	@Test(priority = 1)
	public void launchApplication() {
		// Set system property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");

		// Instantiate the Chrome Driver
		driver = new ChromeDriver();

		// Launch the URL
		String url = "https://parabank.parasoft.com/parabank/index.htm";
		driver.get(url);

		// Maximize the browser
		driver.manage().window().maximize();

		Reporter.log("Application Launched Successfully !");

	}

	@Test(priority = 2)
	public void fillRegistrationForm() {

		// Navigate to Registration Form
		ParaBankHomePage homepage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homepage.navigateToRegistrationForm();

		ParaBankRegisterPage registrationPage = PageFactory.initElements(driver, ParaBankRegisterPage.class);

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		// Enter the First Name
		registrationPage.setFirstName(firstNameInput);
		// Enter the Last Name
		registrationPage.setLastName(lastNameInput);
		// Enter the Street Address
		registrationPage.setStreetAddress(streetAddressInput);
		// Enter the city
		registrationPage.setCity(cityInput);
		// Enter the state
		registrationPage.setState(stateInput);
		// Enter the zip code
		registrationPage.setZipCode(zipCodeInput);
		// Enter the Mobile Number
		registrationPage.setPhoneNo(phoneNumberInput);
		// Enter the SSN
		registrationPage.setSSN(ssnInput);
		// Enter the UserName
		registrationPage.setUserName(userNameInput);
		// Enter the Password
		registrationPage.setPassword(pswdInput);
		// Enter the Confirm Password
		registrationPage.setConfirmPassword(confirmPswdInput);
		// Click on Submit Button
		registrationPage.clickSubmitBtn();

	}

	@Test(priority = 3)
	public void validateSuccessfulMsg() {
		SuccessValidationPage successpage = PageFactory.initElements(driver, SuccessValidationPage.class);

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// Get Actual Successful Message Text
		String actSuccessMsgText = successpage.getSuccessMsg();
		// Validate Successful Message Text
		String arrActualSuccessMsg[] = actSuccessMsgText.split("\\.");
		String successMsgText = arrActualSuccessMsg[0].trim();

		if (actSuccessMsgText.contains(expSuccessMsgText)) {
			Reporter.log("Actual and Expected Successful Message are Same");
			Reporter.log("Actual Successful Message is " + successMsgText);
			Reporter.log("Expected Successful Message is " + expSuccessMsgText);
		} else {
			Reporter.log("Actual and Expected Successful Message are Not Same");
			Reporter.log("Actual Successful Message is " + successMsgText);
			Reporter.log("Expected Successful Message is " + expSuccessMsgText);
		}

	}

	@Test(priority = 4)
	public void logoutAccount() {
		SuccessValidationPage successpage = PageFactory.initElements(driver, SuccessValidationPage.class);

		// Logout of the Account
		successpage.clickLogOut();
	}

	@Test(priority = 5)
	public void closeApplication() {
		// close the browser
		driver.close();
		Reporter.log("Application closed !");

	}

}
