package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
	@FindBy(xpath="//tr[@class='acZ']/td[2]/div/span[2]")
	private WebElement get_mail_time;
	public MailPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void get_mail_timemethod()
	{
		String text=get_mail_time.getText();
		System.out.println(text);
		
	}
	
}
