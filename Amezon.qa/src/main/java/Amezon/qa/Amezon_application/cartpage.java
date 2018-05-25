package Amezon.qa.Amezon_application;

import org.openqa.selenium.By;

public class cartpage extends Application {

	
	public static void Card_count(){
		
		String count=Findwebelement(".//*[@id='nav-cart-count']").getText();
		
		System.out.println("************** "+count+" *************");
	}
	
	public static void cardfunction(){
		
		clickby_javascript(getrep_Data("cart"));
		ProductSum();
		deleteproduct();
		ProductSum();
		proceedtocheckout();
		getTitle_currentpage();
	}
	public static void ProductSum(){
	web=driver.findElements(By.xpath(".//*[@id='activeCartViewForm']//div[contains(@class,'sc-subtotal')]//p//span"));
		
		System.out.println(web.size());
		
		for (int i=0;i<web.size();i++) {
			System.out.println(web.get(i).getText());
			break;
		}
		
	}
	public static void deleteproduct(){
		clickby_javascript("//a[contains(text(),'Delete')]");
		System.out.println("product deleted");
	}
	public static void proceedtocheckout(){
		
		clickby_javascript(".//*[@id='sc-buy-box-ptc-button']/span/input");
		
	}
	
	
}
