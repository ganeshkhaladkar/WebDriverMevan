package regresion;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase3_TestDependance {
	
	@Test(priority=2,dependsOnMethods="doReg")
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority=1)
	public void doReg() {
		
		System.out.println("Executing user  Reg test");
		Assert.fail("User Registeration not Successful");
	}
	@Test(priority=3,dependsOnMethods = "doLogin",alwaysRun = true)
	public void thirdTest() {
		
		System.out.println("Execute 3rd Test");
	}
	@Test(priority=4,dependsOnMethods = "doLogin")
	public void fourthTest() {
		
		System.out.println("Execute 4rd Test");
	}


}
