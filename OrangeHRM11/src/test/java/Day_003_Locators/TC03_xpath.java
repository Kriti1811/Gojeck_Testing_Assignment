package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class TC03_xpath
{
	

	
	static WebDriver driver;
	

	
	static String  UserName="//*[@id='txtUsername']";
	static String  Password="//*[@id='txtPassword']";
	static String  Loginbutton="//*[@id='btnLogin']";
	static String  Admin="//*[@id='menu_admin_viewAdminModule']/b";
	static String  Nationality="//*[@id='menu_admin_nationality']";
	
	
	@Test
	public void Test2() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	
		driver.findElement(By.xpath(UserName)).sendKeys("Admin");
		driver.findElement(By.xpath(Password)).sendKeys("admin123");
		driver.findElement(By.xpath(Loginbutton)).click();
		
		driver.findElement(By.xpath(Admin)).click();
		driver.findElement(By.xpath(Nationality)).click();
		
		
		
		

	}
	
	
	
	
	
	
		
	
	
	 
	
	
}












