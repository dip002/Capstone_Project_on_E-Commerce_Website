package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerce.utils.Reports;

public class ProductPage {
	WebDriver driver;
	 ExtentTest test;
	 
  public ProductPage(WebDriver driver,ExtentTest test)
  {
	  this.driver=driver;
      this.test=test;
  }
  By productbutton= By.xpath("//a[contains(text(),'Products')]");
  By allprod= By.xpath("//h2[contains(text(),'All Products')]");
  By viewproduct= By.xpath("//a[@href='/product_details/1']");
  By viewproductsec= By.xpath("//a[@href='/product_details/5']");
  By detailAvail= By.xpath("//b[contains(text(),'Availability:')]");
  By detailcond= By.xpath("//b[contains(text(),'Condition:')]");
  By detailBrand= By.xpath("//b[contains(text(),'Brand:')]");
  By search= By.id("search_product");
  By subutton= By.id("submit_search");
  By searchprod= By.xpath("//h2[contains(text(),'Searched Products')]");
  By hoverfirst= By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]");
  By addtofirst= By.xpath("//button[@class='btn btn-default cart']");
  By continueShopping= By.xpath("//button[@class='btn btn-success close-modal btn-block']");
  By viewCart= By.xpath("//u[contains(text(),'View Cart')]");
  By cartTable= By.id("cart_info");
  By incQuant= By.id("quantity");
  By cross= By.xpath("//i[@class='fa fa-times']");
  By emptyCart= By.xpath("//b[contains(text(),'Cart is empty!')]");
  By catevis= By.xpath("//h2[contains(text(),'Category')]");
  By women= By.xpath("//a[@href='#Women']");
  By dresswo= By.xpath("//a[@href='/category_products/1']");
  By catwom= By.xpath("//h2[contains(text(),'Women - Dress Products')]");
  By men= By.xpath("//a[@href='#Men']");
  By catmen= By.xpath("//a[contains(text(),'Tshirts')]");
  By categorymen= By.xpath("//h2[contains(text(),'Men - Tshirts Products')]");
  By brands= By.xpath("//h2[contains(text(),'Brands')]");
  By brandpolo= By.xpath("//a[@href='/brand_products/Polo']");
  By brandpg1= By.xpath("//h2[contains(text(),'Brand - Polo Products')]");
  By brandHM= By.xpath("//a[@href='/brand_products/H&M']");
  By brandpg2= By.xpath("//h2[contains(text(),'Brand - H&M Products')]");
  
   public void clickProduct()
   {
	   driver.findElement(productbutton).click();
   }
   public boolean VerifyAllProduct()
   {
	   WebElement all=driver.findElement(allprod);
	   boolean result;
	   try
	   {
		   all.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "Navigated to ALL PRODUCTS! page");
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Did not Navigate to ALL PRODUCTS! page");
	   }
	return result;
   }
   public void ClickViewProduct()
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("scroll(0,+500)");
	   driver.findElement(viewproduct).click();
   }
   public boolean VerifyProductDetails()
   {
	   WebElement avail=driver.findElement(detailAvail);
	   WebElement cond=driver.findElement(detailcond);
	   WebElement brand=driver.findElement(detailBrand);
	   boolean result;
	   try
	   {
		   avail.isDisplayed();
		   cond.isDisplayed();
		   brand.isDisplayed();
		   result =true;
		   Reports.generateReport(driver, test, Status.PASS, "Product Details Are Visible");
		  
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Product Details Are Not Visible");
	   }
	return result;
   }
   public void SearchProductandClick(String searchProduct)
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("scroll(0,+300)");
	   driver.findElement(search).sendKeys(searchProduct);
	   driver.findElement(subutton).click();
	   
   }
   public boolean VerifySearchedProduct()
   {
	   WebElement srch=driver.findElement(searchprod);
	   boolean result;
	   try
	   {
		   srch.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "SEARCHED PRODUCT is visible");
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "SEARCHED PRODUCT is not visible");
	   }
	return result;
   }
   public void HoverAddFirst()
   {

	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("scroll(0,+600)");
	   driver.findElement(viewproduct).click();
	   driver.findElement(addtofirst).click();
	   
	  
   }
   public void ContinueShopping()
   {
	  
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	   driver.findElement(continueShopping).click();
	   driver.navigate().back();
   }
   public void HoverAddSecond()
   {
	   driver.findElement(viewproductsec).click();
	   driver.findElement(addtofirst).click();
   }
   public void ClickonViewCart()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	   driver.findElement(viewCart).click();
   }
   public boolean VerifyBothProductsAdded()
   {
	   WebElement carttab=driver.findElement(cartTable);
	   boolean result;
	   try
	   {
		   carttab.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "BOTH PRODUCTS are added To the Cart");
		   
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "BOTH PRODUCTS are not added To the Cart");
	   }
	return result;
   }
   public void increaseQuantity()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	   driver.findElement(incQuant).clear();
	   driver.findElement(incQuant).sendKeys("4");
	}
   public void AddToCart()
   {
	   driver.findElement(addtofirst).click();
   }
   public boolean VerifyProdAddtoCart()
   {
	   WebElement carttab=driver.findElement(cartTable);
	   boolean result;
	   try
	   {
		   carttab.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, " PRODUCT is added To the Cart");
		   
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "PRODUCT is not added To the Cart");
	   }
	return result;
   }
   public void ClickXButton()
   {
	   driver.findElement(cross).click();
   }
   public boolean verifyProductremove()
   {
	   WebElement emp=driver.findElement(emptyCart);
	   boolean result;
	   try
	   {
		   emp.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "Cart is Empty");
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Cart is not Empty");  
	   }
	return result;
   }
   public boolean VerifyCategoryHome()
   {
	   WebElement cat=driver.findElement(catevis);
	   boolean result;
	   try
	   {
		   cat.isDisplayed();
		   result=true;
		   Reports.generateReport(driver, test, Status.PASS, "Categories are visible.");
	   }
	   catch(Throwable e)
	   {
		   result=false;
		   Reports.generateReport(driver, test, Status.FAIL, "Categories are Not visible.");
	   }
	return result;
   }
   public void clickWomen()
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("scroll(0,+400)");
	   driver.findElement(women).click();
   }
     public void clickDresWomen()
     {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    	 driver.findElement(dresswo).click();
     }
     public boolean VerifyCategoryWomen()
     {
    	 WebElement cwom=driver.findElement(catwom);
    	 boolean result;
    	 try
    	 {
    		 cwom.isDisplayed();
    		 result=true;
    		 Reports.generateReport(driver, test, Status.PASS, " WOMEN- DRESS PRODUCTS is displayed");
    		 
    	 }
    	 catch(Throwable e)
    	 {
    		 result=false;
    		 Reports.generateReport(driver, test, Status.FAIL, " WOMEN- DRESS PRODUCTS is NOT displayed");
    	 }
		return result;
     }
     public void clickMen()
     {
    	 driver.findElement(men).click();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    	 driver.findElement(catmen).click();
     }
     public boolean verifyCategoryMen()
     {
    	 WebElement men=driver.findElement(categorymen);
    	 boolean result;
    	 try
    	 {
    		 men.isDisplayed();
    		 result=true;
    		 Reports.generateReport(driver, test, Status.PASS, " MEN- DRESS PRODUCTS is displayed");
    	 }
    	 catch(Throwable e)
    	 {
    		 result=false;
    		 Reports.generateReport(driver, test, Status.FAIL, " MEN- DRESS PRODUCTS is NOT displayed");
    	 }
		return result;
     }
     public boolean VerifyBrands()
     {
    	 WebElement br=driver.findElement(brands);
    	 boolean result;
    	 try
    	 {
    		 br.isDisplayed();
    		 result=true;
    		 Reports.generateReport(driver, test, Status.PASS, "Brands are visible on leftside bar"); 
    	 }
    	 catch(Throwable e)
    	 {
    		 result=false;
    		 Reports.generateReport(driver, test, Status.FAIL, "Brands are not visible on leftside bar");
    	 }
		return result;
     }
     public void clickBrandName()
     {

  	   JavascriptExecutor js=(JavascriptExecutor)driver;
  	   js.executeScript("scroll(0,+800)");
  	   driver.findElement(brandpolo).click();
     }
     public boolean verifyBrandPage()
     {
    	 WebElement bpg= driver.findElement(brandpg1);
    	 boolean result=true;
    	 try
    	 {
    		 bpg.isDisplayed();
    		 Reports.generateReport(driver, test, Status.PASS, "BRAND - SELECTED PRODUCT is diplayed");
    	 }
    	 catch(Throwable e)
    	 {
    		 Reports.generateReport(driver, test, Status.FAIL, "BRAND - SELECTED PRODUCT is not diplayed");
    	 }
		return result;
     }
     public void clickOtherBrand()
     {
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeScript("scroll(0,+800)");
    	 driver.findElement(brandHM).click();
     }
     public boolean verfiyAgainBrandPage()
     {
    	 WebElement bpg2=driver.findElement(brandpg2);
    	 boolean result;
    	 try
    	 {
    		 bpg2.isDisplayed();
    		 result=true;
    		 Reports.generateReport(driver, test, Status.PASS, "PARTICULAR BRAND-SELECTED PRODUCT is diplayed");
    	 }
    	 catch(Throwable e)
    	 {
    		 result=false;
    		 Reports.generateReport(driver, test, Status.FAIL, "PARTICULAR BRAND-SELECTED PRODUCT is not diplayed");
    	 }
		return result;
     }
}
