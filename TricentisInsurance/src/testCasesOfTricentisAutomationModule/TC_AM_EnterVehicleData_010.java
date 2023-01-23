package testCasesOfTricentisAutomationModule;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_010 extends BaseClass {
	@DataProvider
	public static String[]data() {
		return ExcelDataReader.getTestDataForDataProvider("TC14to20", "Sheet2");
	}

	@Test(dataProvider = "data")
	public void enginePerformance(String n) {
		//String d[]=n.split(",");
		//String passData=n[1];
		//System.out.println(n);
		//String expectedErrorMsg=d[1];
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		//int data=(int) Double.parseDouble(n);
		//String passingData=Integer.toString(data);
		enterVehicleData.getEnginePerformanceTextField().clear();
		enterVehicleData.getEnginePerformanceTextField().sendKeys(n);
	//	WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getIconEnginePerformanceLabel()));
		
		Assert.assertEquals(enterVehicleData.getIconEnginePerformanceLabel().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("asteriskPosition"),"Negative data"+n +"is not acepted");
	
		//System.out.println(enterVehicleData.getIconEnginePerformanceLabel().getCssValue("background-position"));
		

	}
}
