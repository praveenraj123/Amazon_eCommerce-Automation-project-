package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.cartpage;

public class Card_page_Functions extends cartpage {


	@BeforeTest

	public void setup(){
		
		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));

		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));

		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));
		Application.Amezanlogin("9003204363", "praveenramasamy");
		
	}


	
	@Test(priority=1)
	public void checkcardCount(){
		Card_count();
		Takescreenshrit("checkcardCount");
	}
	@Test(priority =2)
	public void checkAddcoardcheckout_andDelete_product(){
		cardfunction();
		Takescreenshrit("checkAddcoardcheckout_andDelete_product");
		
	}
	@AfterClass
	public void closebrowser(){
		
		killBrowser();
		
	}
}
