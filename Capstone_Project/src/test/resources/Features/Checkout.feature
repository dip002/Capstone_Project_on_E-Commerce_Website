Feature: Placing Order and validating Checkout functionality.
   @RegisterWhileCheckout
 Scenario: To place an order and make the user register while checkout.
 
      
       Given I Navigate to the Home Page.
       And I verify that HomePage is Visible successfully.
       And I click on product button. 
       And I click on View Product of first Product.
       And I click on Add to cart.
       And I click on View Cart! option.
       Then I verify the product is visible to the Cart Page with exact quantity.
       And I click proceed to checkout.
       And I click on Register/Login button on pop up.
       When I enter "<Name>" and "<emailAddress>".
       And I clicked Signup button.
       When I enter Title, Name, email,"<password>",DateOfBirth.
       And I select checkBox Signup for our new settler!.
       And I select again checkBox Receive special offers for our partners!.
       When I enter "<Firstname>", "<Lastname>", "<Company>", "<Address>", "<Address2>", "<State>", "<City>", "<Zipcode>", "<MobileNumber>".
       And I click on Create Account.
       And I verify that ACCOUNT CREATED! is visible.
       And I clicked on Continue button.
       And I verify  that Logged in as username! is visible.
       And I clicked on cart.
       And I click proceed to checkout again.
       And I verify AddressDetails and review my order.
       When I enter description in "<Comment_text_area>" and click on Place order.
       When I am entering "<Name_on_card>","<Card_NUmber>","<CVC>","<Expiration_Date>","<Expiration_Year>" 
       And I click on Pay and Confirm order button.
       And I verify Success message Congratulations! Your order has been confirmed.
       Then I Delete the Account.
       Then I verify Account Deleted and I click on continue.
       
       
   Examples:
       | Name    | emailAddress               | password    | Firstname | Lastname | Company | Address         | Address2    | State | City    | Zipcode | MobileNumber | Comment_text_area | Name_on_card | Card_NUmber | CVC | Expiration_Date | Expiration_Year |                                                                                                       
       | Dipayan | karmakardipayan9@gmail.com | Dipayan@123 | Dipayan   | Karmakar | Wipro   | 1234 Elm Street | Springfield | Vegas | Monaco | 700008  | 9008819656    | Here is my order  | Dweepayan    | 42429429421 | 345 |       12        |     2028        |
       
   
    @LoginBeforeCheckout
 Scenario: To login and Place order and perform checkout.
     
         Given I Navigate to the Home Page.
         And I verify that HomePage is Visible successfully.
         And I click on Signup/Login button.
         When I enter valid "<EmailAddress>" and "<Password>".
         And I clicked LOGIN button.
         And I verify Logged in as Username is visible or not.
         And I click on View Product of first Product.
         And I click on Add to cart.
         And I clicked on cart.
         And I verify product is added to cart ot not.
         And I click proceed to checkout.
         And I verify AddressDetails and review my order.
         When I enter description in "<Comment_text_area>" and click on Place order.
         When I am entering "<Name_on_card>","<Card_NUmber>","<CVC>","<Expiration_Date>","<Expiration_Year>" 
         And I click on Pay and Confirm order button.
         Then I verify message Congratulations! Your order has been confirmed.
            
     Examples:
     |     EmailAddress           |  Password    ||Comment_text_area | Name_on_card | Card_NUmber | CVC | Expiration_Date | Expiration_Year |
     | karmakardipayank@gmail.com | Dipayan@123  ||Here is my order  |   Dipayan    | 42429429421 | 345 |       12        |     2028        |       
           
        
   @ProductReview
 Scenario: To add reviews on products. 
 
      Given I Navigate to the Home Page.
      And I verify that HomePage is Visible successfully. 
      And I click on product button.
      And I verify user is navigated to ALL PRODUCTS! page or not.        
      And I click on View Product of first Product.
      And I verify Write Your Review is visible or not.
      When I Enter "<Name>", "<EmailAdress>", and "<review>" on Your review section.
      And I click submit button on review section
      Then I verify Thank You for your review message.
      
    Examples: 
       |       Name       |     EmailAdress    |           review            |
       | Dipayan_Karmakar | karmakar@gmail.com | Excellent Shopping platform |
       
       
   @DownloadInvoice
 Scenario: To download invoice after purchase order.
       Given I Navigate to the Home Page.
       And I verify that HomePage is Visible successfully.
       And I click on product button. 
       And I click on View Product of first Product.
       And I click on Add to cart.
       And I click on View Cart! option.
       And I click proceed to checkout.
       And I click on Register/Login button on pop up.
       When I enter "<Name>" and "<emailAddress>".
       And I clicked Signup button.
       When I enter Title, Name, email,"<password>",DateOfBirth.
       And I select checkBox Signup for our new settler!.
       And I select again checkBox Receive special offers for our partners!.
       When I enter "<Firstname>", "<Lastname>", "<Company>", "<Address>", "<Address2>", "<State>", "<City>", "<Zipcode>", "<MobileNumber>".
       And I click on Create Account.
       And I verify that ACCOUNT CREATED! is visible.
       And I clicked on Continue button.
       And I verify  that Logged in as username! is visible.
       And I clicked on cart.
       And I click proceed to checkout again.
       And I verify AddressDetails and review my order.
       When I enter description in "<Comment_text_area>" and click on Place order.
       When I am entering "<Name_on_card>","<Card_NUmber>","<CVC>","<Expiration_Date>","<Expiration_Year>" 
       And I click on Pay and Confirm order button.
       And I verify Success message Congratulations! Your order has been confirmed.
       And I clicked on download invoice
       And I verify Invoice is downloaded successfully.
       Then I Delete the Account.
       Then I verify Account Deleted and I click on continue.
       
   Examples:
      |  Name   |  emailAddress               | password    | Firstname | Lastname | Company | Address         | Address2    | State | City    | Zipcode | MobileNumber | Comment_text_area | Name_on_card | Card_NUmber | CVC | Expiration_Date | Expiration_Year |                                                                                                       
      | Dipayan | karmakardipayan75@gmail.com | Dipayan@123 | Dipayan   | Karmakar | Wipro   | 1234 Elm Street | Springfield | Vegas | Monaco | 700008  | 9008819656    | Here is my order  | Dweepayan    | 42429429421 | 345 |       12        |     2028        |
             
             
   @ScrollUp
 Scenario: To verify Scroll up with and without arrow button.
 
        Given I Navigate to the Home Page.
        And I verify that HomePage is Visible successfully.
        And I scroll down to footer.
        And I verify text SUBSCRIPTION.         
        And I click on Arrow button.
        And I scroll Down and Up without arrow button.
        Then I verify Full-Fledged practice website for Automation Engineers text is visible on screen.
       