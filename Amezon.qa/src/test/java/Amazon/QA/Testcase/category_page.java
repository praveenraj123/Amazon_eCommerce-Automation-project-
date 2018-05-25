package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.shopbyCetegory_Page;

public class category_page extends shopbyCetegory_Page {
	
	
	@BeforeTest
	
	public void setup(){
		
		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		
		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
		
	}
	
	@Test
	
	public void shopCategroy_TitleVerification(){
		
		product_Titleverification();
		Takescreenshrit("shopCategroy_TitleVerification");
		System.out.println("shopCategroy_TitleVerified");
	}
	
	@Test(dependsOnMethods={"shopCategroy_TitleVerification"})
	public void product_addtocart_buynow_Function_verificcation(){
		
		productSelect_addtocart_buyproduct_verification();
		Takescreenshrit("productSelect_addtocart_buyproduct_verification");
		System.out.println("product select function verified ");
		
	}
	@AfterTest
	public void closetheBrowser(){
		
		killBrowser();
		System.out.println("Test Gose to End");
		
	}
}
