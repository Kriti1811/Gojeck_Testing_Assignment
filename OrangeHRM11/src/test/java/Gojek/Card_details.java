package Gojek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Day_010_Custimize_EmailableReport_Lab1.Reporter1;

public class Card_details {
	
	WebDriver driver;
	Reporter1 R1;
	
	public void Card_details(WebDriver driver,Reporter1 r1)
	{
		this.driver =  driver;
		this.R1 =  r1;
	}
	
	public void Add_Card_details(String Card1,String Card2) throws Exception
	{
		
		try
		{
			findElement(By.xpath("//*[@id='application']/div[3]/div/div/div/form/div[2]/div[1]/input")).sendKeys(Card1);
			findElement(By.xpath("//*[@id='application']/div[3]/div/div/div/form/div[2]/div[2]/input")).sendKeys("02/20");
			findElement(By.xpath("//*[@id='application']/div[3]/div/div/div/form/div[2]/div[3]/input")).sendKeys("123");
			findElement(By.xpath("//*[@id='application']/div[1]/a")).click();
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
