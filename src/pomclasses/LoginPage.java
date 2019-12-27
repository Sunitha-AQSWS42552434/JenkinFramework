package pomclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	@FindBy(id="identifierId")
	private WebElement intbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement nextfield;
	
	@FindBy(name="password")
	private WebElement pwdtbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void setusername(String un)
	{
		intbox.sendKeys(un);
		
	}
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
		
	}
	public void clickNext()
	{
		nextfield.click();
		
	}
	public void clicklogin()
	{
		loginbtn.click();
		
	}
}
