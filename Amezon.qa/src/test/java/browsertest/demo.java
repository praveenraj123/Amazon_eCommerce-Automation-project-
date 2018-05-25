package browsertest;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import Amezon.qa.Amezon_application.AmazonPay;
import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.Customerservice;
import Amezon.qa.Amezon_application.Sell_page;
import Amezon.qa.Amezon_application.TodaysDeal;
import Amezon.qa.Amezon_application.UserAmazonIN;
import Amezon.qa.Amezon_application.cartpage;
import Amezon.qa.Amezon_application.yourorderpage;
import Amezon.qa.Amezon_application.yourslistspage;
import Amezon.qa.util.Test_Base;

public class demo extends Test_Base  {
	
	public static List<WebElement> web;
	
	public static String child_window;
public static String addcart=".//*[@id='add-to-cart-button']";
	
	public static String buynow=".//*[@id='buy-now-button']";
	
	public static String Editcard="//form[@id='hlb-message-form']//input[@name='editCart']";
	
	public static String proced_tocheckout=".//*[@id='sc-buy-box-ptc-button']//input[@name='proceedToCheckout']";
	
	public static String checkout=".//*[@id='hlb-next-steps']/a";
			
	
	public static void main(String[] args) throws IOException {
		
		LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));
		
		/*//Takescreenshrit("Hompage");
		LocalDateTime d=java.time.LocalDateTime.now();
		String d1=d.toString();
		TakesScreenshot t=((TakesScreenshot)driver);
		File sorce=t.getScreenshotAs(OutputType.FILE);
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = new Date();
		
		String systemdateandtime= dateFormat.format(date);
		
		System.out.println(systemdateandtime);
		
		String ss="./Screenshorts/"+System.currentTimeMillis()+"-test.jpg";
		
		File dest=new File(ss);
		String ff=System.getProperty("user.dir");
		System.out.println(ff+ss);
		
		System.out.println(dest.exists());
		System.out.println(dest.getAbsolutePath());
		
		FileUtils.copyFile(sorce, new File(ss));
		
		
		
		
*/		
		//driver.quit();
		
/*//		
//		clickby_javascript(getrep_Data("shopbycagegory"));
//		
//		
//		web=FindMultypleElements(".//*[@id='shopAllLinks']//td//h2");
//		
//		for (WebElement el : web) {
//			
//			Highlight_Element(el);
//			System.out.println(el.getText());
//			
//		}
//		
//		
//		//clickby_javascript(".//*[@id='shopAllLinks']/tbody/tr/td[1]/div[1]/ul/li[1]/a");
//		
//		web=FindMultypleElements(".//*[@id='shopAllLinks']//td[1]//div[1]//ul//li//a");
//		int c=web.size();
//		System.out.println("totel count "+c);
//		/*for (int i = 0; i < c; i++) {
//			
//			
//			System.out.println(web.get(i).getText());
//			
//			web.get(i).click();*/
//			
//			
//		
//		clickby_javascript(".//*[@id='shopAllLinks']/tbody/tr/td[1]/div[1]/ul/li[1]/a");
//		
//		String parant=driver.getWindowHandle();
//		
//		Set<String> win=driver.getWindowHandles();
//		
//		Iterator<String>it=win.iterator();
//		while (it.hasNext()) {
//		 child_window=it.next();
//			
//		}
//		
//		System.out.println(win.size());
//		
//		if (!parant.equals(child_window)) {
//		
//			driver.switchTo().window(child_window);
//			getTitle_currentpage();
//			
//			//clickby_javascript(buynow);
//			mouseclick(driver, buynow);
//			pageReload();
//			getTitle_currentpage();
//			BackArrow_page();
//			pageReload();
//			clickby_javascript(addcart);
//			pageReload();
//			clickby_javascript(Editcard);
//			pageReload();
//			clickby_javascript(proced_tocheckout);
//			getTitle_currentpage();
//			BackArrow_page();
//			getTitle_currentpage();
//			BackArrow_page();
//			getTitle_currentpage();
//			clickby_javascript(proced_tocheckout);
//			
//			driver.close();
//			driver.switchTo().window(parant);
//			
//		//}
//		
//		}
//		//driver.close();
//		
//		
//		
	
		//UserAmazonIN.yoursAmazonFunction("9003204363", "praveenramasamy");
		
	/*	clickedwebelement(getrep_Data("Todaydeallink"));
		pageReload();
		
		TodaysDeal.Todaydeals_DiscountLowtoHigh();*/
		
		Move_ToElement(driver, getrep_Data("yourorderlink"));
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));
		Application.Amezanlogin("9003204363", "praveenramasamy");
		/*AmazonPay.checkAmazonpay_Balance();
		AmazonPay.viewstatement();*/
		//Sell_page.sellmadule();
		/*Customerservice.customerserviceModule();
		Customerservice.your_order();
		Customerservice.Manage_Address();*/
	/*	yourorderpage.youraccound();
		yourorderpage.Loginlable();
		yourorderpage.Paymentoption_Addcard();*/
		
	/*	yourslistspage.createwishlist_public();
		yourslistspage.wishlistYour_Friends();
		*/
		
		clickby_javascript(getrep_Data("cart"));

		cartpage.Card_count();
		web=driver.findElements(By.xpath(".//*[@id='activeCartViewForm']//div[contains(@class,'sc-subtotal')]//p//span"));
		
		System.out.println(web.size());
		
		for (int i=0;i<web.size();i++) {
			System.out.println(web.get(i).getText());
			break;
		}
		
		
	}
		
		
		
	

}
