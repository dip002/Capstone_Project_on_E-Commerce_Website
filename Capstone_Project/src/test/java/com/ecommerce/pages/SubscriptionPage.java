package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerce.utils.Reports;

public class SubscriptionPage {
	 WebDriver driver;
	 ExtentTest test;
	 public SubscriptionPage(WebDriver driver,ExtentTest test)
		{
			this.driver=driver;
			this.test=test;
		}
	 By subscribe= By.xpath("//h2[contains(text(),'Subscription')]");
	 By subEmail= By.id("susbscribe_email");
	 By arrow= By.id("subscribe");
	 By successMessage= By.xpath("//div[contains(text(),'You have been successfully subscribed!')]");
	 By cart= By.xpath("//a[contains(text(),'Cart')]");
	 public void Scrollfooter()
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
  	      js.executeScript("scroll(0,+900)");
	 }
	 public boolean VerifySubscription()
	 {
		 WebElement sub=driver.findElement(subscribe);
		 boolean result;
		 try
		 {
			 sub.isDisplayed();
			 result=true;
			 Reports.generateReport(driver, test, Status.PASS, "SUBSCRIPTION text is Visible.");
			 
		 }
		 catch(Throwable e)
		 {
			 result=false;
			 Reports.generateReport(driver, test, Status.FAIL, "SUBSCRIPTION text is not Visible.");
		 }
		return result;
	 }
	 public void EnterEmailAddress(String email)
	 {
		driver.findElement(subEmail).sendKeys(email); 
		driver.findElement(arrow).click();
	 }
	 public boolean VerifySuccess()
	 {
		 WebElement s=driver.findElement(successMessage);
		 boolean result=true;
		 try
		 {
			 s.isDisplayed();
			 Reports.generateReport(driver, test, Status.PASS, "You have been successfully subscribed! is visible");
			 
		 }
		 catch(Throwable e)
		 {
			 result=false;
			 Reports.generateReport(driver, test, Status.FAIL, "You have been successfully subscribed! is not visible");
		 }
		return result;
	 }
	 public void Cartclicked()
	 {
		 driver.findElement(cart).click();
	 }

}
