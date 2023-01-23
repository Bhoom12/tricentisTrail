package testCasesOfTricentisAutomationModule;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_008 extends BaseClass {
	@Test
	public void make() {
		String expectedData=ExcelDataReader.getTestData("TC8","Sheet3");
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		enterVehicleData.getEnginePerformanceTextField().click();
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getMsgOfEnginePerformance()));
		Assert.assertEquals(enterVehicleData.getMsgOfEnginePerformance().getText(), expectedData,"EnginePerformance message is mismatched");
		Reporter.log(enterVehicleData.getMsgOfEnginePerformance().getText()+" message displayed properly",true);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getIconEnginePerformanceLabel()));
		Assert.assertEquals(enterVehicleData.getIconEnginePerformanceLabel().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("asteriskPosition"),"Engine Performance asterisk icon is not displayed");
	
		
		
	}
}
