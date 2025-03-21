package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewFlipkart {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("vivo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector(".yKfJKb.row")).click();
		
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[class='QqFHMw vslbG+ In9uk2']")).click();

		}

	}

}
