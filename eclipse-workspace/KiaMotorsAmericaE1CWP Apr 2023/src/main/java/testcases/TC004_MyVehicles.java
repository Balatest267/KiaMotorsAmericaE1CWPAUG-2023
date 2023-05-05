package testcases;


import org.testng.annotations.Test;
import pages.P2_Login;
import wrappers.KMABase;

public class TC004_MyVehicles extends KMABase {
	
	@Test(priority=1, dataProvider="fetchData")
	public void myVehiclesPickTheVehicle(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.pickTheCar(vehicleModel);
	
	}
	
	@Test(priority=2, dataProvider="fetchData")
	public void myVehiclesClickAddvehicle(String emailId, String pwdLogin, String vehicleModel) throws InterruptedException{
		
	new P2_Login(driver, test)
	
	.clickSignIn()
	.enterLoginEmailId(emailId)
	.enterLoginPassword(pwdLogin)
	.clkSignIn()
	.clickAddVehicle();
	
	}
}


	