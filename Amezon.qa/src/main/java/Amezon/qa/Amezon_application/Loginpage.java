package Amezon.qa.Amezon_application;

public class Loginpage extends Application {
	
	public static String mobi="9003204363";
	public static String mail="mr.praveenraj13@gmail.com";
	
	public static void verifyLoginPageLogo(){
		
		Boolean=veryfyElementDisplay(getrep_Data("Loginlogo"));
		
		System.out.println("=======logo verifyed=======");
		
		//clickedwebelement(getrep_Data("Loginlogo"));
		
	}
	
	public static void Needhelplink(){
		
			veryfyElementDisplay(getrep_Data("needhelplink"));
			
			System.out.println("=======Need help verifyed=======");
			
			clickedwebelement(getrep_Data("needhelplink"));
			
			veryfyElementDisplay(getrep_Data("forgetpassword"));
			
			System.out.println("=======forgetpassword verifyed=======");
			
			veryfyElementDisplay(getrep_Data("otherissue"));
			
			System.out.println("=======otherissue help verifyed=======");
	}
	
	
	public static void Forgetpassword(){
		
		//clickedwebelement(getrep_Data("needhelplink"));
		
		clickedwebelement(getrep_Data("forgetpassword"));
		
		Type_Text(getrep_Data("loininput_loca"), getrep_Data("mobilenumber"));
		
		clickby_javascript(getrep_Data("lonin_contiuebutton"));
		
		clickedwebelement(getrep_Data("setNewpasswordradio"));
		
		clickby_javascript(getrep_Data("lonin_contiuebutton"));
		
		Type_Text(getrep_Data("Entercode"), "123456");
		
		
		clickby_javascript(getrep_Data("lonin_contiuebutton"));
		
		System.out.println("================="+getTitle_currentpage()+"============");
		
		BackArrow_page();
				
		
		clickedwebelement(getrep_Data("signINtempcoderadio"));
		
		Type_Text(getrep_Data("Entercode"), "123456");
		//clickby_javascript(getrep_Data("lonin_contiuebutton"));
		
		System.out.println("================="+getTitle_currentpage()+"============");
		
		
	}
	
	public static void  Otherissues_with_signin(){
		
		clickedwebelement(getrep_Data("needhelplink"));
		
		clickedwebelement(getrep_Data("otherissueLink"));	
		
		System.out.println("==============="+getTitle_currentpage()+"=============");
		
		selectbytext(getrep_Data("Select_an_issue"), "I cannot create an account");
		
		clickby_javascript(getrep_Data("Send_us_mail"));
		
		Type_Text(".//*[@id='unauthCustomerEmail']", "tamizha3@yahoo.com");
		
		Type_Text(".//*[@id='unauthCustomerName']", "praveen");
		
		Type_Text(".//*[@id='additionalEmailDetails']", "cool");
		
		clickby_javascript(".//*[@id='sendEmailButtonInput']");
				
		System.out.println("==============="+getTitle_currentpage()+"=============");
		
		//clickedwebelement(getrep_Data("Loginlogo"));
		
		
	}
	
	public static void createAccount(String user,String pwd,String mobile,String mailID){
		
/*		Move_ToElement(driver, getrep_Data("yourorderlink"));
		
		clickedwebelement(getrep_Data("yourtorder_signinbutton"));*/
		
		driver.navigate().refresh();
		
		System.out.println("page Got Refresh");
		
		clickby_javascript(getrep_Data("createAccount"));
		
		getTitle_currentpage();
		
		Type_Text(getrep_Data("create_username"), user);
		
		Type_Text(getrep_Data("create_mobile"), mobile);
		
		Type_Text(getrep_Data("create_mail"), mailID);
		
		Type_Text(getrep_Data("create_pwd"), pwd);
		
		clickby_javascript(getrep_Data("create_continue"));
		
		
		//Homepage();
		
	}

}
