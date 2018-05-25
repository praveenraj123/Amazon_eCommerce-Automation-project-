package Amezon.qa.Amezon_application;

public class yourorderpage extends Application {
	
	public static void youraccound(){
		
		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickby_javascript("//a[contains(@href,'youraccount_ya')]/span[text()='Your Account']");
		getTitle_currentpage();
		
	}
	public static void yourOrderslable(){
		your_accountoptions("Your Orders");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void Loginlable(){
		your_accountoptions("Login & security");
		getTitle_currentpage();
		BackArrow_page();
	}
	
	public static void primelable(){
		your_accountoptions("Prime");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void yourAddresslable(){
		your_accountoptions("Your Addresses");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void paymentoptionslable(){
		your_accountoptions("Payment options");
		getTitle_currentpage();
		BackArrow_page();
	}
	public static void Amazonpaybalancelabble(){
		your_accountoptions("Amazon Pay balance");
		getTitle_currentpage();
		BackArrow_page();
	}
	
	public static void Paymentoption_Addcard(){
		
		your_accountoptions("Payment options");
		
		getTitle_currentpage();
		
		
	/*	Type_Text(getrep_Data("passwordloca"), "praveenramasamy");
		
		clickby_javascript(getrep_Data("loginbutton"));*/
		
		
		clickby_javascript("//span[contains(text(),'Add a new card')]");
		Type_Text("//input[contains(@name,'accountHolderName')]", "praveenraj");
		Type_Text("//input[@name='addCreditCardNumber']", "5105105105105100");
		selectbytext("//select[@id='pp-o1-25' or @name='ppw-expirationDate_month']", "06");
		selectbytext(".//*[@id='pp-o1-26'or@name='ppw-expirationDate_year']", "2019");
		clickby_javascript("//span[contains(text(),'Add your card')]");
		
		
	}
	
public static void your_accountoptions(String linkname){
	
	clickby_javascript(".//*[@id='a-page']//h3[contains(text(),'"+linkname+"')]");
}

}
