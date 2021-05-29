package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	  public void onTestSuccess(ITestResult result) {
	   
		  System.out.println("Pass test---"+result.getName());
		  
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public void onTestFailure(ITestResult result) {
		  
		  System.setProperty("org.uncommons.reportng.escape-output", "false");
	   
		  Reporter.log("<a href=\"D:\\Download\\AADHAR.jpg\"target=\"_blank\">Screenshot Link</a>");
		  Reporter.log("<Br>");
		  Reporter.log("<a href=\"D:\\Download\\AADHAR.jpg\"target=\"_blank\"><img height=100 width=100 src=\"D:\\Download\\AADHAR.jpg\"</a>");
		  System.out.println("Capturing Screenshot for the Faild test---"+result.getName());
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
	   * and calling all their Configuration methods.
	   *
	   * @param context The test context
	   */
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
	   * and all their Configuration methods have been called.
	   *
	   * @param context The test context
	   */
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
	

}
