package Amezon.qa.Amezon_application;

public class Customerservice extends Application {

	public static void customerserviceModule(){
		
		clickby_javascript(getrep_Data("customerservicelink"));
				
		
	}
	
	public static void your_order(){
		
		customerLink("Your Orders");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void return_refund(){
		customerLink("Returns & Refunds");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void Manage_Address(){
		customerLink("Manage Addresses");
		getTitle_currentpage();
		BackArrow_page();
	}
	
	public static void Manage_Prime(){
		
		customerLink("Manage Prime");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void Payment_Setting(){
		customerLink("Payment Settings");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void Accound_Setting(){
		customerLink("Account Settings");
		getTitle_currentpage();
		BackArrow_page();
		
	}
	public static void customerLink(String Linkname){
		
	//	element=Findwebelement("//div[contains(@class,'landing-container-wide')]//a[contains(text(),'"+Linkname+"')]");
		
		clickby_javascript("//div[contains(@class,'landing-container-wide')]//a[contains(text(),'"+Linkname+"')]");
		
	}
	
}
