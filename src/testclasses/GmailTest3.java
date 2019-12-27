package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genericclasses.ExcelReadGeneric;
import genericclasses.GenericOpencloseTest;
import pomclasses.LoginPage;
import pomclasses.LogOutPage;
import pomclasses.LoginPage;

public class GmailTest3 extends GenericOpencloseTest {
	@Test
	public void testscript() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setusername("Sunithahnb18@gmail.com");
		Thread.sleep(10000);
		lp.clickNext();
		Thread.sleep(10000);
		lp.setPassword("9945159745!@SUNI");
		Thread.sleep(10000);
		lp.clickNext();
				
		LogOutPage lo=new LogOutPage(driver);
		lo.mylogoutmethod();
		Thread.sleep(10000);
		lo.mysignoutmethod();
		
		
	}
}
