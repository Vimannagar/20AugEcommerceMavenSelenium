package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.ConfigReader;



public class LoginTest extends BaseTest {
	
	
	@Test(priority = 2)
	public void verifyLogin()
	{
		loginpage.enterUsername(ConfigReader.readConfig("username"));
		
		loginpage.enterPassword(ConfigReader.readConfig("password"));
		
		loginpage.clickOnSignIn();
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String title = loginpage.getTitleOfPage();
		
		boolean ispresent = title.contains("Shopping");
		
		Assert.assertEquals(ispresent, true);
	}

}
