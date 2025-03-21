package com.ecommerce.stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.utils.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCheckoutStepDef extends Base {
	WebDriver driver=Base.driver;
	ExtentTest test=Hooks.test;
	CheckoutPage checkoutPage;
	ProductPage productPage;
	
	
	@And("I click proceed to checkout.")
	public void i_click_proceed_to_checkout() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickProceedCheckout();
	}
	@And("I click on Register\\/Login button on pop up.")
	public void i_click_on_register_login_button_on_pop_up() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickRegLoginCheckout();
	}
	@And("I clicked on cart.")
	public void i_clicked_on_cart() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickCartHome();
	}
	@And("I click proceed to checkout again.")
	public void i_click_proceed_to_checkout_again() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickProceedCheckoutAgain();
	}
	@And("I verify AddressDetails and review my order.")
	public void i_verify_address_details_and_review_my_order() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean actResult=checkoutPage.VerifyAddressDetails();
		Assert.assertTrue(actResult);
	}
	@When("I enter description in {string} and click on Place order.")
	public void i_enter_description_in_and_click_on_place_order(String Comment_text_area) {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.EnterDescription(Comment_text_area);
		System.out.println("Description is entered");
	}
	@When("I am entering {string},{string},{string},{string},{string}")
	public void i_am_entering(String Name_on_card, String Card_NUmber, String CVC, String Expiration_Date, String Expiration_Year) {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.EnterCardDetails(Name_on_card, Card_NUmber, CVC, Expiration_Date, Expiration_Year);
		System.out.println("Details Entered");
	}
	@And("I click on Pay and Confirm order button.")
	public void i_click_on_pay_and_confirm_order_button() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickPayConfirmOrder();
	}
	@And("I verify Success message Congratulations! Your order has been confirmed.")
	public void i_verify_success_message_congratulations_your_order_has_been_confirmed() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean actresult=checkoutPage.VerifyconfirmOrder();
		Assert.assertTrue(actresult);
	}
	@And("I verify product is added to cart ot not.")
	public void i_verify_product_is_added_to_cart_ot_not() {
		productPage=new ProductPage(driver,test);
		boolean actRes=productPage.VerifyProdAddtoCart();
		Assert.assertTrue(actRes);
		
		
	}
	@Then("I verify message Congratulations! Your order has been confirmed.")
	public void i_verify_message_congratulations_your_order_has_been_confirmed() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean actresult1=checkoutPage.VerifyconfirmOrder();
		Assert.assertTrue(actresult1);
	}
	@And("I verify Write Your Review is visible or not.")
	public void i_verify_write_your_review_is_visible_or_not() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean actRes=checkoutPage.verifyReviewpage();
		Assert.assertTrue(actRes);
	}
	@When("I Enter {string}, {string}, and {string} on Your review section.")
	public void i_enter_and_on_your_review_section(String Name, String EmailAdress, String review) {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.enterReviewDetails(Name, EmailAdress, review);
	}
	@And("I click submit button on review section")
	public void i_click_submit_button_on_review_section() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickReviw();
	}
	@Then("I verify Thank You for your review message.")
	public void i_verify_thank_you_for_your_review_message() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean Actual=checkoutPage.VerifyreviewSubmit();
		Assert.assertTrue(Actual);
	}
	@And("I clicked on download invoice")
	public void i_clicked_on_download_invoice() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.clickInvoice();
	}
	@And("I verify Invoice is downloaded successfully.")
	public void i_verify_invoice_is_downloaded_successfully() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean resInv=checkoutPage.VerifyInvoice();
		Assert.assertTrue(resInv);
		
	}
	@And("I click on Arrow button.")
	public void i_click_on_arrow_button() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.arrow();
	}
	@And("I scroll Down and Up without arrow button.")
	public void i_scroll_down_and_up_without_arrow_button() {
		checkoutPage=new CheckoutPage(driver,test);
		checkoutPage.ScrollUpDown();
	}
	@Then("I verify Full-Fledged practice website for Automation Engineers text is visible on screen.")
	public void i_verify_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
		checkoutPage=new CheckoutPage(driver,test);
		boolean res=checkoutPage.verifyAfterScrollUp();
		Assert.assertTrue(res);
	}
}
