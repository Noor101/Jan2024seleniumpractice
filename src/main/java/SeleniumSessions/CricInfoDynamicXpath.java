package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoDynamicXpath {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/england-in-india-2024-25-1439850/india-vs-england-5th-t20i-1439903/full-scorecard");
		String bowler = getBowlerName("Hardik Pandya");
		System.out.println(bowler);
		List<String> test = getScoreCardlist("Hardik Pandya");
		System.out.println(test);
	}
	
////span[text()='Hardik Pandya']/ancestor::td/following-sibling::td/span/span
	
	public static String getBowlerName(String batsmanName) {
		return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td/span/span")).getText();
	}
	
	public static List<String> getScoreCardlist(String batsmanName) {
		List<WebElement> scoreCardList = driver.findElements(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
		List<String> score = new ArrayList<String>();
		 for(WebElement e : scoreCardList) {
			 String text = e.getText();
			 score.add(text);
		 }
		 return score;
	}

}
