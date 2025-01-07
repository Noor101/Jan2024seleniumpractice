package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		if(title.contains("Online Shopping")) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}
		
		WebElement searchField  = driver.findElement(By.id("twotabsearchtextbox"));
		
		if(searchField.isDisplayed()) {
			searchField.sendKeys("Apple Iphone");
		}
			
		
		
		

	}

}