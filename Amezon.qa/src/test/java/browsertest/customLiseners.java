/*package browsertest;

import Amezon.qa.util.Test_Base;

public class customLiseners extends Test_Base implements itest {
	






		public void onFinish(ITestContext arg0) {
			Reporter.log("Test is finished:" + arg0.getName());

		}

		public void onStart(ITestContext arg0) {
			Reporter.log("Test is started:" + arg0.getName());

		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub

		}

		public void onTestFailure(ITestResult arg0) {

			if (!arg0.isSuccess()) {
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

				String methodName = arg0.getName();

				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				try {
					String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/test/java/";
					File destFile = new File(reportDirectory + "/failure_screenshots/" + methodName + "_" + formater.format(calendar.getTime()) + ".png");

					FileUtils.copyFile(scrFile, destFile);

					Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub

		}

		public void onTestStart(ITestResult arg0) {
			Reporter.log(ITestResult.class.getSimpleName() + " Test started");

		}

		public void onTestSuccess(ITestResult arg0) {
			if (arg0.isSuccess()) {
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

				String methodName = arg0.getName();

				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				try {
					String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/test/java/";
					File destFile = new File(reportDirectory + "/Test_sucess/" + methodName + "_" + formater.format(calendar.getTime()) + ".png");

					FileUtils.copyFile(scrFile, destFile);

					Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

				} catch (IOException e) {
					e.printStackTrace();
				}
			}


		}

	}


*/