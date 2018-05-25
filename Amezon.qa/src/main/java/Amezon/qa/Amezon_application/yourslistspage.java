package Amezon.qa.Amezon_application;

public class yourslistspage  extends Application
{
		
	public static void createwishlist_public(){
		
		Move_ToElement(driver, getrep_Data("yourlist"));
		clickby_javascript("//span[contains(text(),'Create a Wish List')]");
		getTitle_currentpage();
		Type_Text("//input[@id='WLNEW_list_name']", "wishlist1");
		clickby_javascript("(//input[@type='submit' and @aria-labelledby='WLNEW_privacy_public-announce'])[1]");
		clickby_javascript(".//*[@id='a-popover-content-1']/form/div[2]/span[3]/span/span/input");
		getTitle_currentpage();
		
		
		
	}
	
	
	public static void wishlistYour_Friends(){
		
		Move_ToElement(driver, getrep_Data("yourlist"));
		clickby_javascript("//span[contains(text(),'Create a Wish List')]");
		getTitle_currentpage();
		clickby_javascript(".//*[@id='friends-tab']/a");
		
	}
	
	
}
