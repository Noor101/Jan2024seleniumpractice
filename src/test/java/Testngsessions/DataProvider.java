package Testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class DataProvider {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
	}
	
	public boolean doLoginNegativeCase(String email, String password) {
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		if(errorMsg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
	}
	
	@org.testng.annotations.DataProvider
    public Object[][] provideData() {
        return new Object[][] {
            {"user1@example.com", "password1"}, // Test Case 1
            {"user2@example.com", "password2"}, // Test Case 2
            {"user3@example.com", "password3"}  // Test Case 3
        };
    }
	
	@Test
	public void doLoginNegTest() {
	Assert.assertTrue(doLoginNegativeCase("test123@gmail.com", "iwwee"));
	}
	

	
	
}
