package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.yourorderpage;

public class Yororders_Page extends yourorderpage {

	

	@BeforeTest
		public void openBrowser(){

		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));

		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
				
			Move_ToElement(driver, getrep_Data("yourorderlink"));
			clickedwebelement(getrep_Data("yourtorder_signinbutton"));
			Application.Amezanlogin("9003204363", "praveenramasamy");
			youraccound();
		
	}

	@Test
	public void Tocheckyourorders(){

		yourOrderslable();
		Takescreenshrit("Tocheckyourorders");
	}
	@Test
	public void Tocheck_loginandsecurity(){

		Loginlable();
		Takescreenshrit("Tocheck_loginandsecurity");
	}
	@Test
	public void Tocheck_prime(){

		primelable();
		Takescreenshrit("Tocheck_prime");
	}
	@Test
	public void Tocheck_yourAddress(){

		yourAddresslable();
		Takescreenshrit("Tocheck_yourAddress");
	}
	@Test
	public void Tocheck_paymentoption(){

		paymentoptionslable();
		Takescreenshrit("Tocheck_paymentoption");
	}
	@Test
	public void Tocheck_Amazonpay(){
		Amazonpaybalancelabble();
		Takescreenshrit("Tocheck_Amazonpay");
	}
	@Test
	public void Tocheck_AddcoardFunction(){
		Paymentoption_Addcard();
		Takescreenshrit("Tocheck_AddcoardFunction");
	}
	@AfterTest
	public void close(){
		killBrowser();

	}
}
