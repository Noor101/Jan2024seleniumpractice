package Testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestFlow {
	
	@BeforeSuite
	public void startDB() {
		System.out.println("Db connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("Create user");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("Login to app");
	}
	
	@Test
	public void homepageTitle() {
		System.out.println("HomepageTest");
	}
	
	@Test
	public void homepageURL() {
		System.out.println("homepageURL");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	
	@AfterClass
	public void closeDB() {
		System.out.println("Close DB");
	}
	
	@AfterTest
	public void close() {
		System.out.println("Close browser");
	}
	
	@AfterSuite
	public void deleteUser() {
		System.out.println("Delete user");
	}

}
