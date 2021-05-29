package testInvocation;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	
	@Test(invocationCount =5 )
	public void lounchBrowser() {
		
		driver=getBrowser("Chrome");
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
