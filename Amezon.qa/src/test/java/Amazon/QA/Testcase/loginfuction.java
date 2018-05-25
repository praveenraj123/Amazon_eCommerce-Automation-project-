package Amazon.QA.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amezon.qa.Amezon_application.Loginpage;

public class loginfuction extends Loginpage {


	@BeforeTest

	public void opening_application(){



		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));


	}
	@BeforeMethod
	public void loginpagenavigation(){

		Move_ToElement(driver, getrep_Data("yourorderlink"));

		clickedwebelement(getrep_Data("yourtorder_signinbutton"));

	}
	@Test(priority=6)
	public void login(){




		Assert.assertEquals(getTitle_currentpage(), getrep_Data("LoginpageTitle"));

		Amezanlogin(getrep_Data("mobilenumber"),getrep_Data("password"));

		Assert.assertEquals(getTitle_currentpage(), getrep_Data("Afterloginpage_title"));

		AmezanLogout();


	}

	@Test(priority=2) 
	public void verfyand_Login(){

		
		verifyLoginPageLogo();

		Takescreenshrit("verfiy  Amezonlog");



	}
	@Test(enabled=false)
	public void Needhelp_options(){

		Needhelplink();

		Takescreenshrit("verfiy  Needhelp options");

	}
	
	@Test(priority=4)
	public void verifyforgetpwdFunction(){
		Forgetpassword();
		Takescreenshrit("verfiy  forgetpwd options");
	}
	
	@Test(enabled=false)
	public void verifyotherissueFunction(){
		
		Otherissues_with_signin();
		Takescreenshrit("verfiy  Needhelp options");
	}
	
	@Test(priority=1)
	public void verifycreateNewuserFunction(){
		
		createAccount("praveenraj", "praveen@123", "1234567890", "mr.praveenraj13@gmail.com");
		Takescreenshrit("verfiy verifycreateNewuserFunction");
	}
	
	@AfterMethod

	public void homepagenavication(){
		Homepage();
	}
	
	@AfterTest

	public void close_application(){

		killBrowser();
	}

}
