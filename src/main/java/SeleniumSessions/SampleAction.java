package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		WebElement statr = driver.findElement(By.id("test"));
		act.sendKeys(statr, "Thisis carrer");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

}
