package Amezon.qa.util;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;



public class Test_Base {

	public static WebDriver driver;
	public static WebElement element;
	public static Actions action;
	public static Select select;
	public static ArrayList<WebElement> listofwebElement;
	public static boolean Boolean;
	public static Properties prop;
	public static String conficfile_Location="./TestData/config.Properties";
	public static FileInputStream fis;
	public static JavascriptExecutor js;
	public static java.util.List<WebElement> webelements;
	public static List<WebElement> web;
	public static String parant_window;
	public static String Child_win;
	public static Set<String> window;
	public static webdriverlisener webdriverlisener;
	public static EventFiringWebDriver e_driver;
	
	public static void LanchBrowser(String application_URL,String Browser_Name){


		if (Browser_Name.equalsIgnoreCase("Chrome")) {
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("disable-infobars");
			option.addArguments("--disable-notifications");


			System.setProperty("webdriver.chrome.driver", "./browser_jar/chromedriver.exe");

			driver=new ChromeDriver(option);


			System.out.println("=========== Application Lunched in Chrome_Browser============");

		}else if (Browser_Name.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko .driver", "./browser_jar/geckodriver.exe");

			driver=new FirefoxDriver();

			

			System.out.println("=========== Application Lunched in FireFox_Browser============");

		}else if (Browser_Name.equalsIgnoreCase("IE")) {




		}else {

			System.out.println("==========please provide valid Browser Name=============");
		}
		
		/*e_driver = new EventFiringWebDriver(driver);
		
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		
		webdriverlisener = new webdriverlisener();
				
		e_driver.register(webdriverlisener);
		
		driver = e_driver;*/

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		

		driver.get(application_URL);

	}


	public static WebElement Findwebelement(String locator)
	{

		try {

			element=driver.findElement(By.cssSelector(locator));

		} catch (Exception e) {
			try {

				element=driver.findElement(By.xpath(locator));
				
			} catch (Exception e2) {

				System.out.println("*****************"+e2.getMessage()+"***********");
				
				System.out.println("******-please provide valid Xpathe or cssselector-*****");
				
			}
		}

		Highlight_Element(element);

		return element;

	}
	public static void Highlight_Element(WebElement element){

		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
	
	public static List<WebElement> FindMultypleElements(String comxpath){
		try{
		
			webelements= driver.findElements(By.xpath(comxpath));
		
		}
		catch (Exception e) {
			
			System.out.println("*****************  "+e.getMessage()+"***********");
			System.out.println("******-please provide valid Xpath-*****");
		}
		
		return   webelements;
		
	}

	public static void Type_Text(String Locator,String EnterText){

		try{
			element=Findwebelement(Locator);

			element.clear();

			element.sendKeys(EnterText);

			System.out.println("========Textbox Value Entered==========");

		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void mouseclick(WebDriver driver,String ClickedElement_Locator){

		element=Findwebelement(ClickedElement_Locator);

		action=new Actions(driver);

		action.click(element).build().perform();

		System.out.println("============Element Clicked By Mouse===========");

	}

	public static void Rightclick(WebDriver driver,String Rightclik_Locator){

		element=Findwebelement(Rightclik_Locator);

		action=new Actions(driver);

		action.contextClick(element).build().perform();

		System.out.println("============Element Right Clicked By Mouse===========");	


	}

	public static void Move_ToElement(WebDriver driver,String moved_ElementLocator)
	{


		element=Findwebelement(moved_ElementLocator);

		action=new Actions(driver);

		action.moveToElement(element).build().perform();
		
		System.out.println("============ Mouse moved to Element ===========");	

	}
	public static void Move_ToElement(WebDriver driver,WebElement moved_ElementLocator){
		
		element=moved_ElementLocator;
		
		action=new Actions(driver);

		action.moveToElement(element).build().perform();
		
		Highlight_Element(moved_ElementLocator);

		System.out.println("============ Mouse moved to list of  Elements  ===========");	
		
	}
	
	public static void clickedwebelement(String clicked_Locator){

		element=Findwebelement(clicked_Locator);

		element.click();

		System.out.println("==========Element clicked click()=========");

	}

	public static void clickby_javascript(String clickLocator){

		element=Findwebelement(clickLocator);

		js =(JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();", element);

		System.out.println("==========Element clicked javascript=========");
	}

	public static void selectbytext(String selectlocator,String selected_text){

		element=Findwebelement(selectlocator);

		select=new Select(element);

		select.selectByVisibleText(selected_text);

		System.out.println("================your options is selected===========");

	}

	public static ArrayList<WebElement> getalloptions(String selec_Locator){

		element=Findwebelement(selec_Locator);

		select=new Select(element);

		listofwebElement=(ArrayList<WebElement>) select.getOptions();

		return listofwebElement;



	}

	public static ArrayList<WebElement> getAllselected_options(String selectLocator){

		element =Findwebelement(selectLocator);

		select=new Select(element);

		listofwebElement=(ArrayList<WebElement>) select.getAllSelectedOptions();

		return listofwebElement;

	}

	public static void selectbyvalue(String selectlocator,String selectvalue){

		element =Findwebelement(selectlocator);

		select=new Select(element);

		select.selectByValue(selectvalue);

		System.out.println("========option selected by value==============");

	}
	public static void selectbyindex(String selectlocator,String selectindex)
	{

		element =Findwebelement(selectlocator);

		select=new Select(element);

		select.selectByValue(selectindex);

		System.out.println("========option selected by Index==============");
	}

	public static boolean ismultiple(String selectlocator){

		element =Findwebelement(selectlocator);

		select=new Select(element);

		Boolean=select.isMultiple();


		return Boolean;


	}

	public static boolean isdisplayed(String locator_Element){

		element=Findwebelement(locator_Element);
		
		System.out.println("========Element displayed"+getTitle_currentpage()+"=============");

		return element.isDisplayed();
	}

	public static String getcurentpageURL(){

		return driver.getCurrentUrl();

	}

	public static String getrep_Data(String key){

		prop=new Properties();
		try {

			fis=new FileInputStream(conficfile_Location);
			prop.load(fis);


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("============== please set correcr config file location==========");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	public static String Takescreenshrit(String name){

		LocalDateTime s=java.time.LocalDateTime.now();
		File file=new File("./Screenshorts/pass__screenshots/"+name+".png");
		TakesScreenshot screen=((TakesScreenshot)driver);
		File f1=screen.getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(f1, file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("============= screenshot take sucessfully===============");

		return file.getAbsolutePath();


	}
	public static String Takescreenshort_Failed(String name){

		LocalDateTime s=java.time.LocalDateTime.now();
		File file=new File("./Screenshorts/failure_screenshots/"+name+".png");
		TakesScreenshot screen=((TakesScreenshot)driver);
		File f1=screen.getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(f1, file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("============= Failed testcase screenshot take  sucessfully===============");

		return file.getAbsolutePath();


	}

	
	public static boolean  veryfyElementDisplay(String elemantxpath)

	{

		System.out.println("==========="+Findwebelement(elemantxpath).getText()+"============");
		
		return Findwebelement(elemantxpath).isDisplayed();
	}

	public static String getTitle_currentpage(){
		String text=driver.getTitle();
		System.out.println("******"+text+"**********");
		return text;
	}
	
	public static void BackArrow_page(){
		
		driver.navigate().back();
		System.out.println("Go to Back page");
	}

	public static void Homepage(){
		driver.navigate().to(getrep_Data("URL"));
	}
	
	public static void pageReload(){
		driver.navigate().refresh();
	}
	
	public static void windowhandlechild(){
		
		parant_window=driver.getWindowHandle();
		
		window=driver.getWindowHandles();
		
		Iterator<String > I=window.iterator();
		
		System.out.println("Totel window count  "+window.size());
		
		
		
		while (I.hasNext()) {
			
			Child_win=I.next();
			
			if (!parant_window.equals(Child_win)) {
				
				driver.switchTo().window(Child_win);
			}
		}
		
		
	}
	
	public static void scrolldown(){
		
		js=((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		System.out.println("scroll down ");
	}
	
	public static void scrollup(){
		js=((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(0,-250)", "");
		js.executeScript("scroll(0, -250);");
		System.out.println("scroll up ");
	}
	
	public static void scrollbyElement(String xp){
		element=Findwebelement(xp);
		
		js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView();", element);
}
	public static void killBrowser(){
		driver.quit(); 
		System.out.println("****************** your  Test Goes is To End ***************");
	}
	
	

}
