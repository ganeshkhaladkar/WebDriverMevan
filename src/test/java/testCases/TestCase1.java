package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseSuit {

	@Test(priority=2,groups = "smoke")
	public void doLogin() {
		
		System.out.println("Executing login test");
	}
	
	@Test(priority=1,groups = "Functional")
	public void doReg() {
		
		System.out.println("Executing user  Reg test");
	}
	@BeforeMethod /* Execute Before every method */
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	@AfterMethod/* Execute After every method */
	public void closeBrowser() {           
		System.out.println("Closeeing Browser");
	}
	
	/* Execute Before all methods  */
	
	@BeforeTest /* Execute Before All method for 1 time */
	public void createDBConn() {
		System.out.println("Creating DB Connection");
	}
	
	@AfterTest /* Execute After All method  for 1 time */
	public void closeDBConn() {
		System.out.println("Closeing DB Connection");
	}

}
