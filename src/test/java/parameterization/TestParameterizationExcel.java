package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationExcel {
	public static ExcelReader excel=null;
	
	@Test(dataProvider = "getData")
	public void doLogin(String username,String password) {
		
		System.out.println(username+"---"+password);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		if(excel==null) {
			excel=new ExcelReader("D:\\testngdata.xlsx");
		}
		String sheetName="loginsheet";
		int row=excel.getRowCount(sheetName);
		
		int cols=excel.getColumnCount(sheetName);
		
		System.out.println(row+"---"+cols);
		
		Object[][] data =new Object[row-1][cols];
		
		for(int rowNum=2;rowNum<=row;rowNum++) {
			
			for(int colNum=0;colNum<cols;colNum++) {
				
				
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				
				
			}
		}
		
		return data;
	}
	

}
