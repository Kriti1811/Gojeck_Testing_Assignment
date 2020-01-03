package Gojek;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Day_010_Custimize_EmailableReport_Lab1.Reporter1;

public class Home_Page {

	WebDriver driver;
	Reporter1 R1;
	
	public void Home_Page(WebDriver driver,Reporter1 r1)
	{
		this.driver =  driver;
		this.R1 =  r1;
	}
	
	
	//page 1
	public void Buy() throws Exception
	{	   
	    try
	    {
	    findElement(By.xpath(" //*[@id='container']/div/div/div[1]/div[2]/div/div[1]/a")).click();	 
	    R1.TakeScreenShotAuto(driver,"Home_Page_ Click on Buy","Pass");
	    }
	    
	    catch(Exception e)
		{
			String str=e.getMessage();
			R1.TakeScreenShotAuto(driver,str,"Fail");
		}

	    //*[@id='container']/div/div/div[2]/div[2]/div[1]      
	}
	
	
	//page 2
	public void Checkout() throws Exception
	{
		try
		{
		  findElement(By.xpath("//*[@id='container']/div/div/div[2]/div[2]/div[1]")).click();	  
		  R1.TakeScreenShotAuto(driver,"Home_Page_ Click on Checkout","Pass");
		}
		
		 catch(Exception e)
		{
			String str=e.getMessage();
			R1.TakeScreenShotAuto(driver,str,"Fail");
		}

	}
	
	
	//page 3
	public void Continue() throws Exception
	{
		try
		{
			
			List<WebElement> frames = driver.findElements(By.tagName("iframe"));
			System.out.println("Numnber of frames: " + frames.size());
			
				
			driver.switchTo().frame(frames.get(0));
		  findElement(By.xpath("//*[@id='application']/div[1]/a")).click();
		  R1.TakeScreenShotAuto(driver,"Home_Page_ Click on Continue","Pass");		}
		
		 catch(Exception e)
		{
			String str=e.getMessage();
			R1.TakeScreenShotAuto(driver,str,"Fail");
		}
		   
	}
	
	
	
	//page 4
	public void CreditCard() throws Exception
	{
		try
		{
		  findElement(By.xpath("//*[@id='payment-list']/div[1]/a/div[2]/div[2]")).click();	  
		  R1.TakeScreenShotAuto(driver,"Home_Page_ Click on CreditCard","Pass");
		}
		
		 catch(Exception e)
		{
			String str=e.getMessage();
			R1.TakeScreenShotAuto(driver,str,"Fail");
		}
	}
	
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
}
