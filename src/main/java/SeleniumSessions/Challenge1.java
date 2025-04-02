package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge1 {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> priceList = driver.findElements(By.cssSelector(".inventory_item_price"));

		double maxPrice = 0.0;
		for (WebElement e : priceList) {
			String priceText = e.getText().trim().replace("$", "");
			double price = Double.parseDouble(priceText);
			if (price > maxPrice) {
				maxPrice = price;
			}
		}
		System.out.println(maxPrice);

		String xPath = "//div[normalize-space()='$" + maxPrice + "']/following-sibling::button[text()='Add to cart']";
		driver.findElement(By.xpath(xPath)).click();

	}

}
