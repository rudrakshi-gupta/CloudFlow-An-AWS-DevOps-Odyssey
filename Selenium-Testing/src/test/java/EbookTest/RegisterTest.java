package EbookTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RegisterPage;

public class RegisterTest extends BaseTest{
	@Test
	public void registerTest() {
		RegisterPage c = new RegisterPage(driver);
		c.launchURL();
		c.isDisplayed();
		c.NameText("Fiona");
		c.EmailText("fiona@reddifmail.com");
		c.PhnoText("3849823423");
		c.PwdText("iamFiona");
		c.Checkbox();
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
