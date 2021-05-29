package testCases;

import org.testng.SkipException;

public class SkipTestCase extends BaseSuit {
	
	public void isSkip() {
		
		throw new SkipException("Sikppin because element not present");
	}

}
