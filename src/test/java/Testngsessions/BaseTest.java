package Testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"url", "browser"})
	@BeforeTest
	public void setUp(String url, String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
			
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("Please pass the correct browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
