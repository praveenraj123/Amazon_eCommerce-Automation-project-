package Amezon.qa.Amezon_application;

public class Sell_page extends Application {

	
	public static void sellmadule(){
		
		clickedwebelement(getrep_Data("selllink"));
		getTitle_currentpage();
		clickby_javascript("(//a[contains(text(),'Start selling')])[1]");
		getTitle_currentpage();
		BackArrow_page();
		clickby_javascript(getrep_Data("Backto_top"));
		
		
		
	}
	
	public static void SellerAccoundcreation(){
		
	}
	
}
