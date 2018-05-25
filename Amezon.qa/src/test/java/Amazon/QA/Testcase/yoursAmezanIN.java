package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.UserAmazonIN;

public class yoursAmezanIN extends UserAmazonIN {
	
	

	@BeforeTest
	
	public void lanchApplication(){
		
		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));

		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
		
	}
	
	@Test
	public void product_addtocart(){
		
		yoursAmazonFunction("9003204363", "praveenramasamy");
		
		Takescreenshrit("yoursAmazonFunction");
		
	}
	
	@AfterTest
	public void closeBrowser(){
		killBrowser();
	}
}
