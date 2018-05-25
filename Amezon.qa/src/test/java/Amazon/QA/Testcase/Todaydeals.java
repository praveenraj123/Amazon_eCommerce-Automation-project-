package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.TodaysDeal;

/**
 * @author Praveen Raj
 *
 */
public class Todaydeals extends TodaysDeal {

	@BeforeMethod

	public void opening_application(){



		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));

		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));


	}
	
	@Test
	
	public void Todayscategory(){
		
		Todaydeals();
		Takescreenshrit("Todayscategory");
		Todaydeals_PriceLowToHigh();
		Takescreenshrit("Todaydeals_PriceLowToHigh");
		Todaydeals_DiscountLowtoHigh();
		Takescreenshrit("Todaydeals_DiscountLowtoHigh");
		
	}
	@AfterMethod
	public void close(){
		killBrowser();
		
	}
}
