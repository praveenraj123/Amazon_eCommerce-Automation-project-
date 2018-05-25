package Amezon.qa.Amezon_application;

public class tryprime_page extends Application {

	public static  void  freeprime(){
		
		clickby_javascript(getrep_Data("yourprimelink"));
		
		clickby_javascript("//span[contains(text(),'Start your 30-day free trial')]");
		
		getTitle_currentpage();
		
		BackArrow_page();
	}
	
	public static void yearsprime(){
		
		clickby_javascript(getrep_Data("yourprimelink"));
		
		clickby_javascript("//span[contains(text(),'Start a year of Prime at ₹999')]");
		
		getTitle_currentpage();
		
		
	}
	
}
