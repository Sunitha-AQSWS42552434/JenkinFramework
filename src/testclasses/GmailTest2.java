package testclasses;

import org.testng.annotations.Test;

import genericclasses.GenericOpencloseTest;
import pomclasses.ComposePage;
import pomclasses.LoginPage;
import pomclasses.MailPage;
import pomclasses.SentitemPage;

public class GmailTest2 extends GenericOpencloseTest{
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
		
		ComposePage cp=new ComposePage(driver);
		cp.compose_buttonmethod();
		Thread.sleep(10000);
	cp.compose_tomethod("sunithahnb18@gmail.com");
	Thread.sleep(7000);
	cp.compose_subjectmethod("hi");
	Thread.sleep(10000);
	cp.compose_textareamethod("hello");
	Thread.sleep(10000);
	cp.compose_sendareamethod();
	Thread.sleep(10000);
	cp.compose_sent_click();
	Thread.sleep(10000);
	
	SentitemPage sp=new SentitemPage(driver);
	sp.click_sent_mailmethod();
	Thread.sleep(10000);
	MailPage mp=new MailPage(driver);
	mp.get_mail_timemethod();
	
	}
	}
