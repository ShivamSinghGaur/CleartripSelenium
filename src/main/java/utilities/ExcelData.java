package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String getdata(int rownum,int colnum) throws IOException {
		
		FileInputStream f= new FileInputStream("./TestData.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(f);
		XSSFSheet sheet= book.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(rownum);
		String city=row.getCell(colnum).getStringCellValue();
		return city;
	}
}
