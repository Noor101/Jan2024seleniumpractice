package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRM {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(args);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(args);

	}

}
