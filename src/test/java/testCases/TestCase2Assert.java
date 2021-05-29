package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestCase2Assert extends BaseSuit {
	
	@Test
	public void validateTitle() {
		
		
		String actualTitle="Yahoo.com";
		String expectedTitle="Google.com";
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Beginning");
		
		System.out.println("Validate Title");
		softAssert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Validate text Box");
		
		softAssert.assertEquals(false, true,"TextBOx Not present");
		
		System.out.println("Validate Image");
		
		softAssert.assertEquals(true, false,"Image Not present");
		
		
		System.out.println("Ending");
		
		softAssert.assertAll();
		
	}

}
