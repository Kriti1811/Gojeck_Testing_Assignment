package Gojek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import Day_010_Custimize_EmailableReport_Lab1.Reporter1;
import Gojek.Home_Page;

public class TC01_Add_Card_details_2 {

WebDriver driver;
Reporter1 R1;

	

	@Parameters({"Browser1"})
	@BeforeTest
	public void Test1(String Browser) throws Exception 
	{
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver = TestBrowser.OpenChromeBrowser();
			String TestURL = "https://demo.midtrans.com/";
			driver.get(TestURL);
			


	    }

		if(Browser.equalsIgnoreCase("FireFox"))
		{
			driver = TestBrowser.OpenFirefoxBrowser();
			String TestURL = "https://demo.midtrans.com/";
			driver.get(TestURL);
			
		}
		
		
	}
	
	
	
	@Parameters({"Card1" , "Card2"})
	@Test
	public void Transcation(String Card1, String Card2) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String str= "TC01_Add_Card_details_2";
		R1= new Reporter1(driver,str);	
		
		Home_Page H1 = new Home_Page();
		H1.Home_Page(driver,R1);
		H1.Buy();
	    H1.Checkout();
		H1.Continue();
		H1.CreditCard();
		
		
		
		if(Card1.equals("4811 1111 1111 1114"))
		{
		
			Card_details C1 = new Card_details();
		    C1.Card_details(driver,R1);
			C1.Add_Card_details(Card1,Card2);
			
				Issuing_bank I1 = new Issuing_bank();
				I1.Issuing_bank(driver,R1);
				I1.Add_Issuing_bank();
				driver.switchTo().defaultContent();
		}
		
		
		if(Card2.equals("4811 1111 1111 1113"))
		{
		
			Card_details C1 = new Card_details();
		    C1.Card_details(driver,R1);
			C1.Add_Card_details(Card1,Card2);
			
			
		}
		
		
		
		
		
		
		
		
		}
		
				

	
	@AfterTest 
	public void  TestCloser()throws Exception {
		
		driver.quit();
	}



}
