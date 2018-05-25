package browsertest;

import org.testng.Assert;

import Amezon.qa.Amezon_application.Application;
import Amezon.qa.Amezon_application.yourorderpage;

public class tes extends yourorderpage {
		
		public static void main(String[] args) {
			
			LanchBrowser(getrep_Data("URL"), getrep_Data("Browser"));

			//Assert.assertEquals(driver.getTitle(), getrep_Data("Homepage_title"));
					
				Move_ToElement(driver, getrep_Data("yourorderlink"));
				clickedwebelement(getrep_Data("yourtorder_signinbutton"));
				Application.Amezanlogin("9003204363", "praveenramasamy");
				youraccound();

		}

}
