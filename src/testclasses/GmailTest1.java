package testclasses;

import org.testng.annotations.Test;

import genericclasses.GenericOpencloseTest;
import pomclasses.LogOutPage;
import pomclasses.LoginPage;

public class GmailTest1 extends GenericOpencloseTest {

	@Test
	public void testscript() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername("Sunithahnb18@gmail.com");
		
		Thread.sleep(7000);
		lp.clickNext();
		Thread.sleep(7000);
		lp.setPassword("9945159745!@SUNI");
		Thread.sleep(7000);
		lp.clickNext();
		
		LogOutPage lo=new LogOutPage(driver);
		lo.mylogoutmethod();
		Thread.sleep(10000);
		lo.mysignoutmethod();
	}
	
}
