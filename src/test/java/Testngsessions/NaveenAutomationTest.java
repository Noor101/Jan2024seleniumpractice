package Testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NaveenAutomationTest extends BaseTest {
	


	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");

	}

}
