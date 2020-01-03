package Gojek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Day_010_Custimize_EmailableReport_Lab1.Reporter1;

public class Issuing_bank {
	
	WebDriver driver;
	
	Reporter1 R1;
	
	
	public void Issuing_bank(WebDriver driver,Reporter1 r1)
	{
		this.driver =  driver;
		this.R1 =  r1;
	}
	
	public void Add_Issuing_bank() throws Exception
	{
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Numnber of frames: " + frames.size());
		
			
		driver.switchTo().frame(frames.get(0));
		
		findElement(By.xpath("//*[@id='PaRes']")).sendKeys("112233");
		findElement(By.name("ok")).click();
		
		
		
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
