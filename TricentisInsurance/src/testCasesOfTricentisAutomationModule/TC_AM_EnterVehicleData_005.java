package testCasesOfTricentisAutomationModule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_005 extends BaseClass {
	@Test
	public void make() {
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		Select select = new Select(enterVehicleData.getMakeDropdown());
		//Boolean typeOfDropdown=select.isMultiple();
		//Reporter.log(typeOfDropdown.toString(),true);
		List<WebElement> makeOptions = select.getOptions();
		makeOptions.remove(0);
		for(WebElement e:makeOptions) { 
			select.selectByVisibleText(e.getText());
			Assert.assertEquals(select.getFirstSelectedOption().getText().toString(), e.getText(), "Dropdown selected options mismatched");
			Reporter.log(select.getFirstSelectedOption().getText().toString(),true);
			explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getIconmMakeDropdown()));
			Assert.assertEquals(enterVehicleData.getIconmMakeDropdown().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("tickBackPosition"),"Positive data"+e.getText() +"is not acepted");
		}
		Reporter.log("Selected options are displayed properly ");
		Reporter.log("Selected options are displayed properly ");
		Reporter.log("Selected options are displayed properly ");
	}
}
