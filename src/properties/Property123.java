package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property123 {
@Test
public void test_poperty() throws FileNotFoundException, IOException
{
	
Properties p=new Properties();
p.load(new FileInputStream("./p.properties"));
String value =p.getProperty("ew");
System.out.println(value);
}
}
