package genericclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericOpencloseTest implements FrameWorkconstants {


public  WebDriver driver;

@BeforeMethod
public void openappln(){
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
}
@AfterMethod

	public void closeappln(){
	driver.quit();
	}
	
}