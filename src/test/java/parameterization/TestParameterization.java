package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	
	@Test(dataProvider = "getData")
	public void doLogin(String username,String password) {
		
		System.out.println(username+"------"+password);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="ganesh@gmail.com";
		data[0][1]="123456";
		
		data[1][0]="sonali@gmail.com";
		data[1][1]="45678";
		
		data[2][0]="Babu@gmail.com";
		data[2][1]="abcdef";
		
		return data;
		
		
	}

}
