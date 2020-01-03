 package Day_38_Selenium_Grid;
 
 import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
 import java.net.MalformedURLException;
 import java.net.URL;
 import org.openqa.selenium.remote.RemoteWebDriver;
 import org.testng.annotations.*;

 public class SeleniumGrid {

     WebDriver driver;
     String baseURL, nodeURL;

     @BeforeTest
     public void setUp() throws MalformedURLException {
        
         nodeURL = "http://192.168.29.95:5588/wd/hub";
         //ChromeProfile profile = new ChromeProfile();
         ChromeOptions options = new ChromeOptions();
 
        // options.setProfile();
        // driver = new RemoteWebDriver(options);
         driver = new RemoteWebDriver(new URL(nodeURL), options);
         
         
     }

    
     
     @Test
     public void sampleTest() throws Exception {
         driver.get(baseURL);
         
     	String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
		
		findElement(By.id("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
		
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		
         
     }
     
     
     
     @AfterTest
     public void afterTest() {
         driver.quit();
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