package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLang {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("naveenautomation labs");
		Thread.sleep(3000);
		List<WebElement> suggList  = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
		System.out.println(suggList.size());
		
		for(WebElement e : suggList) {
			String text  = e.getText();
			if(text.equals("naveen automationlabs github")) {
				e.click();
				break;
			}
		}
		
		
		

	}

}
