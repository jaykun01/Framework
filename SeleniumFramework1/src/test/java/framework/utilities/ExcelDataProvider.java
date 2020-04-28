package framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src = new File("./TestData/Data.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read excel file - " + e.getMessage());
		}
	}
	
	public String getStringData(String SheetName, int row, int col)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(String SheetName, int row, int col)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(col).getNumericCellValue();
	}
	
}
