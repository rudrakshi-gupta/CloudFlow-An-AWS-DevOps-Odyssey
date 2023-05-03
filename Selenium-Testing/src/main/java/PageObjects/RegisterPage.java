package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,3000L);
		PageFactory.initElements(driver,this);
	}
	
	public void NameText(String Namekey) {
		this.Name.sendKeys(Namekey);
	}
	public void EmailText(String Emailkey) {
		this.Email.sendKeys(Emailkey);
	}
	public void PhnoText(String Phnokey) {
		this.Phno.sendKeys(Phnokey);
	}
	public void PwdText(String Pwdkey) {
		this.Pwd.sendKeys(Pwdkey);
	}
	public void Checkbox() {
		if(!this.Check.isSelected()) {
			this.Check.click();
		}
	}
	public void Sub() {
		this.Submit.click();
	}
	
	@FindBy(name = "fname")
	private WebElement Name;
	
	@FindBy(name = "email")
	private WebElement Email;
	
	@FindBy(name = "phno")
	private WebElement Phno;
	
	@FindBy(name = "pwd")
	private WebElement Pwd;
	
	
	@FindBy(name = "check")
	private WebElement Check;
	
	@FindBy(className = "sub")
	private WebElement Submit;
	
	public void launchURL() {
//		String ip = "192.168.16.1" ;
//		if(System.getProperty("IP") !=null) {
//			ip = System.getProperty("IP");
//		}
//		this.driver.get("http://"+ip+":9090/Ebook-project/register.jsp");
		this.driver.get("http://65.1.109.153:9090/Ebook-project/register.jsp");
	}
	public boolean isDisplayed() {
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Name));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Email));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Phno));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Pwd));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Check));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Submit));
		return true;
	}
}
