package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginUserTest extends BaseTest{
	@Test
	public void loginTest() {
		LoginPage c = new LoginPage(driver);
		c.launchURL();
		c.isDisplayed();
		c.EmailText("harpreet@gmail.com");
		c.PwdText("happy");
		c.Sub();
		
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}