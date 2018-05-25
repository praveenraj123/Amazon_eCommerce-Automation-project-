package Amezon.qa.Amezon_application;

import java.util.List;

import org.openqa.selenium.WebElement;

public class AmazonPay extends Application {
	
	public static void checkAmazonpay_Balance(){
		
		
		
		clickedwebelement(getrep_Data("amazonpaylink"));
	
		List<WebElement> w=FindMultypleElements(".//*[@id='dashboard-container']//span");
		 
		for (int i = 0; i < w.size(); i++) {
			
			System.out.println(w.get(i).getText());
			
		}
		
		
	}
	
	public static void viewstatement(){
		
		clickedwebelement(".//*[@id='dashboard-container']//a[contains(@href,'statement')]");
		getTitle_currentpage();
			
	}
	
}
