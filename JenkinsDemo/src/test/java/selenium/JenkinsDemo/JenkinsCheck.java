package selenium.JenkinsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsCheck {

	public WebDriver driver;
	public WebDriverWait wait;

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

		System.out.println("Application Launched Successfully !");

	}

	@Test(priority = 2)
	public void closeApplication() {
		// close the browser
		driver.close();
		Reporter.log("Application closed !");

	}

}
