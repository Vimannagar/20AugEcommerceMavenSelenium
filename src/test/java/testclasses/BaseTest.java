package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.BuyProduct;
import pages.HomePage;
import pages.LoginPage;
import utility.ConfigReader;

public class BaseTest {
	
public	static WebDriver driver;
	
	public LoginPage loginpage;
	public HomePage homepage;
	
	 public BuyProduct buyproduct;
	@BeforeSuite
	public void initBrowser() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		
//		options.addArguments("--incognito");
		
		options.addArguments("--disable-notifications");
		
//		options.addArguments("--headless");
		
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
//		 String value = ConfigReader.readConfig("testsiteurl");
		 driver.get(ConfigReader.readConfig("testsiteurl"));
		 	Thread.sleep(5000);
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
		  
		  buyproduct = new BuyProduct(driver);
	}
	
	

}
