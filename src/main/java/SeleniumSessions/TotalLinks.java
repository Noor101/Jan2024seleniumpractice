package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> totalLinks  = driver.findElements(By.tagName("a"));
		int linksCount  = totalLinks.size();
		System.out.println(linksCount);
		
		for(int i =0; i<linksCount; i++) {
			String linkText  = totalLinks.get(i).getText();
			if(linkText.length()>0) {
				System.out.println(i + ""+ linkText);
			}
		}
		
		int count = 0;
		for(WebElement e : totalLinks) {
			String text  = e.getText();
			System.out.println(count + " " + text);
			count++;
		}
		
	}
	

}
