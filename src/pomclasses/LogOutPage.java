package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	@FindBy(xpath="//span[@class='gb_Ia gbii']")
	private WebElement mylogout;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement mysignout;
	
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void mylogoutmethod()
	{
		mylogout.click();
		
	}
	public void mysignoutmethod()
	{
		mysignout.click();
		
	}
	
}
