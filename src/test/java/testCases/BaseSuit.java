package testCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseSuit  {
	
	@BeforeSuite
	public void setUp() {
		
		
		System.out.println("Initializing Everything!!!!!!!");
		
	}
	@AfterSuite
	public void tearDown() {
		
		
		System.out.println("Quittin Everything!!!!!!!");
		
	}

}
