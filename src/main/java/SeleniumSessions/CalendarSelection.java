package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarSelection {

	private static WebDriver driver;

	public static void main(String args[]) throws InterruptedException  {
				
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".logSprite.icClose")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
//		String actMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
//		String nextMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[2]")).getText();
//		while(!actMonth.equalsIgnoreCase("May 2025")||nextMonth.equalsIgnoreCase("May 2025")) {
//			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
//			actMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
//			nextMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[2]")).getText();
//		}
//		selectDateByText("Tue May 20 2025");
		
		selectFutureDate("May 2025", "May 2025", "Tue May 20 2025");

	}
	
	public static void selectDateByText(String futureDate) {
		
		String dateXpath = "//div[@aria-label='"+futureDate+"']";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));
		dateElement.click();
	}
	
	public static void selectFutureDate(String expCurrMonth, String expNextMonth, String day) {
		String currentMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		String nextMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[2]")).getText();
		while(!currentMonth.equalsIgnoreCase(expCurrMonth)||nextMonth.equalsIgnoreCase(expNextMonth)) {
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
			currentMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
			nextMonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[2]")).getText();
		}
		selectDateByText(day);
	}

}
