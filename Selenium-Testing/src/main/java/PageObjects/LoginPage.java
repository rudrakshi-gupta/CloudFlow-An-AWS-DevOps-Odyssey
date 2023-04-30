package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,3000L);
		PageFactory.initElements(driver,this);
	}
	
	
	public void EmailText(String Emailkey) {
		this.Email.sendKeys(Emailkey);
	}
	public void PwdText(String Pwdkey) {
		this.Pwd.sendKeys(Pwdkey);
	}
	public void Sub() {
		this.Submit.click();
	}
	
	
	@FindBy(name = "email")
	private WebElement Email;
	
	@FindBy(name = "pwd")
	private WebElement Pwd;
	
	@FindBy(className = "sub")
	private WebElement Submit;
	
	public void launchURL() {
//		String ip = "172.22.0.2" ;
//		if(System.getProperty("IP") !=null) {
//			ip = System.getProperty("IP");
//		}
//		this.driver.get("http://"+ip+":3000");
		this.driver.get("http://localhost:8080/Ebook-project/login.jsp");
	}
	public boolean isDisplayed() {
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Email));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Pwd));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Submit));
		return true;
	}
}

