package testCasesOfTricentisAutomationModule;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import excelReader.ExcelDataReader;
import pOM.*;

public class TC_AM_EnterVehicleData_002_ztest extends BaseClass {
	
	@Test(groups="functionality")
	public void make() {//To check Make(dropdown) label is displayed and spelled properly
		String expectedLabel = ExcelDataReader.getTestData("TC2", "Sheet3");
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		Assert.assertEquals(enterVehicleData.getMakeDropdownLabel().isDisplayed(), true, "Make label is not displayed");
		Reporter.log("Make label is displayed",true);
		String makeLabel = enterVehicleData.getMakeDropdownLabel().getText();
		Assert.assertEquals(makeLabel, expectedLabel, "Make Label is mismatched");
		Reporter.log("Make Label is matched", true);
	}
}
