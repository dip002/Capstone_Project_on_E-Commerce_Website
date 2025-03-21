Feature: Searching product and adding to cart.
   @ProductDetails
Scenario: To verify All products and products detail page.
      
      Given I Navigate to the Home Page.
      And I verify that HomePage is Visible successfully. 
      And I click on product button.
      And I verify user is navigated to ALL PRODUCTS! page or not.
      And I click on View Product of first Product.
      Then I verify all product details are visible or not.
      
   @ProductSearch
 Scenario: To search a product in Product Search page.     
 
      Given I Navigate to the Home Page.
      And I verify that HomePage is Visible successfully. 
      And I click on product button.
      And I verify user is navigated to ALL PRODUCTS! page or not.  
      When I enter "<Product_Name>" in search input and clicked search button.
      Then I verify SEARCHED PRODUCT! is visible or not.
      
    Examples: 
       | Product_Name |
       |    Shirts    |
                 
    @ProductAddToCart   
 Scenario: To select and add a product to cart.
 
       Given I Navigate to the Home Page.
       And I verify that HomePage is Visible successfully. 
       And I click on product button.
       And I hover over the first Product and add it to cart.
       And I click Conitnue Shopping button.
       And I hover over the second Product and add it to cart.
       And I click on View Cart! option.
       Then I verify both products are added to the cart.    
               
   @ProductQuantity
 Scenario: To verify product quantity in cart.
 
       Given I Navigate to the Home Page.
       And I verify that HomePage is Visible successfully. 
       And I click on product button.
       And I click on View Product of first Product.
       Then I verify all product details are visible or not.
       And I increase product quantity to 4;
       And I click on Add to cart.
       And I click on View Cart! option.
       Then I verify the product is visible to the Cart Page with exact quantity.
             
    @ProductRemovefromCart    
 Scenario: To remove product from cart which was already added.
 
       Given I Navigate to the Home Page.
       And I verify that HomePage is Visible successfully. 
       And I click on product button.
       And I click on View Product of first Product. 
       And I click on Add to cart.
       And I click on View Cart! option.
       And I verify product is added to cart ot not.
       And I click on X button corresponding to that particular product.
       Then I verify that product has been removed from the cart or not.
             
     @ProductViewCategory
 Scenario: To select products based on categories.
  
       Given I Navigate to the Home Page.
       And I verify that categories are visible on left side bar.
       And I click on Women Category.
       And I click on dress category under Women category.
       And I verify that category Page is displayed with WOMEN- DRESS PRODUCTS.
       And I click on any sub category under Men category.
       Then I verify user is navigated to the category page.
       
       
     @ProductViewBrand
 Scenario: To select products based on brand and then add them to cart.
 
        Given I Navigate to the Home Page.
        And I click on product button.
        And I verify Brands are visible on leftside bar
        And I click on any brand name.
        And i verify brand page is displayed with respective products.
        And I click again on any other brand.
        Then I verify that particular brand page is visible.
        
       