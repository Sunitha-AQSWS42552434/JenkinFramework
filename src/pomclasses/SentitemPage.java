package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SentitemPage {
	
		@FindBy(xpath="(//div/table/tbody/tr[1]/td[6]/div/div/span)[2]")
		private WebElement click_sent_mail;
		
		public SentitemPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
		}
		public void click_sent_mailmethod()
		{
			click_sent_mail.click();
			
		}
}
