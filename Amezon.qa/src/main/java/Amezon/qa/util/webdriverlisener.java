package Amezon.qa.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class webdriverlisener extends Test_Base implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test is Start:" + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test is Success:" + result.getName());
		if (result.isSuccess()) {
			
			Calendar cal= Calendar.getInstance();
			
			SimpleDateFormat formet=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			String methodname=result.getName();
			
			String path=	Takescreenshrit(methodname+"_" + formet.format(cal.getTime()));
			

			Reporter.log("<a href='" + path + "'> <img src='" + path + "' height='100' width='100'/> </a>");
			
		}
		
	}

	public void onTestFailure(ITestResult result) {
		
		if (!result.isSuccess()) {
			
			Calendar cal= Calendar.getInstance();
			
			SimpleDateFormat formet=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			String methodname=result.getName();
			
			String path=	Takescreenshort_Failed(methodname+"_" + formet.format(cal.getTime()));
			

			Reporter.log("<a href='" + path + "'> <img src='" + path + "' height='100' width='100'/> </a>");
			
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test is Skipped:" + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
	
		Reporter.log("Test is Start:" + context.getName());
		
	}

	public void onFinish(ITestContext context) {
		
		Reporter.log("Test is Finish:" + context.getName());
		
	}
	
	

	

}
