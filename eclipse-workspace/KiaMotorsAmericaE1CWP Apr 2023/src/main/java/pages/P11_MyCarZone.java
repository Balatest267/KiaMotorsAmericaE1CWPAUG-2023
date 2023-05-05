package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.KMABase;

public class P11_MyCarZone extends KMABase {
	
	public P11_MyCarZone(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test= test; 
		
		if(!verifyTitle("My Car Zone"))
			reportStep("This is not MyCarZone Page", "FAIL");
	}
		
	public P11_MyCarZone geoFenceAlert(String alertName, String locationName) {
		clickByXpathJavascriptExecutor("//*[@title='CREATE ALERT']");
		clickByXpathJavascriptExecutor("//*[@title='Geo Fence Alert ']");
		enterByName("geofenceName", alertName);
		clickByXpathJavascriptExecutor("//*[text()=' Next: Set Boundaries ']");
		enterByName("searchLocation", locationName);
		clickByXpathJavascriptExecutor("//*[@class='button full has-spinner dtmSaveGeofenceAlert']");
		return this;	
	}
	
	
	
	public P11_MyCarZone curfewAlerts(String alertName) {
		clickByXpathJavascriptExecutor("//*[@title='CREATE ALERT']");
		clickByXpathJavascriptExecutor("//*[@title='Curfew Alert']");
		enterByName("curfewName", alertName);
		clickByXpathJavascriptExecutor("//*[@class='checkbox-group']");
		clickByXpathJavascriptExecutor("//*[@title='Save Curfew Alert']");
		return this;	
	}
	

}
