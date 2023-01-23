package testCasesOfTricentisAutomationModule;

import java.util.List;


import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_003 extends BaseClass {
	@Test
	public void make() {//To check Make dropdown options are displayed and spelled properly
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		String expectedMakeDropdownOptions = ExcelDataReader.getTestData("TC3", "Sheet3");
		//String[][] h = ExcelDataReader.ToReadMultipleDataFromExcel2D("Sheet2");
		//String data=h[1][1];
		String d[]=expectedMakeDropdownOptions.split(",");
		Assert.assertEquals(enterVehicleData.getMakeDropdown().isDisplayed(), true, "Make dropdown is not displayed");
		//Reporter.log("Make label is displayed",true);
		Select select = new Select(enterVehicleData.getMakeDropdown());
		List<WebElement> makeOptions = select.getOptions();
		/*Assert.assertEquals(makeOptions.size(), h.length, "Dropdown number of options mismatched");
		for (int i = 0; i < makeOptions.size(); i++) {
			Assert.assertEquals(makeOptions.get(i).getText(), h[i][1],
					"Make dropdown " + h[i][1] + " option mismatched");
		}*///read directly from 2d array
		Assert.assertEquals(makeOptions.size(), d.length, "Dropdown number of options mismatched");
		for (int i = 0; i < makeOptions.size(); i++) {
			Assert.assertEquals(makeOptions.get(i).getText(), d[i],
					"Make dropdown " + d[i] + " option mismatched");
		}
		Reporter.log("Make dropdown options are matched with the requriment",true);
		
	}

}
