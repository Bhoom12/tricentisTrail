package testCasesOfTricentisAutomationModule;

import excelReader.ExcelDataReader;

public class datareadpractice {
	public static String[] data() {
		String testNo = "TC9";
		String[][] h = ExcelDataReader.ToReadMultipleDataFromExcel2D("Sheet2");
		String d[] = new String[h.length];
		// System.out.println(h[8][0]);
		// System.out.println((int)Double.parseDouble(h[8][0]));
		int index = 0;
		for (int i = 0; i < h.length; i++) {
			if (h[i][0]== testNo) {
				
				System.out.println(h[i][1]);
				d[index++] = h[i][1];
			}
		}
		return d;
	}
	public static void main(String[] args) {
		data();
		
			
		
	}
}
