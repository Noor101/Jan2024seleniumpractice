package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		// driver.findElement(By.xpath("//a[text()='29']")).click();
		// selectDateByVisibleText("29");

//		String actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//		System.out.println(actMonth);
//		while(!actMonth.equalsIgnoreCase("June 2025")) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			actMonth  = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//		}
//		selectDateByVisibleText("22");

		selectFutureDate("August 2025", 32);
		//selectPrevDate("June 2024", 21);

	}

	public static void selectDateByVisibleText(int day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();

	}

	public static void selectFutureDate(String expMonthYear, int day) {
		if(day>31) {
			System.out.println("Wrong date please select the right date");
			return;
		}
		if(day<0) {
			System.out.println("Wrong date please select the right date");
			return;
		}
		String actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println(actMonth);
		while (!actMonth.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}
		selectDateByVisibleText(day);

	}

	public static void selectPrevDate(String expMonth, int day) {
		String actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println(actMonth);
		while (!actMonth.equalsIgnoreCase(expMonth)) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}
		selectDateByVisibleText(day);
	}
}
