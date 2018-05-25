package Amazon.QA.Testcase;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amezon.qa.Amezon_application.Application;

public class Homepage extends Application {
	
	static boolean  bool;
	static String s;
	public SoftAssert sassert=new SoftAssert();
	@BeforeTest
	public void openBrowser(){
		
		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		
		sassert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
		
		
	}
	
	@Test
	public void verify_Homepage(){
		// verify log
		
			
		bool=veryfyElementDisplay(getrep_Data("logo"));
		sassert.assertEquals(true, bool);
		Reporter.log("hi");
		//verify trymelink
		bool=veryfyElementDisplay(getrep_Data("tryprime"));
		sassert.assertEquals(true, bool);
		
		//cagegory verification
		bool=veryfyElementDisplay(getrep_Data("shopbycagegory"));
		sassert.assertEquals(true, bool);
		
		//yourAmezonlink
		bool=veryfyElementDisplay(getrep_Data("yourAmezonlink"));
		sassert.assertEquals(true, bool);
		
		//Todaydeallink
		bool=veryfyElementDisplay(getrep_Data("Todaydeallink"));
		sassert.assertEquals(true, bool);
		
		//amazonpaylink
		bool=veryfyElementDisplay(getrep_Data("amazonpaylink"));
		sassert.assertEquals(true, bool);
		
		// selllink
		bool=veryfyElementDisplay(getrep_Data("selllink"));
		sassert.assertEquals(true, bool);
		
		//customerservicelink
		bool=veryfyElementDisplay(getrep_Data("customerservicelink"));
		sassert.assertEquals(true, bool);
		
		//yourorderlink
		bool=veryfyElementDisplay(getrep_Data("yourorderlink"));
		sassert.assertEquals(true, bool);
		
		//yourprimelink
		bool=veryfyElementDisplay(getrep_Data("yourprimelink"));
		sassert.assertEquals(true, bool);
		
		
		//yourlist
		bool=veryfyElementDisplay(getrep_Data("yourlist"));
		sassert.assertEquals(true, bool);
		
		//cart
		bool=veryfyElementDisplay(getrep_Data("cart"));
		sassert.assertEquals(true, bool);
		
		//selectdropdown
		bool=veryfyElementDisplay(getrep_Data("select_all_drop_visible"));
		sassert.assertEquals(true, bool);
		
		//Serchtextbox
		bool=veryfyElementDisplay(getrep_Data("Serchtextbox"));
		sassert.assertEquals(true, bool);
		
		//searcsymbel
		bool=veryfyElementDisplay(getrep_Data("searcsymbel"));
		
		sassert.assertEquals(true, bool);
		
		sassert.assertAll();
	}

	@Test 
	
	public void verify_Homepage_HeaderLink_options(){
		
		
		verify_tryPrimepage();
		BackArrow_page();
		
		shop_by_categoryPage();
		BackArrow_page();

		yourAmazon_inPage();
		BackArrow_page();

		TodaysDealPage();
		BackArrow_page();

		Amazon_PayPage();
		BackArrow_page();

		Sell_page();
		BackArrow_page();

		Customerservice_Page();
		BackArrow_page();

		Yourorder_page();
		BackArrow_page();

		YourPrime_page();
		BackArrow_page();

		YourList_Page();
		BackArrow_page();

		Card_Page();
		BackArrow_page();

		
	}
	
	@AfterClass
	public void closebrowser(){
		killBrowser();
	}
}
