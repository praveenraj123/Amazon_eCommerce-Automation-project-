package browsertest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class incgreesbrowserspeed {

	ChromeDriverService service;
	WebDriver driver;
	@BeforeClass
	
	public void browserconfig() throws IOException{
		
		//service=new ChromeDriverService.Builder().usingDriverExecutable(new File("./browser_jar/chromedriver.exe"));
		
		// Setting up server
		// Setting up server
				service = new ChromeDriverService.Builder().usingDriverExecutable(new File("./browser_jar/chromedriver.exe"))
						.usingAnyFreePort().build();
				
				service.start();
		
	}
	
	@BeforeMethod
	
	public void passurl(){
		
		driver=new RemoteWebDriver(service.getUrl(),new ChromeOptions());
	}
	
	@Test
	
	public void application(){
		
		driver.get("http://www.google.com");
	}
	@Test
	public void facebbokapplication(){
		
		driver.get("http://www.facebook.com");
	}
	
	@AfterTest
	public void kill(){
		service.stop();
	}
}
