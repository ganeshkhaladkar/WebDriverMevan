package testInvocation;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver getBrowser(String browser) {
		
		if(browser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			
		}
		else if(browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver= new FirefoxDriver();
			
		}
		return driver;
		
	}

}
