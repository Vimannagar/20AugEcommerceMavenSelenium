package testclasses;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;

public class BuyProductTest extends TestNGListeners{
	
	@Test
	public void verifyAddToCart()
	{
		buyproduct.addToCart();
		
		test.info("Product added into the cart successfully");
	}

}
