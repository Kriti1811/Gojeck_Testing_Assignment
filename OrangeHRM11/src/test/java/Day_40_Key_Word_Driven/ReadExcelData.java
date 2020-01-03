package Day_40_Key_Word_Driven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ExcelUtil.ExcelApiTest4;

public class ReadExcelData {
	
	static String Keyword;
	
	
	 public static String getCellData(int RowNum, int ColNum) throws Exception
	 {
		ExcelApiTest4 eat = new ExcelApiTest4();
		Keyword=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality10.xlsx","Sheet1",RowNum,ColNum);
		return Keyword;
	 }

}
