/**
 * 
 */
package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author neeti.goyal
 *
 */
public class ExcelDataProvider {

	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelDataProvider() {

		try {

			File src = new File("./TestData/Testdata.xlsx");
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {

			System.out.println("Some issue happened while reading data from excel" + e.getMessage());
		}
	}

	public String ReadStringDataUsingSheetName(String sheetname, int rowNum, int colNum) {

		sheet = wb.getSheet(sheetname);
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("Fetched data is :" + data);
		return data;
	}

	public String ReadStringDataUsingSheetIndex(int sheetIndex, int rowNum, int colNum) {

		sheet = wb.getSheetAt(sheetIndex);
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("Fetched data is :" + data);
		return data;
	}

	public double ReadNumericDataUsingSheetName(String sheetname, int rowNum, int colNum) {

		sheet = wb.getSheet(sheetname);
		double data = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("Fetched data is :" + data);
		return data;
	}

	public String ReadNumericDataUsingSheetIndex(int sheetIndex, int rowNum, int colNum) {

		sheet = wb.getSheetAt(sheetIndex);
		String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("Fetched data is :" + data);
		return data;
	}
}
