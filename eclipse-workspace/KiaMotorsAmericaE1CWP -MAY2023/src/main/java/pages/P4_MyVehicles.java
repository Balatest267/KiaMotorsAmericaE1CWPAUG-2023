package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P4_MyVehicles extends KMABase{

	
	public P4_MyVehicles(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver;
		this.test =test;
		waitUntilElementVisisble("//*[@class='vehicle-tab active']");
		if(!verifyTitle("Welcome")){
			reportStep("This is not Welcome Page", "FAIL");	
		}		
	}
		

	public P5_Dashboard pickTheCar(String vehicleModel) throws InterruptedException {
		waitUntilElementVisisble("//*[@title='TELLURIDE']");
		pickTheCar("//div[@class='my-vehicles-grid-item-header']/strong", vehicleModel, "//*[@title='TELLURIDE']");   
		waitUntilElementVisisble("//*[@class='dropdown-toggle']");
		return new P5_Dashboard(driver, test);
	}
		
		
		public P4_MyVehicles clickSettings() throws InterruptedException {
			waitUntilElementVisisble("//*[@class='dropdown-toggle']");
			clickByXpathJavascriptExecutor("//*[@class='dropdown-toggle']");
			return new P4_MyVehicles(driver, test);
		}
		
		
		
		public P2_Login clickLogout() throws InterruptedException {
			waitUntilElementVisisble("(//*[text()='Log Out'])[2]");
			clickByXpath("(//*[text()='Log Out'])[2]");
			return new P2_Login(driver, test);
		}
		
		
		
		public P4_MyVehicles clickAddVehicle() {
			waitUntilElementVisisble("//*[@class='button dark-icon less-padding desktop dtmAddVehicle']");
			clickByXpath("//*[@class='button dark-icon less-padding desktop dtmAddVehicle']");
			return this;
		}
}
		
	


