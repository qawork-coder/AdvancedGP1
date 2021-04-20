package base;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.Log;

public class BaseSetup {

	public WebDriver driver;

	@Parameters("browser")

	@BeforeClass

	public void beforeTest(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {

			// Initializing the firefox driver (Gecko)
			System.setProperty("webdriver.gecko.driver",
					"D:/SeleniumBrowserDriversJarFiles/geckodriver-v0.29.1-win64/geckodriver.exe");
			driver = new FirefoxDriver(); DOMConfigurator.configure("log4j.xml");

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Initialize the chrome driver
			System.setProperty("webdriver.chrome.driver",
					"D:\\SeleniumBrowserDriversJarFiles\\chromedriver_win32_89\\chromedriver.exe");
			driver = new ChromeDriver();
			 DOMConfigurator.configure("log4j.xml");

		}

		driver.get("https://www.demoqa.com");

	}
 @Test public void login() throws InterruptedException {
	 Log.startTestCase("login");
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		 Log.info("My Account link element found");
		 Log.endTestCase("Login test Cases Ended");
		 } 
}
