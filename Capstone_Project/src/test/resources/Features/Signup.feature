Feature: SignUp and Login Functionality check.
   @SignUp
Scenario Outline: To make User successfuly Register into the given Website.
       
        Given I Navigate to the Home Page.
        And I verify that HomePage is Visible successfully.
        And I click on Signup/Login button.
        And I verify New User Sign up! is Visible.
        When I enter "<Name>" and "<emailAddress>".
        And I clicked Signup button.
        And I verify that ENTER ACCOUNT INFORMATION is visible or not.
        When I enter Title, Name, email,"<password>",DateOfBirth.
        And I select checkBox Signup for our new settler!.
        And I select again checkBox Receive special offers for our partners!.
        When I enter "<Firstname>", "<Lastname>", "<Company>", "<Address>", "<Address2>", "<State>", "<City>", "<Zipcode>", "<MobileNumber>".
        And I click on Create Account.
        And I verify that ACCOUNT CREATED! is visible.
        And I clicked on Continue button.
        And I verify  that Logged in as username! is visible.
        Then I Delete the Account.
        Then I verify Account Deleted and I click on continue.
               
       Examples:
       | Name    |  emailAddress               | password    | Firstname | Lastname | Company | Address         | Address2    | State | City    | Zipcode | MobileNumber |
       | Dipayan | karmakardipayank29@gmail.com | Dipayan@123 | Dipayan   | Karmakar | Wipro   | 1234 Elm Street | Springfield | Vegas | Monaco | 700008  | 9008819656    |
       
    @Login
 Scenario Outline: To make user successfuly Login with correct username and correct password.
         
         Given I Navigate to the Home Page.
         And I verify that HomePage is Visible successfully.
         And I click on Signup/Login button.
         And I verify Login to your account! is Visible.
         When I enter valid "<EmailAddress>" and "<Password>".
         And I clicked LOGIN button.
         And I verify Logged in as Username is visible or not.
         Then I Logout from the webpage.
         Then I verify that user is navigated to the LOGIN PAGE.
         
     Examples:
     |      EmailAddress                   |  Password    |
     |   karmakardipayank@gmail.com        | Dipayan@123  |
     
     
    @InvalidLogin
 Scenario Outline: To make user Login with incorrect credentials.
 
          Given I Navigate to the Home Page.
          And I verify that HomePage is Visible successfully.
          And I click on Signup/Login button.
          And I verify Login to your account! is Visible.
          When I enter invalid "<EmailAddress>" and "<Password>".
          And I clicked LOGIN button.
          Then I verify Your email or password is incorrect is visible or not.
          
       Examples:
          |        EmailAddress          | Password  |
          |  karmakardipayan19@gmail.com | Karma@321 |
 
 
     @InvalidSignUp
 Scenario Outline: To make user SignUp in with already existing Emailaddress.
 
            Given I Navigate to the Home Page.
            And I verify that HomePage is Visible successfully.
            And I click on Signup/Login button.
            And I verify New User Sign up! is Visible.
            When I enter "<Name>" and already existing "<EmailAddress>".
            And I clicked Signup button.
            Then I verify EmailAddress exisitng already! is visible or not.
            
        Examples:
            |   Name  |       EmailAddress         |
            | Dipayan | karmakardipayank@gmail.com |
            
    @ContactUs
 Scenario Outline: To contact support whenever problem arises.
 
         Given I Navigate to the Home Page.
         And I verify that HomePage is Visible successfully.
         And I click on Contact Us button.
         And I verify GET IN TOUCH! is visible or not.
         When I entered "<Name>","<Email>","<Subject>" and "<Message>".
         When I upload file.
         And I click Submit button.
         And I clicked OK button.
         And I verify Success! Your details have been submitted successfuly is visible or not.
         And I clicked Home.
         Then I verify landed to HomePage sucessfuly or not.
    
     Examples:
        |  Name   |         Email               |     Subject      |           Message            |
        | DIPAYAN | karmakardipayan12@gmail.com | Error in Account | Account not working properly | 
        
        
    @TestCases
 Scenario Outline: To verify Test Cases Page functionality.
 
         Given I Navigate to the Home Page.
         And I verify that HomePage is Visible successfully.
         And I click on Test Case button.
         Then I verify user is navigated to Test Cases page successfully or not.
         
    @SubscriptionHome
 Scenario Outline: To verify subscription in Home Page.
 
         Given I Navigate to the Home Page.
         And I verify that HomePage is Visible successfully.
         And I scroll down to footer.
         And I verify text SUBSCRIPTION.
         When I enter "<EmailAddress>" in input and click arrow button.
         Then I verify Success message.
         
     Examples:
         |        EmailAddress         |
         | karmakardipayan@gmail.com   |
         | karmakardipayan55@gmail.com |
         
         
     @SubscriptionCart
 Scenario Outline: To verify subscription in Cart Page.
 
         Given I Navigate to the Home Page.
         And I verify that HomePage is Visible successfully.
         And I clicked Cart button.
         And I scroll down to footer.
         And I verify text SUBSCRIPTION.
         When I enter "<EmailAddress>" in input and click arrow button.
         Then I verify Success message.
         
         Examples:
         |        EmailAddress         |
         | karmakardipayan50@gmail.com |
         