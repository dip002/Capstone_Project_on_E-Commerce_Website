package com.ecommerce.stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.pages.SignupPage;
import com.ecommerce.pages.SubscriptionPage;
import com.ecommerce.utils.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSignupLoginStepDef extends Base {
	WebDriver driver=Base.driver;
	ExtentTest test=Hooks.test;
	SignupPage signupPage;
	SubscriptionPage subscriptionPage;
	ProductPage productPage;
	
	@Given("I Navigate to the Home Page.")
	public void i_navigate_to_the_home_page() {
		signupPage=new SignupPage(driver,test);
		signupPage.HomePage();
		System.out.println("Welcome to The HomePage");
	   
	}

	@And("I verify that HomePage is Visible successfully.")
	public void i_verify_that_home_page_is_visible_successfully() {
		signupPage=new SignupPage(driver,test);
		boolean actResult=signupPage.VerifyHome();
		Assert.assertTrue(actResult);
		}
		
	@And("I click on Signup\\/Login button.")
	public void i_click_on_signup_login_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.ClickSignup();
		System.out.println("User Clicked Signup Button");
	}

	@And("I verify New User Sign up! is Visible.")
	public void i_verify_new_user_sign_up_is_visible() {
		signupPage=new SignupPage(driver,test);
		boolean actResullt=signupPage.VerifySignupPage();
		Assert.assertTrue(actResullt);
	   
	}

	@When("I enter {string} and {string}.")
	public void i_enter_and(String Name, String emailAddress) {
		signupPage=new SignupPage(driver,test);
		signupPage.EnterNameEmail(Name, emailAddress);
		System.out.println("Details Entered");
	    
	}

	@And("I clicked Signup button.")
	public void i_clicked_signup_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.clickSignup();
		System.out.println("Clicked On SignUp");
	   }

	@And("I verify that ENTER ACCOUNT INFORMATION is visible or not.")
	public void i_verify_that_enter_account_information_is_visible_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean ActualRes=signupPage.VerifyAccountPage();
		Assert.assertTrue(ActualRes);
	}

	@When("I enter Title, Name, email,{string},DateOfBirth.")
	public void i_enter_title_name_email_date_of_birth(String password) {
		signupPage=new SignupPage(driver,test);
		signupPage.EnterDetails(password);
		System.out.println("Details Entered");
	  
	}

	@And("I select checkBox Signup for our new settler!.")
	public void i_select_check_box_signup_for_our_new_settler() {
		signupPage=new SignupPage(driver,test);
		signupPage.signupCheckBox();
	}

	@And("I select again checkBox Receive special offers for our partners!.")
	public void i_select_again_check_box_receive_special_offers_for_our_partners() {
		signupPage=new SignupPage(driver,test);
		signupPage.specialOfferCheckBox();
		System.out.println("All CheckBox Selected");
	   
	}

	@When("I enter {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}.")
	public void i_enter(String Firstname, String Lastname, String Company, String Address, String Address2, String State, String City, String Zipcode, String MobileNumber) {
		signupPage=new SignupPage(driver,test);
		signupPage.EnterAllDetails(Firstname, Lastname, Company, Address, Address2, State, City, Zipcode, MobileNumber);
	}

	@And("I click on Create Account.")
	public void i_click_on_create_account() {
		signupPage=new SignupPage(driver,test);
		signupPage.clickCreateAccount();
		System.out.println("Account Created");
	    
	}

	@And("I verify that ACCOUNT CREATED! is visible.")
	public void i_verify_that_account_created_is_visible() {
		signupPage=new SignupPage(driver,test);
		boolean actresult=signupPage.visibleAccountpage();
		Assert.assertTrue(actresult);
	  
	}

	@And("I clicked on Continue button.")
	public void i_clicked_on_continue_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.clickContinue();
	}

	@And("I verify  that Logged in as username! is visible.")
	public void i_verify_that_logged_in_as_username_is_visible() {
		signupPage=new SignupPage(driver,test);
		boolean actRes=signupPage.verifyAccounthomePage();
		Assert.assertTrue(actRes);
	   
	}
	@Then("I Delete the Account.")
	public void i_delete_the_account() {
		signupPage=new SignupPage(driver,test);
		signupPage.Delete();
		//System.out.println("Account sucessfully Deleted");
	}
	@Then("I verify Account Deleted and I click on continue.")
	public void i_verify_account_deleted_and_i_click_on_continue() {
		signupPage=new SignupPage(driver,test);
		boolean actResult=signupPage.verifyDelete();
		Assert.assertTrue(actResult);
		}
	@And("I verify Login to your account! is Visible.")
	public void i_verify_login_to_your_account_is_visible() {
		signupPage=new SignupPage(driver,test);
		boolean res=signupPage.verifyLoginPage();
		Assert.assertTrue(res);
	    
	}
	@When("I enter valid {string} and {string}.")
	public void i_enter_valid_and(String EmailAddress, String Password) {
		signupPage=new SignupPage(driver,test);
		signupPage.Login(EmailAddress, Password);
		System.out.println("Credentials Entered");
	   
	}
	@And("I clicked LOGIN button.")
	public void i_clicked_login_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.LOginClicked();
	    
	}
	@And("I verify Logged in as Username is visible or not.")
	public void i_verify_logged_in_as_username_is_visible_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean actRes=signupPage.LoggedInAsVerify();
		Assert.assertTrue(actRes);
	}
	@Then("I Logout from the webpage.")
	public void i_logout_from_the_webpage() {
		signupPage=new SignupPage(driver,test);
		signupPage.LogOut();
	   
	}
	@Then("I verify that user is navigated to the LOGIN PAGE.")
	public void i_verify_that_user_is_navigated_to_the_login_page() {
		signupPage=new SignupPage(driver,test);
		boolean actualres=signupPage.verifyLogout();
		Assert.assertTrue(actualres);
	    
	}
	@When("I enter invalid {string} and {string}.")
	public void i_enter_invalid_and(String EmailAddress, String Password) {
		signupPage=new SignupPage(driver,test);
		signupPage.InvalidLogin(EmailAddress, Password);
	    
	}
	@Then("I verify Your email or password is incorrect is visible or not.")
	public void i_verify_your_email_or_password_is_incorrect_is_visible_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean actres=signupPage.VerifyInvalidLogin();
		Assert.assertTrue(actres);
	   
	}
	@When("I enter {string} and already existing {string}.")
	public void i_enter_and_already_existing(String Name, String EmailAddress) {
		signupPage=new SignupPage(driver,test);
		signupPage.InvalidSignup(Name, EmailAddress);
	   
	}
	@Then("I verify EmailAddress exisitng already! is visible or not.")
	public void i_verify_email_address_exisitng_already_is_visible_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean resact=signupPage.VerifyInvalidSignUp();
		Assert.assertTrue(resact);
	}
	
	@And("I click on Contact Us button.")
	public void i_click_on_contact_us_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.Contactus();
	}
	@And("I verify GET IN TOUCH! is visible or not.")
	public void i_verify_get_in_touch_is_visible_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean actresult=signupPage.VerifyContactUs();
		Assert.assertTrue(actresult);
	}
	@When("I entered {string},{string},{string} and {string}.")
	public void i_entered_and(String Name, String Email, String Subject, String Message) {
		signupPage=new SignupPage(driver,test);
		signupPage.EnterContactUsDetails(Name, Email, Subject, Message);
		System.out.println("Details Entered For Support ");
	}
	@When("I upload file.")
	public void i_upload_file() {
		signupPage=new SignupPage(driver,test);
		signupPage.UploadFile();
		System.out.println("File Uploaded.");
	}
	@And("I click Submit button.")
	public void i_click_submit_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.ContactSubmitbutton();
	    
	}
	@And("I clicked OK button.")
	public void i_clicked_ok_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.ContactOK();
	}
	@And("I verify Success! Your details have been submitted successfuly is visible or not.")
	public void i_verify_success_your_details_have_been_submitted_successfuly_is_visible_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean res=signupPage.VerifySuccess();
		Assert.assertTrue(res);
	}
	@And("I clicked Home.")
	public void i_clicked_home() {
		signupPage=new SignupPage(driver,test);
		signupPage.ClickedContactHome();
	}
	@Then("I verify landed to HomePage sucessfuly or not.")
	public void i_verify_landed_to_home_page_sucessfuly_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean resultact=signupPage.VerifyClickedHome();
		Assert.assertTrue(resultact);
		System.out.println("User is in HOMEPAGE.");
	}
	@And("I click on Test Case button.")
	public void i_click_on_test_case_button() {
		signupPage=new SignupPage(driver,test);
		signupPage.Testcases();
	    
	}
	@Then("I verify user is navigated to Test Cases page successfully or not.")
	public void i_verify_user_is_navigated_to_test_cases_page_successfully_or_not() {
		signupPage=new SignupPage(driver,test);
		boolean actual=signupPage.VerifyTestCases();
		Assert.assertTrue(actual);
	}
	@And("I scroll down to footer.")
	public void i_scroll_down_to_footer() {
		 subscriptionPage=new SubscriptionPage(driver,test);
		 subscriptionPage.Scrollfooter();
	}
	@And("I verify text SUBSCRIPTION.")
	public void i_verify_text_subscription() {
		subscriptionPage=new SubscriptionPage(driver,test);
		boolean actResult=subscriptionPage.VerifySubscription();
		Assert.assertTrue(actResult);
		
	}
	@When("I enter {string} in input and click arrow button.")
	public void i_enter_in_input_and_click_arrow_button(String EmailAddress) {
		subscriptionPage=new SubscriptionPage(driver,test);
		subscriptionPage.EnterEmailAddress(EmailAddress);
		System.out.println("Entered emailAddress and clicked");
		
	}
	@Then("I verify Success message.")
	public void i_verify_success_message() {
		subscriptionPage=new SubscriptionPage(driver,test);
		boolean actual=subscriptionPage.VerifySuccess();
		Assert.assertTrue(actual);
	}
	@And("I clicked Cart button.")
	public void i_clicked_cart_button() {
		subscriptionPage=new SubscriptionPage(driver,test);
		subscriptionPage.Cartclicked();
	}
	@And("I click on product button.")
	public void i_click_on_product_button() {
		productPage=new ProductPage(driver,test);
		productPage.clickProduct();
	}
	@And("I verify user is navigated to ALL PRODUCTS! page or not.")
	public void i_verify_user_is_navigated_to_all_products_page_or_not() {
		productPage=new ProductPage(driver,test);
		boolean actualRESULT=productPage.VerifyAllProduct();
		Assert.assertTrue(actualRESULT);
	}
	@And("I click on View Product of first Product.")
	public void i_click_on_view_product_of_first_product() {
		productPage=new ProductPage(driver,test);
		productPage.ClickViewProduct();
	}
	@Then("I verify all product details are visible or not.")
	public void i_verify_all_product_details_are_visible_or_not() {
		productPage=new ProductPage(driver,test);
		boolean resultactual=productPage.VerifyProductDetails();
		Assert.assertTrue(resultactual);
	}
	@When("I enter {string} in search input and clicked search button.")
	public void i_enter_in_search_input_and_clicked_search_button(String Product_Name) {
		productPage=new ProductPage(driver,test);
		productPage.SearchProductandClick(Product_Name);
		
	   
	}
	@Then("I verify SEARCHED PRODUCT! is visible or not.")
	public void i_verify_searched_product_is_visible_or_not() {
		productPage=new ProductPage(driver,test);
		boolean Actresult=productPage.VerifySearchedProduct();
		Assert.assertTrue(Actresult);
	}
	@And("I hover over the first Product and add it to cart.")
	public void i_hover_over_the_first_product_and_add_it_to_cart() {
		productPage=new ProductPage(driver,test);
		productPage.HoverAddFirst();
	}
	@And("I click Conitnue Shopping button.")
	public void i_click_conitnue_shopping_button() {
		productPage=new ProductPage(driver,test);
		productPage.ContinueShopping();
	}
	@And("I hover over the second Product and add it to cart.")
	public void i_hover_over_the_second_product_and_add_it_to_cart() {
		productPage=new ProductPage(driver,test);
		productPage.HoverAddSecond();
	}
	@And("I click on View Cart! option.")
	public void i_click_on_view_cart_option() {
		productPage=new ProductPage(driver,test);
		productPage.ClickonViewCart();
	}
	@Then("I verify both products are added to the cart.")
	public void i_verify_both_products_are_added_to_the_cart() {
		productPage=new ProductPage(driver,test);
		boolean actResult=productPage.VerifyBothProductsAdded();
		Assert.assertTrue(actResult);
	}
	@And("I increase product quantity to {int};")
	public void i_increase_product_quantity_to(Integer int1) {
		productPage=new ProductPage(driver,test);
		productPage.increaseQuantity();
	}
	@And("I click on Add to cart.")
	public void i_click_on_add_to_cart() {
		productPage=new ProductPage(driver,test);
		productPage.AddToCart();
		System.out.println("Product Added to cart.");
		
	}
	@Then("I verify the product is visible to the Cart Page with exact quantity.")
	public void i_verify_the_product_is_visible_to_the_cart_page_with_exact_quantity() {
		productPage=new ProductPage(driver,test);
		boolean actualres=productPage.VerifyProdAddtoCart();
		Assert.assertTrue(actualres);
		
	}
	@And("I click on X button corresponding to that particular product.")
	public void i_click_on_x_button_corresponding_to_that_particular_product() {
		productPage=new ProductPage(driver,test);
		productPage.ClickXButton();
		
	}
	@Then("I verify that product has been removed from the cart or not.")
	public void i_verify_that_product_has_been_removed_from_the_cart_or_not() {
		productPage=new ProductPage(driver,test);
		boolean ActualRes=productPage.verifyProductremove();
		Assert.assertTrue(ActualRes);
	}
	@And("I verify that categories are visible on left side bar.")
	public void i_verify_that_categories_are_visible_on_left_side_bar() {
		productPage=new ProductPage(driver,test);
		boolean res=productPage.VerifyCategoryHome();
		Assert.assertTrue(res);
	}
	@And("I click on Women Category.")
	public void i_click_on_women_category() {
		productPage=new ProductPage(driver,test);
		productPage.clickWomen();
	}
	@And("I click on dress category under Women category.")
	public void i_click_on_dress_category_under_women_category() {
		productPage=new ProductPage(driver,test);
		productPage.clickDresWomen();
	}
	@And("I verify that category Page is displayed with WOMEN- DRESS PRODUCTS.")
	public void i_verify_that_category_page_is_displayed_with_women_dress_products() {
		productPage=new ProductPage(driver,test);
		boolean resul=productPage.VerifyCategoryWomen();
		Assert.assertTrue(resul);
		
	}
	@And("I click on any sub category under Men category.")
	public void i_click_on_any_sub_category_under_men_category() {
		productPage=new ProductPage(driver,test);
		productPage.clickMen();
	}
	@Then("I verify user is navigated to the category page.")
	public void i_verify_user_is_navigated_to_the_category_page() {
		productPage=new ProductPage(driver,test);
		boolean res1=productPage.verifyCategoryMen();
		Assert.assertTrue(res1);
	}
	@And("I verify Brands are visible on leftside bar")
	public void i_verify_brands_are_visible_on_leftside_bar() {
		productPage=new ProductPage(driver,test);
		boolean resultact= productPage.VerifyBrands();
		Assert.assertTrue(resultact);
	}
	@And("I click on any brand name.")
	public void i_click_on_any_brand_name() {
		productPage=new ProductPage(driver,test);
		productPage.clickBrandName();
		System.out.println("BRAAND Selected!");
	}
	@And("i verify brand page is displayed with respective products.")
	public void i_verify_brand_page_is_displayed_with_respective_products() {
		productPage=new ProductPage(driver,test);
		boolean actResult=productPage.verifyBrandPage();
		Assert.assertTrue(actResult);
	}
	@And("I click again on any other brand.")
	public void i_click_again_on_any_other_brand() {
		productPage=new ProductPage(driver,test);
		productPage.clickOtherBrand();
	}
	@Then("I verify that particular brand page is visible.")
	public void i_verify_that_particular_brand_page_is_visible() {
		productPage=new ProductPage(driver,test);
		boolean ActualResult=productPage.verfiyAgainBrandPage();
		Assert.assertTrue(ActualResult);
	}
}
