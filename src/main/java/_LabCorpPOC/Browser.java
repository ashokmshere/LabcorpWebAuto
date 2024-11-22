package _LabCorpPOC;

import java.util.Properties;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser {

	private static Browser instance = new Browser();
	public static Properties prop;
	public String browserName, appURL;
	WebDriver driver = null;

	public static Browser getInstance() {
		return instance;
	}

	/*
	 * public static ThreadLocal<RemoteWebDriver> threadDriver=new
	 * ThreadLocal<RemoteWebDriver>() { //@Override public RemoveWebDriver
	 * iniditalValue() { if(browserName.equals("Chrome")) {
	 * 
	 * 
	 * threadDriver.set(new ChromeDriver(OptionsManager.getChromeOptions()));
	 * ChromeOptions options=OptionsManager.getChromeOptions(); Proxy proxy=new
	 * Proxy(); proxy.setProxyType(ProxyType.MANUAL); options.setProxy(proxy);
	 * threadDriver.set(new ChromeDriver(options));
	 * 
	 * 
	 * } } };
	 */

	public WebDriver getDriver() {

		//driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-popup-blocking");
		
		driver = new ChromeDriver(options);
		
		return driver;

	}

}
