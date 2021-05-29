package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestFailuar extends BaseSuit {
	
	@Test
	public void doLogin() {
		
		Assert.fail("Execution of login test");
	}
	

}
