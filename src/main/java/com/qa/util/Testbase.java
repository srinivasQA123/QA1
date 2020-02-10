package com.qa.util;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


//import com.ds.utilities.ReadConfig;

public class Testbase {
	Testutil ut = new Testutil();
	//ReadConfig rcfg = new ReadConfig();
	//public String baseurl= rcfg.getApplicationurl();
	//public String usename = rcfg.getusername();
	//public String password = rcfg.getPassword();
	public static WebDriver driver;
	
	//public static Logger logger;
	//@Parameters("browser")
	//@BeforeClass
	public void setup(String br) {
	//	logger=Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))

		
		{
			System.setProperty("webdriver.chrome.driver",ut.getchromepath());
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",ut.getMozilla());
			driver = new FirefoxDriver();
		}
		else if(br.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver",ut.getIEpath());
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get(baseurl);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
		
	
	
	

}
