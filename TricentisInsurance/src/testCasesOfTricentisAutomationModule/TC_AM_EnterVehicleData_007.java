package testCasesOfTricentisAutomationModule;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_007 extends BaseClass {
	@Test
	public void make() {
		String expectedData=ExcelDataReader.getTestData("TC7","Sheet3");
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		Assert.assertEquals(enterVehicleData.getEnginePerformanceLabel().getText(), expectedData,"Engine Performance textbox Label is mismatched");
		Reporter.log("Engine Performance textbox Label is matched",true);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getIconEnginePerformanceLabel()));
		Assert.assertEquals(enterVehicleData.getIconEnginePerformanceLabel().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("asteriskPosition"),"Engine Performance asterisk icon is not displayed");
	
	}
}
