package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/india/karnataka/bangalore");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.linkText("Ghaziabad, India"));
		
		String text  = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(text);
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

	}

}
