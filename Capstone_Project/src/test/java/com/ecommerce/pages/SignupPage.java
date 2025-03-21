package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerce.utils.Reports;

public class SignupPage {
	 WebDriver driver;
	 ExtentTest test;
	public SignupPage(WebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
	}
	By signup= By.xpath("//a[contains(text(),' Signup / Login')]");
	By name=By.name("name");
	By email=By.xpath("//input[@data-qa='signup-email']");
	By signupButton= By.xpath("//button[contains(text(),'Signup')]");
	By contactUs=By.xpath("//a[contains(text(),'Contact us')]");
	By Title=By.id("id_gender1");
	By password= By.id("password");
	By days= By.id("days");
	By months= By.id("months");
	By years= By.id("years");
	By newsettler= By.id("newsletter");
	By specailOffer= By.id("optin");
	By firstname= By.id("first_name");
	By lastname= By.id("last_name");
	By company= By.id("company");
	By adress=By.id("address1");
	By adress2=By.id("address2");
	By country= By.id("country");
	By state=By.id("state");
	By city=By.id("city");
	By zipcode=By.id("zipcode");
	By phoneNumber=By.id("mobile_number");
	By createAccount= By.xpath("//button[contains(text(),'Create Account')]");
	By accountVisible= By.xpath("//a[contains(text(),'API Testing')]");
	By continueButton= By.xpath("//a[contains(text(),'Continue')]"); 
	By loggedInbutton= By.xpath("//a[contains(text(),'Logged in as')]");
	By deleteAcc= By.xpath("//a[contains(text(),'Delete Account')]");
	By VerifyDel= By.xpath("//b[contains(text(),'Account Deleted!')]");
	By clickContinue= By.xpath("//a[contains(text(),'Continue')]");
	By verifyLogin= By.xpath("//h2[contains(text(),'Login to your account')]");
	By loginmEmail= By.xpath("//input[@data-qa='login-email']");
	By loginPass= By.xpath("//input[@data-qa='login-password']");
	By loginclick= By.xpath("//button[contains(text(),'Login')]");
	By loggedInAs= By.xpath("//a[contains(text(),'Logged in as')]");
	By logOutButton= By.xpath("//a[contains(text(),'Logout')]");
	By home= By.xpath("//a[contains(text(),'Home')]");
	By error= By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");
	By contact = By.xpath("//a[contains(text(),'Contact us')]");
	By Getintouch= By.xpath("//h2[contains(text(),'Get In Touch')]");
	By contactname= By.xpath("//input[@data-qa='name']");
	By contactemail= By.xpath("//input[@data-qa='email']");
	By contactsub= By.xpath("//input[@data-qa='subject']");
	By contactmessage= By.id("message");
	By contactfile= By.name("upload_file");
	By contactSubmit= By.xpath("//input[@data-qa='submit-button']");
	By success= By.xpath("//div[contains(text(),'Success! Your details have been submitted successfully.')]");
	By contactHome= By.xpath("//span[contains(text(),'Home')]");
	By testcasebutton= By.xpath("//a[contains(text(),'Test Cases')]");
	By verifytest= By.xpath("//b[contains(text(),'Test Cases')]");
	By errorSignUp = By.xpath("//p[contains(text(),'Email Address already exist!')]");
	
	public void HomePage()
	{
		driver.get("https://automationexercise.com/");
	}
	public boolean VerifyHome()
	{
		boolean result;
	   String expectedTitle= "Automation Exercise";
	   String actualTitle=driver.getTitle();
	   try
	   {
		   Assert.assertEquals(actualTitle, expectedTitle);
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "Home Page is Visible.");

		   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Home Page is not Visible.");
	   }
	return result;
	}
	public void ClickSignup()
	{
		driver.findElement(signup).click();
	}
	public boolean VerifySignupPage()
	{
		String expectedUrl="https://automationexercise.com/login";
		String actualUrl=driver.getCurrentUrl();
		boolean result=true;
		 try
		   {
			   Assert.assertEquals(actualUrl, expectedUrl);
			   
			   Reports.generateReport(driver, test, Status.PASS, "SignUp Page is Visible");
			   }
		   catch(Throwable e)
		   {
			   result=false;
			   Reports.generateReport(driver, test, Status.FAIL, "SignUp Page is Not Visible.");
		   }
		return result;
		
	}
	public void EnterNameEmail(String name1,String email1)
	{
		//name1="Dipayan";
		//email1="karmakardipayan4@gmail.com";
		System.out.println(name1);
		driver.findElement(name).sendKeys(name1);
		driver.findElement(email).sendKeys(email1);
	}
	public void clickSignup()
	{
		driver.findElement(signupButton).click();
	}
   public boolean VerifyAccountPage()
   {
	   WebElement con=driver.findElement(contactUs);
	   boolean result;
	   try {
	   con.isDisplayed();
	   result=true;
	   Reports.generateReport(driver, test, Status.PASS,"ENTER ACCOUNT INFORMATION is visible.");
	  
       }
	   catch(Throwable e)
	   {
		    result=false;
		    Reports.generateReport(driver, test, Status.FAIL, "ENTER ACCOUNT INFORMATION is Not visible.");
	   }
	return result;
   }
   public void EnterDetails(String pass)
   {
	   driver.findElement(Title).click();
	   driver.findElement(password).sendKeys(pass);
	   WebElement day=driver.findElement(days);
	   Select select=new Select(day);
	   select.selectByIndex(1);
	   WebElement month=driver.findElement(months);
	   Select select1=new Select(month);
	   select1.selectByIndex(1);
	   WebElement year=driver.findElement(years);
	   Select select2=new Select(year);
	   select2.selectByIndex(21);
	}
   public void signupCheckBox()
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("scroll(0,+300)");
	   driver.findElement(newsettler).click();
   }
   public void specialOfferCheckBox()
   {
	   driver.findElement(specailOffer).click();
   }
   public void EnterAllDetails(String fname,String lname,String com,String add,String add1,String stat,String cit,String zip,String mnumber)
   {
	 driver.findElement(firstname).sendKeys(fname);
	 driver.findElement(lastname).sendKeys(lname);
	 driver.findElement(company).sendKeys(com);
	 driver.findElement(adress).sendKeys(add);
	 driver.findElement(adress2).sendKeys(add1);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("scroll(0,+400)");
	 WebElement cont=driver.findElement(country);
	 Select select=new Select(cont);
	 select.selectByVisibleText("India");
	 driver.findElement(state).sendKeys(stat);
	 driver.findElement(city).sendKeys(cit);
	 driver.findElement(zipcode).sendKeys(zip);
	 driver.findElement(phoneNumber).sendKeys(mnumber);
	 
   }
   public void clickCreateAccount()
   {
	   driver.findElement(createAccount).click();
   }
   public boolean visibleAccountpage()
   {
	   WebElement vis=driver.findElement(accountVisible);
	   boolean res=true;
	   try
	   {
		   vis.isDisplayed();
		   Reports.generateReport(driver, test, Status.PASS, "ACCOUNT CREATED! is visible.");
	   }
	   catch(Throwable e)
	   {
		   res=false;
		   Reports.generateReport(driver, test, Status.FAIL, "ACCOUNT CREATED! is NOT visible.");
		  // System.out.println("ACCOUNT CREATED! is not visible");
		   
	   }
	return res;
   }
   public void clickContinue()
   {
	 driver.findElement(continueButton).click();   
   }
   public boolean verifyAccounthomePage()
   {
	   WebElement loggedin=driver.findElement(loggedInbutton);
	   boolean result;
	   try
	   {
		   loggedin.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "Logged in as username! is visible");
		  
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Logged in as username! is NOT visible.");
		   
	   }
	return result;
   }
   public void Delete()
   {
	   driver.findElement(deleteAcc).click();
   }
   public boolean verifyDelete()
   {
	   WebElement del=driver.findElement(VerifyDel);
	   boolean result=true;
	   try
	   {
		   del.isDisplayed();
		   Reports.generateReport(driver, test, Status.PASS, "Account Successfuly Deleted");
		   driver.findElement(clickContinue).click();
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Account Successfuly Not Deleted");
		  
	   }
	return result;
	   
   }
   public boolean verifyLoginPage()
   {
	   WebElement log=driver.findElement(verifyLogin);
	   boolean result=true;
	   try
	   {
		   log.isDisplayed();
		   Reports.generateReport(driver, test, Status.PASS, "Login to your account! is Visible");
		  
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Login to your account! is not Visible");
	   }
	return result;
   }
   public void Login(String email, String password)
   {
	   driver.findElement(loginmEmail).sendKeys(email);
	   driver.findElement(loginPass).sendKeys(password);
	   
   }
   public void LOginClicked()
   {
	   driver.findElement(loginclick).click();
   }
   public boolean LoggedInAsVerify()
   {
	   WebElement logged=driver.findElement(loggedInAs);
	   boolean result;
	   try
	   {
		   logged.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "Logged in as Username is visible");
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Logged in as Username is NOT visible");
	   }
	return result;
   }
   public void LogOut()
   {
	   driver.findElement(logOutButton).click();
   }
   public boolean verifyLogout()
   {
	   WebElement hom=driver.findElement(home);
	   boolean result;
	   try
	   {
		   result=true;
		   hom.isDisplayed();
		   Reports.generateReport(driver, test, Status.PASS, "User is navigated to the LOGIN PAGE");
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "User is not navigated to the LOGIN PAGE");
	   }
	return result;
	   
      }
       public void InvalidLogin(String invalidmail,String invalidpass)
       {
    	   driver.findElement(loginmEmail).sendKeys(invalidmail);
    	   driver.findElement(loginPass).sendKeys(invalidpass);
    	   
       }
       public boolean VerifyInvalidLogin()
       {
    	   WebElement er=driver.findElement(error);
    	   boolean result;
    	   try
    	   {
    		   er.isDisplayed();
    		   result=true;
    		   Reports.generateReport(driver, test, Status.PASS, "Your email or password is incorrect");
    	   }
    	   catch(Throwable e)
    	   {
    		   result=false;
    		   Reports.generateReport(driver, test, Status.FAIL, "Your email or password is correct");
    	   }
		return result;
       }
       public void InvalidSignup(String uname,String mail)
       {
    	   driver.findElement(name).sendKeys(uname);
   		   driver.findElement(email).sendKeys(mail);
       }
       public boolean VerifyInvalidSignUp()
       {
    	   WebElement invalidsign= driver.findElement(errorSignUp);
    	   boolean result;
    	   try
    	   {
    		   invalidsign.isDisplayed();
    		   result=true;
    		   Reports.generateReport(driver, test, Status.PASS, "Email existing! already");
    	   }
    	   catch(Throwable e)
    	   {
    		   result=false;
    		   Reports.generateReport(driver, test, Status.FAIL, "Welcome To new Signup! ");
    	   }
		return result;
    	   
       }
       public void Contactus()
       {
    	   driver.findElement(contact).click();
       }
       public boolean VerifyContactUs()
       {
    	   WebElement getin=driver.findElement(Getintouch);
    	   boolean result=true;
    	   try
    	   {
    		   getin.isDisplayed();
    		   Reports.generateReport(driver, test, Status.PASS, "GET IN TOUCH! is visible.");
    	   }
    	   catch(Throwable e)
    	   {
    		   result=false;
    		   Reports.generateReport(driver, test, Status.FAIL, "GET IN TOUCH! is not visible.");
    	   }
		return result;
       }
       public void EnterContactUsDetails(String uname,String email, String sub, String msg)
       {
    	   driver.findElement(contactname).sendKeys(uname);
    	   driver.findElement(contactemail).sendKeys(email);
    	   driver.findElement(contactsub).sendKeys(sub);
    	   driver.findElement(contactmessage).sendKeys(msg);
    	   
       }
       public void UploadFile()
       {
    	   JavascriptExecutor js=(JavascriptExecutor)driver;
    	   js.executeScript("scroll(0,+400)");
    	   driver.findElement(contactfile).sendKeys("C:\\Users\\capstone.jpg");
    	   
       }
       public void ContactSubmitbutton()
       {
    	driver.findElement(contactSubmit).click();   
       }
       public void ContactOK ()
       {
    	   driver.switchTo().alert().accept();
       }
       public boolean VerifySuccess()
       {
    	   WebElement s=driver.findElement(success);
    	   boolean result;
    	   try
    	   {
    		   s.isDisplayed();
    		   result=true;
    		   Reports.generateReport(driver, test, Status.PASS, "Success! Your details have been submitted successfuly is visible .");
    	   }
    	   catch(Throwable e)
    	   {
    		   result=false;
    		   Reports.generateReport(driver, test, Status.FAIL, "Success! Your details have been submitted successfuly is visible .");
    	   }
		return result;
       }
       public void ClickedContactHome()
       {
    	   driver.findElement(contactHome).click();
       }
       public boolean VerifyClickedHome()
       {
    	   WebElement homes=driver.findElement(home);
    	   boolean result=true;
    	   try
    	   {
    		   homes.isDisplayed();
    		   Reports.generateReport(driver, test, Status.PASS, "Landed to HomePage successfuly.");
    	   }
    	   catch(Throwable e)
    	   {
    		   result=false;
    		   Reports.generateReport(driver, test, Status.FAIL, "Did not Land to HomePage.");
    	   }
		return result;
       }
       public void Testcases()
       {
    	   driver.findElement(testcasebutton).click();
       }
       public boolean VerifyTestCases()
       {
    	   WebElement testc= driver.findElement(verifytest);
    	   boolean result;
    	   try {
    		   testc.isDisplayed();
    		   result=true;
    		  Reports.generateReport(driver, test, Status.PASS, "User is  navigated to Test Cases page.");
    		   
    	   }
    	   catch(Throwable e)
    	   {
    		   result=false;
    		   Reports.generateReport(driver, test, Status.FAIL, "User is not navigated to Test Cases page.");
    	   }
		return result;
       }
}