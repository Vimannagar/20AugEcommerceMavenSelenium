package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class HomeTest extends  TestNGListeners
{
	
	@Test(priority = 3)
	public void verifySearch()
	{
		homepage.searchProduct();
		
		test.info("Product search done successfully");
	}

}
