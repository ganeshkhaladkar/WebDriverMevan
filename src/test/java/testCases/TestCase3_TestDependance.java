package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase3_TestDependance extends BaseSuit {
	
	@Test(priority=2,dependsOnMethods="doReg",groups = {"Functional","Smoke"})
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	
	
	@Test(priority=1,groups = {"Functional","Smoke"})
	public void doReg() {
		
		System.out.println("Executing user  Reg test");
		Assert.fail("User Registeration not Successful");
	}
	
	
	@Test(priority=3,dependsOnMethods = "doLogin",alwaysRun = true,groups = {"Functional","Smoke"})
	public void thirdTest() {
		
		System.out.println("Execute 3rd Test");
	}
	
	
	@Test(priority=4,groups = "bvt")
	public void fourthTest() {
		
		System.out.println("Execute 4rd Test");
	}


}
