package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.Sell_page;

public class sellpage extends Sell_page {

	@BeforeTest
	public void lancheBrowser(){
		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
	}
	
	@BeforeMethod
	public void setup(){
		
		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));
		Application.Amezanlogin("9003204363", "praveenramasamy");
	}
	
	@Test
	public void sellpagefunction(){
		sellmadule();
		Takescreenshrit("sellmadule");
		
	}
	@AfterTest
	public void close(){
		killBrowser();
	}
	
}
