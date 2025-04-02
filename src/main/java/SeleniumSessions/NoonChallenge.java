package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoonChallenge {

	static WebDriver driver;
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications ");
		driver = new ChromeDriver(options);
		driver.get("https://www.noon.com/uae-en/");
		List<WebElement> carouselList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//h2[contains(@class, 'ModuleHeaderTitle_heading__4t4tv')]"))));
		System.out.println(carouselList);
		for (WebElement e : carouselList) {
			String text = e.getText();
			System.out.println(text);

		}

	}

}
