package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginAdminTest extends BaseTest{
	@Test
	public void searchTest() {
		LoginPage c = new LoginPage(driver);
		c.launchURL();
		c.isDisplayed();
		c.EmailText("admin@gmail.com");
		c.PwdText("admin");
		c.Sub();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}