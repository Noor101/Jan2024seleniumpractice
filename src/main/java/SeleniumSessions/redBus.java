package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class redBus {

	static WebDriver driver;

//Fetch only weekend [Sat/Sun] dates from the current month and future months (date calendar)
//
//Don't include past weekend date
//
//Finally get all weekend dates of a month and validate it
//
//Fetch the count of holidays of the given month and validate it
//
//If today's date is also a weekend date, include that as well.
//
//Use only CSS selector [No XPATH]

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onwardCal")).click();
		//getHolidayCount("Apr 2025");
		System.out.println(getWeekendDates("Apr 2025"));
	}

	public static void getHolidayCount(String expMonth) {
		String actMonth = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"))
				.getText();
		if (!actMonth.contains(expMonth)) {
			driver.findElement(By.id("Layer_1")).click();
			actMonth = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"))
					.getText();
		}
		String text = driver.findElement(By.cssSelector(".holiday_count")).getText();
		System.out.println(text);
	}

	public static List<String> getWeekendDates(String expMonth) {
		List<String> weekendDatesList =  new ArrayList<String>();
		String actMonth = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"))
				.getText();
		if (!actMonth.contains(expMonth)) {
			driver.findElement(By.id("Layer_1")).click();
			actMonth = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"))
					.getText();
		}
		List<WebElement> weekList = driver.findElements(By.xpath("//span[contains(@class, 'bwoYtA')]"));
		for(WebElement e : weekList) {
			String text = e.getText();
			weekendDatesList.add(text);
		}
		return weekendDatesList;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
