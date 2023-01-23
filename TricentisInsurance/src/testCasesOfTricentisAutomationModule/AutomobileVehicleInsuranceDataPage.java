package testCasesOfTricentisAutomationModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomobileVehicleInsuranceDataPage {
	public AutomobileVehicleInsuranceDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="entervehicledata")
	private WebElement enterVehicleDataNavBar;
	
	@FindBy(xpath="//a[@id='entervehicledata']//span")
	private WebElement enterVehicleDataNumMandatoryFileds;
	
	
	@FindBy(xpath="//select[@id='make']/..//label")
	private WebElement makeDropdownLabel;
	
	@FindBy(id="make")
	private WebElement makeDropdown;
	
	@FindBy(xpath="//select[@id='make']//option")
	private WebElement makeDropdownOptions;
	
	@FindBy(xpath="//select[@id='make']/..//span")
	private WebElement msgOfMakeDropdown;
	
	////////////
	
	@FindBy(xpath="//input[@id='engineperformance']/..//label")
	private WebElement enginePerformanceLabel;
	
	@FindBy(id="engineperformance")
	private WebElement enginePerformanceTextField;
	
	@FindBy(xpath="//input[@id='engineperformance']/..//span")
	private WebElement msgOfEnginePerformance;
	
	////////////
	
	@FindBy(id="dateofmanufacture")
	private WebElement dateOfManufactureInputField;
	
	/*//dateofmanufacture
	|//span[text()='January']/..//span[text()='2023']/../../..//a[text()='18']*/
	
	////////////
	///////////////
		
	@FindBy(id="enterinsurantdata")
	private WebElement enterInsurantDataNavBar;	
	
	@FindBy(xpath="//a[@id='enterinsurantdata']//span")
	private WebElement enterInsurantDataNumMandatoryFileds;
	
	////////////

	//label[text()='Male']
	
	///////////
	
	//label[text()='Male']//span
		
	//////
	
	@FindBy(xpath="//label[text()='Hobbies']")
	private WebElement hobbiesCheckBox;
}
