package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,3000L);
		PageFactory.initElements(driver,this);
	}
	public void DetailText() {
		this.DetailBox.click();
	}
	@FindBy(className = "dtl")
	private WebElement DetailBox;
	
	public void pay() {
		this.Cart.click();
	}
	@FindBy(name = "cart")
	private WebElement Cart;
	
	public void launchURL() {
		String ip = "192.168.16.1" ;
		if(System.getProperty("IP") !=null) {
			ip = System.getProperty("IP");
		}
		this.driver.get("http://"+ip+":9090/Ebook-project/");
		
//		this.driver.get("http://65.1.109.153:9090/Ebook-project/");
	}
	public boolean isDisplayed() {
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(DetailBox));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Cart));
		return true;
	}
}