package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("noormohammed1050@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Noor@100");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		

	}

}
