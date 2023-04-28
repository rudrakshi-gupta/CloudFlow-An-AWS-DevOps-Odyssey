package EbookTest;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseTest{
	protected WebDriver driver;
	@BeforeTest
	public void setUpDriver() throws MalformedURLException {
//		String host = "localhost";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamb\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
//		DesiredCapabilities dc = null;
//		dc = DesiredCapabilities.chrome();
//		if(System.getProperty("BROWSER") !=null && System.getProperty("BROWSER").equalsIgnoreCase("firefox") ) {
//			dc = DesiredCapabilities.firefox();
//		}
//		
//		if(System.getProperty("HUB_HOST") !=null) {
//			host = System.getProperty("HUB_HOST");
//		}
//		String completeURL = "http://" + host +":4444/wd/hub";
//		this.driver = new RemoteWebDriver(new URL(completeURL),dc);
	}
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
}