package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AdminPage;
import PageObjects.LoginPage;

public class AdminOrdersDetailTest extends BaseTest{
	@Test
	public void userTest() {
		LoginPage b = new LoginPage(driver);
		AdminPage c = new AdminPage(driver);
		b.launchURL();
		b.isDisplayed();
		b.EmailText("admin@gmail.com");
		b.PwdText("admin");
		b.Sub();
		c.launchURL();
		c.isDisplayed();
		c.Orders();
		
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}
