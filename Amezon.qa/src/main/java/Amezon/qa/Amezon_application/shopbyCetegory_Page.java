package Amezon.qa.Amezon_application;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class shopbyCetegory_Page extends Application {
	
	public static String child_window;
	
	public static String addcart=".//*[@id='add-to-cart-button']";
	
	public static String buynow=".//*[@id='buy-now-button']";
	
	public static String Editcard=".//*[@id='hlb-message-form']//input";
	
	public static String proced_tocheckout=".//*[@id='sc-buy-box-ptc-button']/span/input";
	
	public static String checkout=".//*[@id='hlb-next-steps']/a";
		
	public static void product_Titleverification(){
		
		clickby_javascript(getrep_Data("shopbycagegory"));
		
	web=FindMultypleElements(".//*[@id='shopAllLinks']//td//h2");
		
		for (WebElement el : web) {
			
			Highlight_Element(el);
			System.out.println(el.getText());
			
		}
	}
			
	public static void productSelect_addtocart_buyproduct_verification(){
	
		web=FindMultypleElements(".//*[@id='shopAllLinks']//td[1]//div[1]//ul//li//a");
		int c=web.size();
		System.out.println("totel count "+c);

		/*for (int i = 0; i < c; i++) {
			
			
			System.out.println(web.get(i).getText());
			
			web.get(i).click();*/
			
			
		
		clickby_javascript(".//*[@id='shopAllLinks']/tbody/tr/td[1]/div[1]/ul/li[1]/a");
		
		String parant=driver.getWindowHandle();
		
		Set<String> win=driver.getWindowHandles();
		
		Iterator<String>it=win.iterator();
		while (it.hasNext()) {
		 child_window=it.next();
			
		}
		
		System.out.println(win.size());
		
		if (!parant.equals(child_window)) {
		
			driver.switchTo().window(child_window);
			getTitle_currentpage();
			
			//clickby_javascript(buynow);
			mouseclick(driver, buynow);
			pageReload();
			getTitle_currentpage();
			BackArrow_page();
			pageReload();
			clickby_javascript(addcart);
			pageReload();
			clickby_javascript(Editcard);
			pageReload();
			clickby_javascript(proced_tocheckout);
			getTitle_currentpage();
			BackArrow_page();
			getTitle_currentpage();
			BackArrow_page();
			getTitle_currentpage();
			clickby_javascript(proced_tocheckout);
			
			driver.close();
			driver.switchTo().window(parant);
			
		//}
		
		}
	}
	
}
