package Day_023_File_Upload_Download;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC05_KeyBoard_Inputs {
	
	
	static WebDriver driver;
	
	
	@Test
	public void OpeningNewTab() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	 

	}
	
	
	
	//@Test
	public void OpeningNewTab1(){
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		    try {
		        Robot robot = new Robot();

				
				// ctrl + T & ctrl TAB  
				
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_T);
				
				    // CTRL+T is now pressed 
				
				    robot.keyRelease(KeyEvent.VK_T);
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				
				} catch (AWTException e) {
				        e.printStackTrace();
				}
					
			
	
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
