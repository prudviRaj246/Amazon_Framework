package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utility.ReadConfig;

public class BaseClass {

	ReadConfig readcnfg=new ReadConfig();
	public String amazonURL=readcnfg.getAmazonURL();
	public String flipkartURL=readcnfg.getFlipkartURL();
	public String itemName=readcnfg.getItemname();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp() throws Exception
	{
		
		logger=Logger.getLogger("inetBanking");
		PropertyConfigurator.configure("log4j.properties");
			System.setProperty("webdriver.chrome.driver",readcnfg.chromePath());
			driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() throws Exception
	{
		driver.close();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileHandler.copy(source,target);
		
	}
	


}
