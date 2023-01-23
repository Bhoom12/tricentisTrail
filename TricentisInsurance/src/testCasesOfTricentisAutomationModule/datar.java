package testCasesOfTricentisAutomationModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import excelReader.ExcelDataReader;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import excelReader.ExcelDataReader;

public class datar {
	public static void main(String[] args) throws Exception, IOException {
		String testNo = "TC2";
		// public String[][] registerdata() throws Exception, IOException {
		FileInputStream fis = new FileInputStream("./TestDataOfTricentis/TricentisTestCaseData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet3");
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		int colAr = 0;
		int rowAr = 0;
		for (int i = 0; i < row; i++) {
			String cellValue = workbook.getSheet("Sheet3").getRow(i).getCell(0).toString();
			if (cellValue.equals(testNo)) {
				
				rowAr++;
				colAr = sheet.getRow(i).getPhysicalNumberOfCells();

			}
		}
		System.out.println(colAr);
		System.out.println(rowAr);
		String data[][] = new String[rowAr][colAr];
		int h=0;
		for (int i = 0; i < row; i++) {
			String cellValue = workbook.getSheet("Sheet3").getRow(i).getCell(0).toString();
			
			if (cellValue.equals(testNo)) {
				for (int j = 0; j < colAr; j++) {
					data[h][j] = sheet.getRow(i).getCell(j).toString();
				}
				h++;
			}
		}
	//	String data[][]=ExcelDataReader.ToReadDataBasedOnTC("Sheet3", "TC1");
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		System.out.println(data[1][2]);
		System.out.println(data[3][2]);
	}
}
