package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC011_MyCarZone extends KMABase {
	
	@Test(priority=1, dataProvider="fetchData")
	public void geoFenceAlert(String emailId, String pwdLogin, String vehicleModel, String alertName, String locationName) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMyCarZone()
		.geoFenceAlert(alertName, locationName);
		
	}
	
	
	@Test(priority=2, dataProvider="fetchData")
	public void curfewAlert(String emailId, String pwdLogin, String vehicleModel, String alertName) throws InterruptedException {
		
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickMyCarZone()
		.curfewAlerts(alertName);
	}
}
