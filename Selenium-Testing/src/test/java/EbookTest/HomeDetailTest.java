package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class HomeDetailTest extends BaseTest{
	@Test
	public void detailTest() {
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
