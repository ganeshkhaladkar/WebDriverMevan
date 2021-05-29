package parameterization;

import org.testng.annotations.Test;

public class MultipalDataProviderMethods {

	@Test(dataProviderClass =MultipalDataProvider.class,dataProvider = "dp1" )
	public void doLogin(String userName,String password) {
		
		System.out.println(userName+"---"+password);
	}
	
	
	@Test(dataProviderClass =MultipalDataProvider.class,dataProvider = "dp1" )
	public void doUserReg(String fName,String lName,String email) {
		
		System.out.println(fName+"---"+lName+"---"+email);
	}
}
