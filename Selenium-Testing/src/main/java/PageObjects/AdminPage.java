package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,3000L);
		PageFactory.initElements(driver,this);
	}
	
	public void AddB() {
		this.Add.click();
	}
	public void AllB() {
		this.All.click();
	}
	public void Orders() {
		this.Order.click();
	}
	@FindBy(name = "add")
	private WebElement Add;
	@FindBy(name = "all")
	private WebElement All;
	@FindBy(name = "order")
	private WebElement Order;
	
	public void launchURL() {
		String ip = "103.93.114.195" ;//apache server ip
		if(System.getProperty("IP") !=null) {
			ip = System.getProperty("IP");
		}
		this.driver.get("http://"+ip+":8080/Ebook-project/admin/home.jsp");
//		this.driver.get("https://www.google.com/");
	}
	public boolean isDisplayed() {
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Add));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(All));
		((FluentWait<WebDriver>) this.wait).until(ExpectedConditions.visibilityOf(Order));
		return true;
	}
}
