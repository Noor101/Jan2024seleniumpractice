package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		String title  = driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail");
		}
		
		driver.quit();
		System.out.println(driver.getTitle());
	}

}
