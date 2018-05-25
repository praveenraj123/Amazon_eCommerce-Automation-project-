package Amezon.qa.Amezon_application;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Amezon.qa.util.Test_Base;

public class Application extends Test_Base{
	
	
	public static void Amezanlogin(String userrname,String password){
		
		//LanchBrowser(getrep_Data("URL"), "chrome");
		
		Type_Text(getrep_Data("loininput_loca"), userrname);
		
		
		try{
			Boolean=Findwebelement(getrep_Data("lonin_contiuebutton")).isDisplayed();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println("continue buttont is not available");
			Boolean=false;
		}
		
		if (Boolean==true) {
			
			clickby_javascript(getrep_Data("lonin_contiuebutton"));
		}
			
		Type_Text(getrep_Data("passwordloca"), password);
		
		clickby_javascript(getrep_Data("loginbutton"));
		
		
	}

	public static void AmezanLogout(){
		
		Move_ToElement(driver, getrep_Data("yourorderlink"));
		
		clickby_javascript(getrep_Data("Sigout"));
		
		System.out.println("***********Logout is Sucessfully**************");
		
	}
	
	public static void verify_tryPrimepage(){
		
		clickby_javascript(getrep_Data("tryprime"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** Try primepage link clicked ****************");
		
		
		
		
	}
	
	public static void  shop_by_categoryPage(){
		
		clickby_javascript(getrep_Data("shopbycagegory"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("**********************Shop by category page link clicked ****************");
		
			
		
	}
	
	public static void yourAmazon_inPage(){
		
		
	clickby_javascript(getrep_Data("yourAmezonlink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** yourAmezonlink page link clicked ****************");
		
			
		
	}
	
	public static void TodaysDealPage(){
		
		clickby_javascript(getrep_Data("Todaydeallink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** Todaydeallink page link clicked ****************");
		
		
		
		
	}
	
	public static void Amazon_PayPage(){
		
		
		clickby_javascript(getrep_Data("amazonpaylink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** Amazonpaylink page link clicked ****************");
		
		
		
	}
	
	public static void Sell_page(){
		

		
		clickby_javascript(getrep_Data("selllink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** selllink page link clicked ****************");
		
		
		
	}
	
	public static void Customerservice_Page(){
		
		
		clickby_javascript(getrep_Data("customerservicelink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** customerservicelink page link clicked ****************");
		
		
	}
	
	public static void Yourorder_page(){
		
		clickby_javascript(getrep_Data("yourorderlink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** yourorderlink page link clicked ****************");
		
		
		
	}
	
	public static void YourPrime_page(){
		
		
		clickby_javascript(getrep_Data("yourprimelink"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** yourprimelink page link clicked ****************");
		
		
		
	}
	
	public static void YourList_Page(){
		
		
		clickby_javascript(getrep_Data("yourlist"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** yourlist page link clicked ****************");
		
		
	}
	
	public static void Card_Page(){
		
		clickby_javascript(getrep_Data("cart"));
		
		System.out.println(getTitle_currentpage());
	
		System.out.println("********************** cart page link clicked ****************");
		
		
		
	}
	
	public static void ShopBycategory_options_MouseHover(){
		
	
	
	Move_ToElement(driver, getrep_Data("shopbycagegory"));
	
	List<WebElement> web= FindMultypleElements(getrep_Data("categoryoptions_comman"));
		
	for (int i = 0; i < web.size(); i++) {
		
		Move_ToElement(driver, web.get(i));
		
		System.out.println("*************"+web.get(i).getText()+"**********");
						
	}
	
	System.out.println("********** veryfy The list mouse move element ***********");
		
		
	}
}
