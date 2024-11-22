package _LabCorpPOC;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver;
	Properties prop = new Properties();
	private final String configFilePath= "config//config.properties";
	
	public String browser,user,password,appURL,jobTitle;
	public String implicitWait;
	public String explicitWait;
	

	
	
	
	@BeforeSuite
	public void setUp() throws IOException
	{
		BufferedReader reader=new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/test/resources/config.properties"));
		prop.load(reader);
		browser=prop.getProperty("browserName");
		user=prop.getProperty("userName");
		password=prop.getProperty("password");
		appURL=prop.getProperty("url");
		jobTitle=prop.getProperty("jobTit");
		implicitWait=prop.getProperty("implicity_Wait");
		explicitWait=prop.getProperty("explicity_Wait");
	}

	
/*	@Test
	public void testing()
	{
		System.out.println("test");
		driver=Browser.getInstance().getDriver();
		driver.get("http:/www.google.com");
	}*/
}
