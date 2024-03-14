package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutility {
	
		public String readdatafromexcel(String sheetName,int rownum,int cellnum) throws Throwable, Throwable {
	FileInputStream fis = new FileInputStream(iconstant.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("sheet1").getRow(2).getCell(6).getStringCellValue();
	  String data1 =wb.getSheet("sheet1").getRow(7).getCell(6).getStringCellValue();
	return data;
	 
			
		}
	 
	}


