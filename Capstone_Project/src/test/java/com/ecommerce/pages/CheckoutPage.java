package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerce.utils.Reports;

public class CheckoutPage {

	WebDriver driver;
	 ExtentTest test;
	 
 public CheckoutPage(WebDriver driver,ExtentTest test)
 {
	  this.driver=driver;
     this.test=test;
 }	
 
        By proceedCheckout= By.xpath("//a[contains(text(),'Proceed To Checkout')]");
        By RegLogcheckout= By.xpath("//u[contains(text(),'Register / Login')]");
        By cart= By.xpath("//a[contains(text(),'Cart')]");
        By addressDetail= By.xpath("//h2[contains(text(),'Address Details')]");
        By checkDesc= By.xpath("//textarea[@class='form-control']");
        By checkPlaceorder= By.xpath("//a[contains(text(),'Place Order')]");
        By checkcardname= By.xpath("//input[@data-qa='name-on-card']");
        By checkcardnum= By.xpath("//input[@data-qa='card-number']");
        By checkCvc= By.xpath("//input[@data-qa='cvc']");
        By checkExp= By.xpath("//input[@data-qa='expiry-month']");
        By checkYear= By.xpath("//input[@data-qa='expiry-year']");
        By checkpalceconfirm= By.id("submit");
        By ordersuccess= By.xpath("//b[contains(text(),'Order Placed!')]");
        By review= By.xpath("//a[contains(text(),'Write Your Review')]");
        By reviewName= By.id("name");
        By reviewAddress= By.id("email");
        By reviewDesc= By.id("review");
        By reviewsubmit= By.id("button-review");
        By downInvoice= By.xpath("//a[contains(text(),'Download Invoice')]");
        By arrowicon= By.xpath("//i[@class='fa fa-angle-up']");
        By VerifyScroll= By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");
        
        public void clickProceedCheckout()
        {
        	driver.findElement(proceedCheckout).click();
        }
        public void clickRegLoginCheckout()
        {
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        	driver.findElement(RegLogcheckout).click();
        }
        public void clickCartHome()
        {
         	driver.findElement(cart).click();
        }
        public void clickProceedCheckoutAgain()
        {
        	driver.findElement(proceedCheckout).click();
        }
        public boolean VerifyAddressDetails()
        {
        	WebElement adress=driver.findElement(addressDetail);
        	boolean result;
        	try
        	{
        		adress.isDisplayed();
        		result=true;
        		 Reports.generateReport(driver, test, Status.PASS, "Address Details are visible.");
        	}
        	catch(Throwable e)
        	{
        		result=false;
        		 Reports.generateReport(driver, test, Status.FAIL, "Address Details are not visible.");
        	}
			return result;
        }
      public void EnterDescription(String desc)
      {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
   	      js.executeScript("scroll(0,+800)");
    	  driver.findElement(checkDesc).sendKeys(desc);
    	  driver.findElement(checkPlaceorder).click();
    	  
      }
      public void EnterCardDetails(String Cname,String Cnumber,String cvc,String expiry,String year)
      {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
   	      js.executeScript("scroll(0,+500)");
   	      driver.findElement(checkcardname).sendKeys(Cname);
   	      driver.findElement(checkcardnum).sendKeys(Cnumber);
   	      driver.findElement(checkCvc).sendKeys(cvc);
   	      driver.findElement(checkExp).sendKeys(expiry);
   	      driver.findElement(checkYear).sendKeys(year);
   	      
      }
      public void clickPayConfirmOrder()
      {
    	driver.findElement(checkpalceconfirm).click();  
      }
      public boolean VerifyconfirmOrder()
      {
    	WebElement ord=driver.findElement(ordersuccess);
    	boolean result;
    	try
    	{
    		ord.isDisplayed();
    		result=true;
    		 Reports.generateReport(driver, test, Status.PASS, "Order Placed Successfully!");
    		
    	}
    	catch(Throwable e)
    	{
    		result=false;
    		 Reports.generateReport(driver, test, Status.FAIL, "Order is not Placed Successfully!");
    	}
		return result;
      }
      public boolean verifyReviewpage()
      {
    	WebElement rev=driver.findElement(review);
    	boolean result;
    	try
    	{
    		rev.isDisplayed();
    		result=true;
    		Reports.generateReport(driver, test, Status.PASS, "Write Your Review Is visible");
    	}
    	catch(Throwable e)
    	{
    		result=false;
    		Reports.generateReport(driver, test, Status.FAIL, "Write Your Review Is visible");
    		
    	}
		return result;
      }
      public void enterReviewDetails(String rname,String radd, String r)
      {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
   	      js.executeScript("scroll(0,+800)");
    	  driver.findElement(reviewName).sendKeys(rname);
    	  driver.findElement(reviewAddress).sendKeys(radd);
    	  driver.findElement(reviewDesc).sendKeys(r);
      }
      public void clickReviw()
      {
    	  driver.findElement(reviewsubmit).click();
      }
      public boolean VerifyreviewSubmit()
      {
    	  WebElement sub=driver.findElement(reviewsubmit);
    	  boolean result;
    	  try
    	  {
    		  sub.isEnabled();
    		  result=true;
    		  Reports.generateReport(driver, test, Status.PASS, "Review submitted successfully.");
    	  }
    	  catch(Throwable e)
    	  {
    		  result=false;
    		  Reports.generateReport(driver, test, Status.FAIL, "Review is not submitted successfully.");
    	  }
		return result;
      }
      public void clickInvoice()
      {
    	  driver.findElement(downInvoice).click();
      }
      public boolean VerifyInvoice()
      {
    	  boolean result;
    	  try
    	  {
    		  result =true;
    		  Reports.generateReport(driver, test, Status.PASS, "Invoice Downloaded");
    	  }
    	  catch(Throwable e)
    	  {
    		  result=false;
    		  Reports.generateReport(driver, test, Status.FAIL, "Invoice not Downloaded");
    	  }
		return result;
      }
      public void arrow()
      {
    	  driver.findElement(arrowicon);
      }
      public void ScrollUpDown()
      {
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
   	      js.executeScript("scroll(0,+1000)");
   	      JavascriptExecutor js1=(JavascriptExecutor)driver;
	      js1.executeScript("scroll(0,-800)");
      }
      public boolean verifyAfterScrollUp()
      {
    	  boolean result;
    	  WebElement vs=driver.findElement(VerifyScroll);
    	  try
    	  {
    		  vs.isDisplayed();
    		  result=true;
    		  Reports.generateReport(driver, test, Status.PASS, "Full-Fledged practice website for Automation Engineers text is visible on screen");
    	  }
    	  catch(Throwable e)
    	  {
    		  result=false;
    		  Reports.generateReport(driver, test, Status.FAIL, "Full-Fledged practice website for Automation Engineers text is   not visible on screen");
    	  }
		return result;
      }
 }

