package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataUsingHashTable {

public static ExcelReader excel=null;
	
	@Test(dataProvider = "getData")
	public void doLogin(Hashtable<String,String> data) {
		
		//System.out.println(username+"---"+password);
		System.out.println(data.get("Name")+"---"+data.get("Number")+"---"+data.get("age")+"---"+data.get("DOB"));
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		if(excel==null) {
			excel=new ExcelReader("D:\\testngdata.xlsx");
		}
		String sheetName="loginsheet";
		int row=excel.getRowCount(sheetName);
		
		int cols=excel.getColumnCount(sheetName);
		
		//System.out.println(row+"---"+cols);
		
		Object[][] data =new Object[row-1][1];//it will create every time columns for each data or row
		
		Hashtable<String,String> table=null;
		
		for(int rowNum=2;rowNum<=row;rowNum++) {
			
			table=new Hashtable<String,String>();
			
			for(int colNum=0;colNum<cols;colNum++) {
				
				
				//data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				//col value give 1 because we want read column name 
				data[rowNum-2][0]=table;
				
				//put data into object format 
				
			}
		}
		
		return data;
	}
	

}
