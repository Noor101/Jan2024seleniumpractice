package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentWorldPopulation {

//		Keep getting the count of: 
//		Current World Population
//		Today:  Births, Deaths and population growth today
//		This Year:  Births, Deaths and population growth today

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		//long startTime = System.currentTimeMillis();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		int count =  1;
		while (count<=20) {
//			if (System.currentTimeMillis() - startTime >= 20000) {
//				break;
//			}
			if(count==21) {
				break;
			}
			String popCount = driver.findElement(By.className("maincounter-number")).getText();
			System.out.println("Current World Population Count" + " " + popCount);
			String birthCount = driver.findElement(By.xpath("//span[@rel='births_today']")).getText();
			System.out.println("Birth Count" + " " + birthCount);
			String deathCount = driver.findElement(By.xpath("//span[@rel='dth1s_today']")).getText();
			System.out.println("death Count" + " " + deathCount);
			String PopGrowth = driver.findElement(By.xpath("//span[@rel='absolute_growth']")).getText();
			System.out.println("growth Count" + " " + PopGrowth);
			count++;
		}
	}

}
