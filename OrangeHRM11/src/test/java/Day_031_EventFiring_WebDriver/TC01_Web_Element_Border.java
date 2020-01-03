package Day_031_EventFiring_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver; //step1
import org.testng.annotations.Test;

import CommonUtil.EventHandler;


public class TC01_Web_Element_Border {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	


		EventFiringWebDriver driver1 = new EventFiringWebDriver(driver); //stpe2
	    EventHandler handler = new EventHandler();  //step3
	    driver1.register(handler);  //Step4
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	
	   driver1.findElement(By.name("txtUsername")).sendKeys("Admin"); //step5
	   driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
	   driver1.findElement(By.name("Submit")).click();
		
	}
	
	
	
	
	
	

}
