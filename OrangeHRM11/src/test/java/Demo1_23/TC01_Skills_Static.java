package Demo1_23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Skills_Static {
	
static WebDriver driver;	
	
    @Test
    public  void Login_Test() throws Exception
	{
		
		
    	TC01_Skills_Static.Openchrome();
    	TC01_Skills_Static.Login();
    	TC01_Skills_Static.Skills();
    	TC01_Skills_Static.Closebrowser();
	}
    
    public static void Openchrome() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
    }
    
    public static void Login() throws Exception
    {
    	findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
    }
    
    
   public static void Skills() throws Exception
    {
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.name("skill[name]")).sendKeys("Kriti");
		findElement(By.name("skill[description]")).sendKeys("Automation");
		findElement(By.id("btnSave")).click();
		
    } 
    
    public static void Closebrowser() throws Exception
    {
    	driver.quit();
    }
    
    public static  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
    


}
