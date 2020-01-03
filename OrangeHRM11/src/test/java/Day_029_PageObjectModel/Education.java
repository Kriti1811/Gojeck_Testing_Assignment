package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Education
{
	
	WebDriver driver;
	
	public void Education(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  void AddEducation() throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewEducation")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("education_name")).sendKeys("Btech");
		findElement(By.id("btnSave")).click();
		
		
		//How to do scrolling (only these 3 lines need to be followed)
        JavascriptExecutor js = (JavascriptExecutor)driver;		

        WebElement Element = findElement(By.linkText("Btech")); //to create a hyperlink so that it can be scrolled till btech
        js.executeScript("arguments[0].scrollIntoView();", Element);
		
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












