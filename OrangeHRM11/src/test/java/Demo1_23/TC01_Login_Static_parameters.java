package Demo1_23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login_Static_parameters {
static WebDriver driver;

static String UserName="Admin",Password="admin123";
static String NationalityText="Chinese1";
	
    @Test
    public  void Login_Test() throws Exception
	{
	    //classname.methodname
    	TC01_Login_Static_parameters.Openchrome();
    	TC01_Login_Static_parameters.Login(UserName,Password);   //passing global variables to local methods
    	TC01_Login_Static_parameters.Nationality(NationalityText);
    	TC01_Login_Static_parameters.Closebrowser();
	}
    
    public static void Openchrome() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
    }
    
    public static void Login(String Uname,String Pwd) throws Exception
    {
    	findElement(By.name("txtUsername")).sendKeys(Uname);
		findElement(By.id("txtPassword")).sendKeys(Pwd);
		findElement(By.id("btnLogin")).click();
    }
    
  
    
    public static void Nationality(String NationalityText1) throws Exception
    {
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(NationalityText1);
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
