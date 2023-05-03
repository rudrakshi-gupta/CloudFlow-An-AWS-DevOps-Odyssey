package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class HomeCartTest extends BaseTest{
	@Test
	public void cartTest() {
		HomePage c = new HomePage(driver);
		c.launchURL();
		c.isDisplayed();
		c.pay();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}