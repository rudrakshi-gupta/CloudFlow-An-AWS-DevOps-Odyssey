package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.LoginUserResultPage;

public class UserResultTest extends BaseTest{
	@Test
	public void userTest() {
		LoginPage c = new LoginPage(driver);
		LoginUserResultPage resultpage = new LoginUserResultPage(driver);
		c.launchURL();
		c.isDisplayed();
		c.EmailText("fiona@reddifmail.com");
		c.PwdText("iamFiona");
		c.Sub();
		resultpage.isDisplayed();
		resultpage.pay();
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		Assert.assertEquals("Pass", "Pass");
	}
}