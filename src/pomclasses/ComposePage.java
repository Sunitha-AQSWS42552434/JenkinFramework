package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComposePage {
	@FindBy(xpath="(//div[contains(.,'Compose')])[13]")
	private WebElement compose_button;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement compose_to;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement compose_subject;
	
	@FindBy(xpath="//div[@aria-label='Message Body']")
	private WebElement compose_textarea;
	
	@FindBy(xpath="//div[.='Send']")
	private WebElement compose_send;
	
	@FindBy(xpath="//a[.='Sent']")
	private WebElement compose_sent_click;
	
	public ComposePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void compose_buttonmethod()
	{
		compose_button.click();
		
	}
	public void compose_tomethod(String su)
	{
		compose_to.sendKeys(su);
		
	}
	public void compose_subjectmethod(String sub)
	{
		compose_subject.sendKeys(sub);
		
	}
	public void compose_textareamethod(String textarea)
	{
		compose_textarea.sendKeys(textarea);
		
	}
	public void compose_sendareamethod()
	{
		compose_send.click();
		
	}
	public void compose_sent_click()
	{
		compose_sent_click.click();
		
	}
	
	
}
