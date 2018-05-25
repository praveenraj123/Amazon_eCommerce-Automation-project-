package Amezon.qa.Amezon_application;

public class TodaysDeal extends Application {
	
	
	public static void Todaydeals(){
		
		clickedwebelement(getrep_Data("Todaydeallink"));
		
		//selectbytext("//select[contains(@id,'dropdown-30443763139133995')]", "Best Selling");
		
		clickedwebelement(getrep_Data("Todaydeallink"));
		pageReload();
		selectbytext("//select[@name='sortOptions']", "Best Selling");
		scrolldown();
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		scrollup();
		
		
		
	}
	
	public static void Todaydeals_PriceLowToHigh(){
		
		//selectbytext("//select[contains(@id,'dropdown-30443763139133995')]", "Price - Low to High");
		
		selectbytext("//select[@name='sortOptions']", "Price - Low to High");
		scrolldown();
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		scrollup();
		
	}
	
	public static void Todaydeals_DiscountLowtoHigh(){
		
		
		
		
		selectbytext("//select[@name='sortOptions']", "Discount - Low to High");
		//scrolldown();
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		//scrollup();
		
	}
		
	
}
