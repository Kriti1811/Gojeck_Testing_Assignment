package Demo1_23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Login_NS_DataProvider {
	WebDriver driver;

	 
	 //step1
	 @DataProvider(name = "TC01_OrangeHRM_Data")
	  public static Object[][] Test1() throws Exception {
	 
	        return new Object[][] { 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Chinese1"} ,
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Chinese2"} ,
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian18"}
	        	//getting input data using data provider
	        	};
	  }
	 
		//step2
	    @Test(dataProvider="TC01_OrangeHRM_Data")
	    //step3
	    public  void Login_Test(String TestURL, String UserName, String Password, String Nationality) throws Exception
		{
		    //classname.methodname
	    	TC01_Login_NS_DataProvider TN = new TC01_Login_NS_DataProvider();
	    	TN.Openchrome();
	    	TN.OrangeHRM(TestURL);
	    	TN.Login(UserName,Password);   //passing global variables to local methods
	    	TN.Nationality(Nationality);
	    	TN.Closebrowser();
		}
	    
	    public void Openchrome() throws Exception
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
	    }
	    
	    public void OrangeHRM(String TestURL) throws Exception
	    {
	    	driver.get(TestURL);
			
	    }
	    
	    public void Login(String Uname,String Pwd) throws Exception
	    {
	    	findElement(By.name("txtUsername")).sendKeys(Uname);
			findElement(By.id("txtPassword")).sendKeys(Pwd);
			findElement(By.id("btnLogin")).click();
	    }
	    
	  
	    
	    public void Nationality(String NationalityText1) throws Exception
	    {
	    	findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_nationality")).click();
			findElement(By.name("btnAdd")).click();
			findElement(By.id("nationality_name")).sendKeys(NationalityText1);
			findElement(By.id("btnSave")).click();
	    }
	    
	 
	    
	    public void Closebrowser() throws Exception
	    {
	    	driver.quit();
	    }
	    
	    public WebElement findElement(By by) throws Exception 
		{

			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}
	    


}
