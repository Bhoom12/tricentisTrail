package testCasesOfTricentisAutomationModule;

import excelReader.ExcelDataReader;

public class readDataPractice {
	public static void main(String[] args) {
		String testNo = "TC3";
		String[][] h = ExcelDataReader.ToReadMultipleDataFromExcel2D("Sheet2");
		for (int i = 0; i < h.length; i++) {
			if (h[i][0].equals(testNo)) {
				System.out.println(h[i][1]);
			}
		}
	}
}
