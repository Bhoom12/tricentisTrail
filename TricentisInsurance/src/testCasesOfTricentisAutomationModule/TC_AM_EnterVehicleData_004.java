package testCasesOfTricentisAutomationModule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_004 extends BaseClass{
	@Test
	public void make() {
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		Select select = new Select(enterVehicleData.getMakeDropdown());
		Boolean typeOfDropdown=select.isMultiple();
		Reporter.log("Make dropdown is Multiple: "+typeOfDropdown.toString(),true);
		Reporter.log("Make dropdown is Multiple: "+typeOfDropdown.toString(),true);
		Reporter.log("Make dropdown is Multiple: "+typeOfDropdown.toString(),true);
	}
}
