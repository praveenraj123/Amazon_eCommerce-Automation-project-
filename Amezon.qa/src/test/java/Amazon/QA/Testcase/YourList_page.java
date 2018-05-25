package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.yourslistspage;

public class YourList_page extends yourslistspage {

	@BeforeClass
	public void openBrowser(){

		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));

		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
	}

	@BeforeTest

	public void setup(){

		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));
		Application.Amezanlogin("9003204363", "praveenramasamy");
		
	}
	@Test
	public void createWishList(){
		createwishlist_public();
		Takescreenshrit("createwishlist_public");
		
	}
	@Test
	
	public void FriendsWishList(){
		wishlistYour_Friends();
		Takescreenshrit("wishlistYour_Friends");
	}
	
	@AfterClass
	
	public void close(){
		killBrowser();
	}
}
