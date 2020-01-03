package  Day_36_Desired_Capabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import Day_034_TestNG_Listeners.TestBrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEtestforDesiredCapabilities
{
	WebDriver driver;
	
	@Test
	public void Open_OrangeHRM() throws Exception {
		//OpenChromeVrowser
	

	
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		 capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		 
		 String IEdriverPath = "C:\\IEDriver\\IEDriverServer32.exe";
		 
		 System.setProperty("webdriver.ie.driver",IEdriverPath);
		 driver = new InternetExplorerDriver(capabilities);
		 
		 

		
	//	driver=TestBrowser.OpenIEBrowser();
		
		//WebDriverManager.iedriver().setup();
		//driver =new InternetExplorerDriver();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.id("txtUsername")).click();
		findElement(By.id("txtUsername")).clear();
		findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		findElement(By.id("btnLogin")).click();
		
		
		
		
		//driver.quit();
	}
	

public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}
	
}                                                  












