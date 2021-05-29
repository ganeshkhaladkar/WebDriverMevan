package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;



public class MultipalDataProvider {
	
	@DataProvider(name="dp1")
	public Object[][] getData(Method m){//one data provider for multiple method that's why we use the Method m
		Object [][] data=null;
		
		if(m.getName().equals("doLogin")) {
		data =new Object[2][2];
		
		data[0][0]="Ganesh";
		data[0][1]="abcdef";
		
		data[1][0]="sonali";
		data[1][1]="zxcvbnm";
		
		}
		else if(m.getName().equals("doUserReg")) {
			
			data =new Object[2][3];
			
			data[0][0]="Ganesh";
			data[0][1]="Khaladkar";
			data[0][2]="Ganesh@gmail.com";
			
			data[1][0]="sonali";
			data[1][1]="Khaladkar";
			data[1][2]="Sonali@gmail.com";
		}
		return data;
		
	}
	/*@DataProvider(name="dp2")
	public Object[][] getData1(){
		
		Object [][] data =new Object[2][3];
		
		data[0][0]="Ganesh";
		data[0][1]="Khaladkar";
		data[0][2]="Ganesh@gmail.com";
		
		data[1][0]="sonali";
		data[1][1]="Khaladkar";
		data[1][2]="Sonali@gmail.com";
		
		
		
		
		return data;
		}*/
	

}
