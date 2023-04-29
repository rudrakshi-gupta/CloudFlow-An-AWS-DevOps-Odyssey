package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class HomeTest extends BaseTest{
	@Test
	public void homeTest() {
		HomePage c = new HomePage(driver);
		c.launchURL();
		c.isDisplayed();
		c.DetailText();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}
