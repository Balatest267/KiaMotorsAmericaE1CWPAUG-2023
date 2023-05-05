package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P6_VehicleStatus extends KMABase {
	
	public P6_VehicleStatus(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		waitUntilElementVisisble("//*[@class='icon-info']");
		if(!verifyTitle("Dashboard")){
			reportStep("This is not Dashboard Page", "FAIL");	
		}		
	}
	
	
	public P6_VehicleStatus verifyVehicleName(String nameOfTheVehicle) {		
		verifyTextByXpath("//*[@style='text-align: center;']/strong", nameOfTheVehicle);
		return this;
	}
	
	/*public P6_VehicleMileage verifyVehicleMiles() {
		verifyTextByXpath(xpath, text);
		return this;
		
	}*/
	
}
