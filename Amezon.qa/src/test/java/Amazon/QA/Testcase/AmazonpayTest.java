package Amazon.QA.Testcase;

import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.AmazonPay;
import Amezon.qa.Amezon_application.Application;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AmazonpayTest extends AmazonPay {
	@Test
	public void Amazonpayfunction() {
		
		AmazonPay.checkAmazonpay_Balance();
		AmazonPay.viewstatement();
		Takescreenshrit("viewstatement");
	}
	
	@BeforeMethod
	
	public  void setupapplication(){
		
		
		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));
		Application.Amezanlogin("9003204363", "praveenramasamy");
		
	}
	
	@BeforeClass
	public void openbrowser() {

		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));


	}

	@AfterTest
	public void afterTest() {
		killBrowser();
	}

}
