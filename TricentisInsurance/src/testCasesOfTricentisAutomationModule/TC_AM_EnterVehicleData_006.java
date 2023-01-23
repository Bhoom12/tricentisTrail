package testCasesOfTricentisAutomationModule;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import excelReader.ExcelDataReader;
import pOM.AMVehicleData;
import pOM.TricentisHomePage;

public class TC_AM_EnterVehicleData_006 extends BaseClass  {
	
	@Test
	public void make() {
		TricentisHomePage tricentisHomePage = new TricentisHomePage(driver);
		tricentisHomePage.navigateToAutomobile();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		//String h[][]= ExcelDataReader.ToReadMultipleDataFromExcel2D("Sheet2");
		String expectedData=ExcelDataReader.getTestData("TC6","Sheet3");
		System.out.println(expectedData);
	//	Select select = new Select(enterVehicleData.getMakeDropdown());
		//select.selectByValue("default");
		
		Select select = new Select(enterVehicleData.getMakeDropdown());
		List<WebElement> makeOptions = select.getOptions();
		select.selectByValue("default");
		Assert.assertEquals(select.getFirstSelectedOption().getText().toString(), makeOptions.get(0).getText(), "Dropdown selected default option is mismatched");
		Reporter.log(select.getFirstSelectedOption().getText().toString(),true);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getIconmMakeDropdown()));
		Assert.assertEquals(enterVehicleData.getIconmMakeDropdown().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("asteriskPosition"),"Negative data"+makeOptions.get(1).getText() +"is not acepted");
	
		enterVehicleData.getMakeDropdown().click();
		//WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getMsgOfMakeDropdown()));
		Assert.assertEquals(enterVehicleData.getMsgOfMakeDropdown().getText(), expectedData,"Make dropdown message is mismatched");
		Reporter.log(enterVehicleData.getMsgOfMakeDropdown().getText()+" message displayed properly",true);
		Assert.assertEquals(enterVehicleData.getIconmMakeDropdown().getCssValue("background-position"),ExcelDataReader.fromPropertyFile("asteriskPosition"),"Negative data"+makeOptions.get(1).getText() +"is not acepted");
		
}
}
