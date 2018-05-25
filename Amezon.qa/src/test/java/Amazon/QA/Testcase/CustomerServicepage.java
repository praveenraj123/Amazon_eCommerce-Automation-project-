package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.Customerservice;

public class CustomerServicepage extends Customerservice {
	
	@BeforeClass
	
		public void setup(){
			
				
	}
	
	@BeforeTest
	
	public void openBrowser(){
		

		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		
		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));
		Application.Amezanlogin("9003204363", "praveenramasamy");
		
	}
	@Test(priority=1)
	
	public void customerservice_page(){
		customerserviceModule();
		Takescreenshrit("customerserviceModule");
	}
	
	@Test(priority=2)
	public void yourorderpage(){
		
		your_order();
		Takescreenshrit("your_order");
		
		
		
	}
	
	@Test(priority=3)
	public void return_and_refund(){
		return_refund();
		Takescreenshrit("return_refund");
		
	}
	@Test(priority=4)
	public void managAddresspage(){
		Manage_Address();
		Takescreenshrit("Manage_Address");
		
	}
	@Test(priority=5)
	public void manageprimepage(){
		Manage_Prime();
		Takescreenshrit("manageprimepage");
	}
	@Test(priority=6)
	public void paymentsetting(){
		Payment_Setting();
		Takescreenshrit("paymentsetting");
	}
	@Test(priority=7)
	public void accoundsettingpage(){
		Accound_Setting();
		Takescreenshrit("Accound_Setting");
	}
	@AfterTest
	public void closebrowser(){
		killBrowser();
	}
}
