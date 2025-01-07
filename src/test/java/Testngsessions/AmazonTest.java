package Testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	

	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void searchBtnExist() {
		boolean searchBtn  = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(searchBtn);
		
	}
	
	@Test
	public void helpTestExist() {
		boolean helpText = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(helpText);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void expectedTestFailure() {
		int i =9/0;
		System.out.println(i);
		
	}
	
	



}
