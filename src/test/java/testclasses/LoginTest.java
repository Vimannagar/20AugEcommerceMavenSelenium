package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;
import utility.ConfigReader;



public class LoginTest extends TestNGListeners {
	
	
	@Test(priority = 2)
	public void verifyLogin()
	{
		loginpage.enterUsername(ConfigReader.readConfig("username"));
		
		test.info("Entered username as "+ConfigReader.readConfig("username"));
		
		loginpage.enterPassword(ConfigReader.readConfig("password"));
		
		test.info("Entered password as "+ConfigReader.readConfig("password"));
		
		loginpage.clickOnSignIn();
		
		test.info("Logged in to the system");
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String title = loginpage.getTitleOfPage();
		
		boolean ispresent = title.contains("Shopping");
		
		
		Assert.assertEquals(ispresent, true);
		
		test.info("Successfully validated the title");
		
	}

}
