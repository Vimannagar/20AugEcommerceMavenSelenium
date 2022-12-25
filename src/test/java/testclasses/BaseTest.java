package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.HomePage;
import pages.LoginPage;
import utility.ConfigReader;

public class BaseTest {
	
	static WebDriver driver;
	
	public LoginPage loginpage;
	public HomePage homepage;
	
	@BeforeSuite
	public void initBrowser()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
//		 String value = ConfigReader.readConfig("testsiteurl");
		 driver.get(ConfigReader.readConfig("testsiteurl"));
		 	
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		 
		  homepage = new HomePage(driver);
	}
	
	

}
