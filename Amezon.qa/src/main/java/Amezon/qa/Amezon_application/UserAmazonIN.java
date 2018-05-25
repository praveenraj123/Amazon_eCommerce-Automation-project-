package Amezon.qa.Amezon_application;

public class UserAmazonIN extends Application {
	
	public static void yoursAmazonFunction(String userrname,String password ){
		
		clickby_javascript(getrep_Data("yourAmezonlink"));
		
		getTitle_currentpage();
		
		Amezanlogin(userrname, password);
		
		getTitle_currentpage();
		
		veryfyElementDisplay("//div[contains(@class,'customer-name')]");
		
		
		
		clickby_javascript("(//div[contains(text(),'Electronics')])[1]");
		
		//pageReload();
		
		clickby_javascript(".//*[@id='recs-ysh-card-container']//a[contains(text(),'View All')]");
		
		
		pageReload();
		
		clickby_javascript(".//*[@id='g-B078ZFGCQL']/div[1]/a//div[@class='title-container']");
		
		windowhandlechild();
		
		mouseclick(driver, ".//*[@id='add-to-cart-button']");// click addcar button
		
		clickby_javascript(".//*[@id='huc-v2-subcart-buttons-wrapper']//a[@id='hlb-view-cart-announce']");
		
		getTitle_currentpage();
		
		clickby_javascript(".//*[@id='sc-buy-box-ptc-button']/span/input");
		
		getTitle_currentpage();
		
		driver.close();
		
		driver.switchTo().window(parant_window);
		
		
	}
	

}
