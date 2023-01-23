package pOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

import excelReader.ExcelDataReader;
import testCasesOfTricentisAutomationModule.BaseClass;


public class TricentisHomePage extends BaseClass{
	
	public WebElement getAutomobileNavBar() {
		return automobileNavBar;
	}


	public TricentisHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "nav_automobile")
	private WebElement automobileNavBar;


	public static void navigateToAutomobile() {
		driver.findElement(By.id("nav_automobile")).click();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		explicitwait.until(ExpectedConditions.visibilityOf(enterVehicleData.getAutomobileInsurancePageConfirm()));
		Assert.assertEquals(driver.getTitle(), ExcelDataReader.fromPropertyFile("expectedAutomobilePageTitle"), "Automobile page is not displayed successfully");
		Reporter.log("Automobile module page is displayed successfully",true);
	}
	
	
}
