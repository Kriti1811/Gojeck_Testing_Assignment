package Demo1_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login_Non_Static {

	WebDriver driver;	
    @Test
    public  void Login_Test() throws Exception
	{
		
		TC01_Login_Non_Static TN1= new TC01_Login_Non_Static();
		TN1.Openchrome();
		TN1.Login();
		TN1.Nationality();
		TN1.Closebrowser();
	}
    
    public void Openchrome() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
    }
    
    public void Login() throws Exception
    {
    	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
    }
    
  
    
    public void Nationality() throws Exception
    {
    	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.id("nationality_name")).sendKeys("Chinese1");
		driver.findElement(By.id("btnSave")).click();
    }
    
    public void Closebrowser() throws Exception
    {
    	driver.quit();
    }
         

}
