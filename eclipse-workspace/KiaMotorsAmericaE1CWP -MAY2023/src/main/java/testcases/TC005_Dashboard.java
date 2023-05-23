package testcases;

import org.testng.annotations.Test;
import pages.P2_Login;
import wrappers.KMABase;

public class TC005_Dashboard extends KMABase {
	
	
	@Test(priority=1, dataProvider="fetchData")
	public void DashboardClickDoorUnLock(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
	
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickDoorUnLock();
	
	}
	
	@Test(priority=2, dataProvider="fetchData")
	public void DashboardClickDoorLock(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
	
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickDoorlock();
	
	}
	
	@Test(priority=3, dataProvider="fetchData")
	public void DashboardClickRemoteClimateStart(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
	
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickRemoteStartStop()
	.clickRemoteStop();
	}
	

	
/*	@Test(priority=5, dataProvider="fetchData")
	public void dashboard_5754554(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
	
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickRemoteStartWithHeatedAccessories()
	.clickRemoteStop();
	}*/
	
	
	
	
	@Test(priority=4, dataProvider="fetchData")
	public void DashboardClickMasterRefresh(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickMasterRefresh();
	}
	
	@Test(priority=5, dataProvider="fetchData")
	public void DashboardLastRefreshExist(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.lastRefresh();
		
	}
	
	
	@Test(priority=6, dataProvider="fetchData")
	public void DashboardClickRemoteClimateStartWithToggles(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
	
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel)
	.clickRemoteStartWithToggles()
	.clickRemoteStop();
	}
}


	