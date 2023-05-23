package testcases;

import org.testng.annotations.Test;

import pages.P2_Login;
import wrappers.KMABase;

public class TC009_Locations extends KMABase{
	
	
	
	@Test(priority=1, dataProvider="fetchData")
	public void LocationsSearchIsPresent(String emailId, String pwdLogin, String vehicleModel, String locationPOI, String tripTags) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickLocations()
		.searchIsPresent_5754511(); 
	}
	
	
	
	
	@Test(priority=2, dataProvider="fetchData")
	public void LocationsVehicleCurrentLocation(String emailId, String pwdLogin, String vehicleModel, String locationPOI, String tripTags) throws InterruptedException {
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickLocations()
		.vehicleCurrentLocation();
	}

	@Test(priority=3, dataProvider="fetchData")
	public void LocationsSavePOI(String emailId, String pwdLogin, String vehicleModel, String locationPOI, String tripTags) throws InterruptedException {
	
		new P2_Login(driver, test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickLocations()
		.savePOI(locationPOI);
	}
	
	@Test(priority=4,dataProvider="fetchData")
	public void LocationsDeletePOI(String emailId, String pwdLogin, String vehicleModel, String locationPOI, String tripTags) throws InterruptedException {
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickLocations()
	.deletePOI();
}
	
	
	@Test(priority=5, dataProvider="fetchData")
	public void LocationsSavePOISendToVehiclenDelete (String emailId, String pwdLogin, String vehicleModel, String locationPOI, String tripTags) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickLocations()
		.savePOIAddnSendToVehicle(locationPOI)
		.deletePOI();
		
	}
	
	
	
	@Test(priority=6, dataProvider="fetchData")
	public void LocationsAddTags (String emailId, String pwdLogin, String vehicleModel, String locationPOI) throws InterruptedException {
		new P2_Login(driver,test)
		
		.clickSignIn()
		.enterLoginEmailId(emailId)
		.enterLoginPassword(pwdLogin)
		.clkSignIn()
		.pickTheCar(vehicleModel)
		.clickLocations()
		.clickMyTrips()
		.selectDateType()
		.addTags();
	
		
	}
	
	
}

