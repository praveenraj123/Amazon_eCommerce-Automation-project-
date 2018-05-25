package Analizer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer implements IRetryAnalyzer {

// This method only failed test case only retest in 3 time 
	
	int count=0;
	int retrycount=3;
	
	public boolean retry(ITestResult result){
		if (count<retrycount) {
			count++;
			return true;
		}
		return false;
	}
}
