package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		
		WebElement dropID  = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		
		Select select = new Select(dropID);
		//select.selectByIndex(2);
		//select.selectByValue("Canada");
		List<WebElement> optionsList  = select.getOptions();
		for(WebElement e : optionsList) {
			String text = e.getText();
			if(text.equals("Heard and Mc Donald Islands")) {
				e.click();
				break;
			}
		}
		
	
		
				

	}

}
