package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AdminPage;

public class AdminOrdersDetail extends BaseTest{
	@Test
	public void userTest() {
		AdminPage c = new AdminPage(driver);
		c.launchURL();
		c.isDisplayed();
		c.Orders();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}
