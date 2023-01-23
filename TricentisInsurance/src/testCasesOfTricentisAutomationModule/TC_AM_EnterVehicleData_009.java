package testCasesOfTricentisAutomationModule;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_009 extends BaseClass {

	// @DataProvider(name="reg",parallel=true)
	// public void registerdata() throws Exception, IOException {
	// public static void main(String[] args) {
	@DataProvider
	public static String[]data() {
		return ExcelDataReader.getTestDataForDataProvider("TC9to13", "Sheet2");
	}
	@Test(dataProvider = "data")
	public void enginePerformance(String n) {
		
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		int data=(int) Double.parseDouble(n);
		String passingData=Integer.toString(data);
		enterVehicleData.getEnginePerformanceTextField().clear();
		enterVehicleData.getEnginePerformanceTextField().sendKeys(passingData);
explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getIconEnginePerformanceLabel()));
		
		Assert.assertEquals(enterVehicleData.getIconEnginePerformanceLabel().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("tickBackPosition"),"Positive data"+passingData +"is not acepted");
	
	}
}