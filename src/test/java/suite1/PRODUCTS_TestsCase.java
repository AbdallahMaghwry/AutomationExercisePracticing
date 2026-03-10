package suite1;




import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.MainPage;
import Pages.Login_And_Singup_Page;
import Pages.SignUpPage;
import Pages.ContactUs;
import Pages.products;
import Pages.Cart_Page;
import EdgesFramework.SeleniumFrameWork;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.Ignore;


public class PRODUCTS_TestsCase {

//THIS CLASS HAVE TEST CASE Numbers(8,9,12,13,17,18,19,20,21,22,23,24 )
    
    SeleniumFrameWork FW= new SeleniumFrameWork();
    MainPage Main_Page;
    Login_And_Singup_Page Login_SignUp_Page;
    SignUpPage SignUp_Page;
    ContactUs ContactUS_Page;
    products Product_Page;
    Cart_Page cart_page;
    
    
    String email_1="abdallahm23122001@gmail.com";
   
    String password="abdallah";
 
    
    String Search_Product="Top";
    
    String Name_Product1 = "Blue Top";
    String Price_Product1 = "Rs. 500";
    String quantity_Product1 = "1";
    String TotalPrice_product1="Rs. 500";
    
    String Name_Product2 = "Men Tshirt";
    String Price_Product2 = "Rs. 400";
    String quantity_Product2 = "1";
    String TotalPrice_product2="Rs. 400";
    
   String  Quantity_product_number_TC13 = "4";
    
    String birth_days="5";
    String birth_month="12";
    String birth_year="2001";
    String FirstName="abdallah";
    String LastName="mohammed";
    String Company="almentor";
    String City="helwan";
    String State="Single";
    String Zip_Code="11311";
    String Mobile_Number="01017416987";
    String Address1 = "36 fayedy";
    String Address2 = "35 fayedy";

// THIS TEST CASE(0) 
    @Epic("E-Commerce Application")
    @Feature("User Registration")
    @Story("New user is able to sign up successfully")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a new user can sign up with valid details and log in successfully.")
    @Test(priority = 0)
    public void TC0(){
        
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");

        Main_Page.LoginSignUpButton();
       
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");

        Login_SignUp_Page.Send_Name_Signup(FirstName);
        Login_SignUp_Page.Send_Email_Signup(email_1);
        Login_SignUp_Page.Signup_Button();

        boolean Account_Information =SignUp_Page.Account_Information_displayed();
        assertEquals(Account_Information, true, "the Account Information charater is not displayed ");
        System.out.println("the New User Signup is displayed successfuly");

        SignUp_Page.check_MR();
        SignUp_Page.password_signup(password);
        SignUp_Page.birth_days(birth_days);
        SignUp_Page.birth_month(birth_month);
        SignUp_Page.birth_year(birth_year);
        SignUp_Page.checkbox_newsletter();
        SignUp_Page.checkbox_partners();
        SignUp_Page.FirstName(FirstName);
        SignUp_Page.LastName(LastName);
        SignUp_Page.Company(Company);
        SignUp_Page.Address1(Address1);
        SignUp_Page.Address2(Address2);
        SignUp_Page.City(City);
        SignUp_Page.Country(1);
        SignUp_Page.State(State);
        SignUp_Page.Zip_Code(Zip_Code);
        SignUp_Page.Mobile_Number(Mobile_Number);
        SignUp_Page.Create_Account_Button();

        boolean Account_created_displayed = SignUp_Page.Account_created_displayed();
        assertEquals(Account_created_displayed, true,"the Account Created charater is not displayed");
        System.out.println("Account Created is visable");

        Main_Page.contniue_created_button();

        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
    }


// Test Case 8: Verify All Products and product detail page
    @Epic("E-Commerce Application")
    @Feature("Products")
    @Story("User can view details of the first product")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that user can navigate to Products page, view the list, and check details of the first product including name, category, price, availability, condition, and brand.")
    @Test(priority = 1)
    public void TC8(){
        /*Verify that home page is visible successfully*/ 
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click on 'Products' button*/
        Main_Page.PRODUCTS_Button();
        
       /*Verify user is navigated to ALL PRODUCTS page successfully*/
        boolean ALL_PRODUCTS_MASSAGE_Displayed = Product_Page.ALL_PRODUCTS_MASSAGE_Displayed();
        assertEquals(ALL_PRODUCTS_MASSAGE_Displayed, true,"The ALL PRODUCTS MASSAGE is not Displayed");
        System.out.println("The ALL PRODUCTS MASSAGE is not Displayed");
        
        /*The products list is visible*/
        boolean PRODUCTS_LIST_Displayed = Product_Page.PRODUCTS_LIST_Displayed();
        assertEquals(PRODUCTS_LIST_Displayed, true , "The ALL PRODUCTS List is not Displayed");
        System.out.println("The ALL PRODUCTS List is Displayed");
        /*scroll to (biba product) so i can click to first product*/
        Product_Page.scroll_to_BibaProduct();
        /*Click on 'View Product' of first product*/
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        System.out.println("The VIEW_PRODUCT_1st_BUTTON is clicked");
        
        /*Verify that detail detail is visible: product name, category, price, availability, condition, brand*/
        boolean NAME_PRODUCT_1st_Displayed = Product_Page.NAME_PRODUCT_1st_Displayed();
        assertEquals(NAME_PRODUCT_1st_Displayed, true , "The NAME PRODUCT 1st is not Displayed");
        System.out.println("The NAME PRODUCT 1st is Displayed");
        
        boolean CATEGORY_PRODUCT_1st_Displayed = Product_Page.CATEGORY_PRODUCT_1st_Displayed();
        assertEquals(CATEGORY_PRODUCT_1st_Displayed, true , "The CATEGORY PRODUCT 1st is not Displayed");
        System.out.println("The CATEGORY PRODUCT 1st is Displayed");
        
        boolean Condition_PRODUCT_1st_Displayed = Product_Page.Condition_PRODUCT_1st_Displayed();
        assertEquals(Condition_PRODUCT_1st_Displayed, true , "The CONDITION PRODUCT 1st is not Displayed");
        System.out.println("The CONDITION PRODUCT 1st is Displayed");
        
        boolean Availability_PRODUCT_1st_Displayed = Product_Page.Availability_PRODUCT_1st_Displayed();
        assertEquals(Availability_PRODUCT_1st_Displayed, true , "The Availability PRODUCT 1st is not Displayed");
        System.out.println("The Availability PRODUCT 1st is Displayed");
        
        boolean Brand_PRODUCT_1st_Displayed = Product_Page.Brand_PRODUCT_1st_Displayed();
        assertEquals(Brand_PRODUCT_1st_Displayed, true , "The Brand PRODUCT 1st is not Displayed");
        System.out.println("The Brand PRODUCT 1st is Displayed");
        
        System.out.println("the test case 8 is done successfuly");
    }

// Test Case 9: Search Product
    @Epic("E-Commerce Application")
    @Feature("Products")
    @Story("User can search for a product by name")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that the user can search for a product by name and see all related products in the results.")
    @Test(priority = 2)
    public void TC9(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click on 'Products' button*/
        Main_Page.PRODUCTS_Button();
        
        /*Verify user is navigated to ALL PRODUCTS page successfully*/
        boolean ALL_PRODUCTS_MASSAGE_Displayed = Product_Page.ALL_PRODUCTS_MASSAGE_Displayed();
        assertEquals(ALL_PRODUCTS_MASSAGE_Displayed, true,"The ALL PRODUCTS MASSAGE is not Displayed");
        System.out.println("The ALL PRODUCTS MASSAGE is Displayed");
        /*Enter product name in search input and click search button*/
        Product_Page.scroll_to_POLOProduct();
        Product_Page.Search_Product("Top");
        Product_Page.Search_Button();
        
        /*Verify 'SEARCHED PRODUCTS' is visible*/
        boolean Searched_product_massage = Product_Page.Searched_product_massage();
        assertEquals(Searched_product_massage, true,"The Searched_product_massage is not Displayed");
        System.out.println("The Searched_product_massage is Displayed");     
        
       /*Verify all the products related to search are visible*/
        Product_Page.verify_product(Search_Product);
        
        System.out.println("the test case 9 is done successfuly");
    }
   
// Test Case 12: Add Products in Cart  
    @Epic("E-Commerce Application")
    @Feature("Shopping Cart")
    @Story("User can add multiple products to the cart and verify their details")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that the user can add two products to the cart and validate their names, prices, quantities, and total prices.")
    @Test(priority = 3)
    public void TC12(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /* Click 'Products' button*/
        Main_Page.PRODUCTS_Button();
         /*scroll to (biba product) so i can click to first product*/
        Product_Page.scroll_to_BibaProduct();
        /*Hover over first product and click 'Add to cart'*/
        Product_Page.Hover_product1();
       /*Click 'Continue Shopping' button*/
        Product_Page.continue_shoping_button();
       /* Hover over second product and click 'Add to cart' */
        Product_Page.Hover_product2();
        Product_Page.continue_shoping_button();
        /*Click 'View Cart' button*/
        cart_page.CART_Button();
        /*
        Verify both products are added to Cart
        Verify their prices, quantity and total price 
        */
        String name_product_cart_page = cart_page.get_name_product1_cart_page();
        assertEquals(name_product_cart_page, Name_Product1 ,"the NAME OF PRODUCT 1 is not MATCHED");
        System.out.println("THE NAME OF PRODUCT 1 is MATCHED");
        
        String price_product1_cart_page = cart_page.get_price_product1_cart_page();
        assertEquals(price_product1_cart_page, Price_Product1,"the price of product 1 is not matched");
        System.out.println("the price in product 1 is matched");
        
        String quantity_product1_cart_page = cart_page.get_Quantity_product1_cart_page();
        assertEquals(quantity_product1_cart_page, quantity_Product1,"the quantity of product 1 is not matched");
        System.out.println("the quantity in product 1 is matched");
        
        String TotalPrice_product1_cart_page = cart_page.get_TotalPrice_product1_cart_page();
        assertEquals(TotalPrice_product1_cart_page,TotalPrice_product1,"the TotalPrice of product 1 is not matched");
        System.out.println("the TotalPrice in product 1 is matched");
      
        String name_product2_cart_page = cart_page.get_name_product2_cart_page();
        assertEquals(name_product2_cart_page, Name_Product2 ,"the NAME OF PRODUCT 2 is not MATCHED");
        System.out.println("THE NAME OF PRODUCT 2 is MATCHED");
        
        String price_product2_cart_page = cart_page.get_price_product2_cart_page();
        assertEquals(price_product2_cart_page, Price_Product2,"the price of product 2 is not matched");
        System.out.println("the price in product 2 is matched");
        
        String quantity_product2_cart_page = cart_page.get_Quantity_product2_cart_page();
        assertEquals(quantity_product2_cart_page, quantity_Product2,"the quantity of product 2 is not matched");
        System.out.println("the quantity in product 2 is matched");
        
        String TotalPrice_product2_cart_page = cart_page.get_TotalPrice_product2_cart_page();
        assertEquals(TotalPrice_product2_cart_page,TotalPrice_product2,"the TotalPrice of product 2 is not matched");
        System.out.println("the TotalPrice in product 2 is matched");
}

// Test Case 13: Verify Product quantity in Cart 
    @Story("TC13 - Verify Product Quantity in Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that when user increases the product quantity before adding to cart, " +
                 "the exact quantity is displayed correctly in the cart page.")
    @Step("Verify product quantity in cart after adding from product detail page")
    @Test(priority = 4)
    public void TC13(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click 'View Product' for any product on home page*/
        Main_Page.PRODUCTS_Button();
        System.out.println("The PRODUCTS_Button has clicked");
        /*scroll to (biba product) so i can click to first product*/
        Product_Page.scroll_to_BibaProduct();
        /* Verify product detail is opened*/
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        /* Increase quantity to 4*/
        Product_Page.Quantity_product_number(Quantity_product_number_TC13);
        /*Click 'Add to cart' button*/
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        System.out.println("The FIRST PRODUCT AND Quantity 4  ADDED TO CART");
        /*Click 'View Cart' button*/
        cart_page.CART_Button();
        /*Verify that product is displayed in cart page with exact quantity*/
        String Verify_Quantity = cart_page.get_Quantity_product1_cart_page();
        assertEquals(Verify_Quantity, Quantity_product_number_TC13 ,"the Quantity is not mathced");
        System.out.println("the Quantity is matched");
        System.out.println("the test case 13 has done successfuly");
    }    

//Test Case 17: Remove Products From Cart   
    @Story("TC17 - Remove Product from Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a user can remove a product from the cart and the cart becomes empty successfully.")
    @Test(priority = 5)
    public void TC17(){
        /* Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Add products to cart*/
        Main_Page.PRODUCTS_Button();
        System.out.println("The PRODUCTS_Button has clicked");
        /*scroll to (biba product) so i can click to first product*/
        Product_Page.scroll_to_BibaProduct();
        
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        System.out.println("The FIRST PRODUCT ADDED TO CART");
        /*Click 'Cart' button*/
        cart_page.CART_Button();
        System.out.println("cart button is clicked");
        String title_cart_page = cart_page.get_title_cart_page();
        assertEquals(title_cart_page, "Automation Exercise - Checkout" , "the title_cart_page is not matched");
        System.out.println("the title_cart_page is matched");
        /*Click 'X' button corresponding to particular product*/
        cart_page.Delete_product1_button();
        boolean empty_cart_isDisplayed = cart_page.empty_cart_isDisplayed();
        assertEquals(empty_cart_isDisplayed , true ,"the cart have product");
        System.out.println("The PRODUCT has deleted form the CART successfuly");
        System.out.println("the test case 17 has done successfuly");
        
        
    }

//Test Case 18: View Category Products    
    @Story("TC18 - Verify Categories on Left Sidebar")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that categories are visible on the left sidebar,user can navigate to Women -> Dress category, and then switch to Men -> T-shirts category successfully.")
    @Test(priority = 6)
    public void TC18(){
       /*Verify that categories are visible on left side bar*/
        boolean PRODUCTS_LIST_Displayed = Product_Page.PRODUCTS_LIST_Displayed();
        assertEquals(PRODUCTS_LIST_Displayed, true,"the PRODUCTS_LIST_Displayed is not displayed");
        System.out.println("the PRODUCTS_LIST_Displayed is displayed");
        /*scroll to (biba product) so i can click to product*/
        Product_Page.scroll_to_BibaProduct();
        /*Click on 'Women' category*/
        Product_Page.Women_category();
        /*Click on any category link under 'Women' category, for example: Dress*/
        Product_Page.Women_category_dress();
        /*Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'*/
        String Women_Dress_Products_massage = Product_Page.Women_Dress_Products_massage();
        assertEquals(Women_Dress_Products_massage,"WOMEN - DRESS PRODUCTS" ,"the Women_Dress_Products_massage is not displayed");
        System.out.println("the Women_Dress_Products_massage is displayed");
        /*On left side bar, click on any sub-category link of 'Men' category*/
        Product_Page.Man_category_InWomanCategoryPage();
        Product_Page.Man_category_Tshirts();
        /* Verify that user is navigated to that category page*/
        String Man_Tshirts_Products_massage = Product_Page.Man_Tshirts_Products_massage();
        assertEquals(Man_Tshirts_Products_massage, "MEN - TSHIRTS PRODUCTS" ,"the Man_Tshirts_Products_massage is not MATCHED");
        System.out.println("the Man_Tshirts_Products_massage is MATCHED");
        System.out.println("the test case 18 has done successfuly");
    }

    //Test Case 19: View & Cart Brand Products 
    @Story("TC19 - Verify Brands on Left Sidebar")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that brands are visible on the left sidebar,user can navigate to a brand page (Polo) and then switch to another brand page (H&M).")
    @Test(priority = 7)
    public void TC19(){
        /*Click on 'Products' button*/
        Main_Page.PRODUCTS_Button();
        
        /*Verify that Brands are visible on left side bar*/
        boolean Brand_List = Product_Page.Brand_List();
        assertEquals(Brand_List, true,"the brand list is not displayed");
        System.out.println("the brand list is displayed");
        /*Click on any brand name*/
        Product_Page.Brand_POLO();
        /*Verify that user is navigated to brand page and brand products are displayed*/
        String Brand_POLO_PRODUCTS_MASSAGE = Product_Page.Brand_POLO_PRODUCTS_MASSAGE();
        assertEquals(Brand_POLO_PRODUCTS_MASSAGE,"BRAND - POLO PRODUCTS","the Brand_POLO_PRODUCTS_MASSAGE is not MATCHED");
        System.out.println("the Brand_POLO_PRODUCTS_MASSAGE is MATCHED");
        /*On left side bar, click on any other brand link*/
        Product_Page.Brand_H_AND_M();
        /*Verify that user is navigated to that brand page and can see products*/
        String Brand_H_AND_M_PRODUCTS_MASSAGE = Product_Page.Brand_H_AND_M_PRODUCTS_MASSAGE();
        assertEquals(Brand_H_AND_M_PRODUCTS_MASSAGE, "BRAND - H&M PRODUCTS","the Brand_H_AND_M_PRODUCTS_MASSAGE is not MATCHED");
        System.out.println("the Brand_H_AND_M_PRODUCTS_MASSAGE is MATCHED");
        System.out.println("the test case 19 has done successfuly");
     }

//Test Case 20: Search Products and Verify Cart After Login   
    @Story("TC20 - Verify Cart Persistence After Login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("This test verifies that products added to cart before login remain in the cart after login . It also ensures that product details are visible and account deletion works properly.")
    @Test(priority = 8)
    public void TC20(){
        /*Click on 'Products' button*/
        Main_Page.PRODUCTS_Button();
        /*Verify user is navigated to ALL PRODUCTS page successfully*/
        boolean ALL_PRODUCTS_MASSAGE_Displayed = Product_Page.ALL_PRODUCTS_MASSAGE_Displayed();
        assertEquals(ALL_PRODUCTS_MASSAGE_Displayed, true,"The ALL PRODUCTS MASSAGE is not Displayed");
        System.out.println("The ALL PRODUCTS MASSAGE is Displayed");
        /*Enter product name in search input and click search button*/
        Product_Page.Search_Product(Name_Product1);
        Product_Page.Search_Button();
        /*Verify 'SEARCHED PRODUCTS' is visible*/
        boolean Searched_product_massage = Product_Page.Searched_product_massage();
        assertEquals(Searched_product_massage, true,"The Searched_product_massage is not Displayed");
        System.out.println("The Searched_product_massage is Displayed"); 
        /*Verify all the products related to search are visible*/
        Product_Page.verify_product(Name_Product1);
        /*scroll to (biba product) so i can click to product*/
        Product_Page.scroll_to_BibaProduct();
       
        /*Add those products to cart*/
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        
        /*Click 'Cart' button and verify that products are visible in cart*/
        cart_page.CART_Button();
        boolean product_1st_Displayed = cart_page.product_1st_Displayed();
        assertEquals(product_1st_Displayed, true, "the product_1st_Displayed is not displayed");
        System.out.println("the product_1st_Displayed is displayed");
        /*Click 'Signup / Login' button and submit login details*/
        Main_Page.LoginSignUpButton();
        Login_SignUp_Page.Send_Login_Email(email_1);
        Login_SignUp_Page.Send_Login_password(password);
        Login_SignUp_Page.Login_Button();
        /*Again, go to Cart page*/
        cart_page.CART_Button();
        /*Verify that those products are visible in cart after login as well*/
        boolean Products_inCart_displayed = cart_page.Products_inCart_displayed();
        assertEquals(Products_inCart_displayed, true,"the Products_inCart is not displayed");
        System.out.println("the Products_inCart is displayed");
        String Verify_Name_Product_InCart = cart_page.Verify_Name_Product_InCart();
        assertEquals(Verify_Name_Product_InCart, Name_Product1,"the name of product is not matched");
        System.out.println("the name of product is matched");
        /*delete account*/
        Main_Page.Delete_Account_Button();
        boolean Deleted_Account_Displayed = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_Displayed, true,"the Deleted_Account_Displayed is not displayed");
        System.out.println("the Deleted_Account_Displayed is displayed ");
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 20 has done successfuly");
    }

//Test Case 21: Add review on product  
    @Story("Submit Product Review")
    @Description("Test Case 21: Verify that user can submit a product review with name, email, and comment, and gets confirmation message.")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Abdallah Mohammed")
    @TmsLink("TC21")
    @Test(priority = 9)
    public void TC21(){
       /*Click on 'Products' button*/
        Main_Page.PRODUCTS_Button();
       /*Verify user is navigated to ALL PRODUCTS page successfully*/
        boolean ALL_PRODUCTS_MASSAGE_Displayed = Product_Page.ALL_PRODUCTS_MASSAGE_Displayed();
        assertEquals(ALL_PRODUCTS_MASSAGE_Displayed, true,"The ALL PRODUCTS MASSAGE is not Displayed");
        System.out.println("The ALL PRODUCTS MASSAGE is Displayed");
         /*scroll to (biba product) so i can click to product*/
        Product_Page.scroll_to_BibaProduct();
        /*Click on 'View Product' button*/
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        /* Verify 'Write Your Review' is visible*/
        boolean Write_your_review_MASSAGE = Product_Page.Write_your_review_MASSAGE();
        assertEquals(Write_your_review_MASSAGE, true,"The Write_your_review_MASSAGE is not Displayed");
        System.out.println("The Write_your_review_MASSAGE is Displayed");
        /*Enter name, email and review*/
        Product_Page.NAME_FOR_REVIEW("Abdallah");
        Product_Page.EMAIL_FOR_REVIEW(email_1);
        Product_Page.TEXT_FOR_REVIEW("THIS IS GOOD PRODUCT");
        /*Click 'Submit' button*/
        Product_Page.SUBMIT_FOR_REVIEW();
        /*Verify success message 'Thank you for your review*/
        boolean MASSAGE_THANK_FOR_REVIEW = Product_Page.MASSAGE_THANK_FOR_REVIEW();
        assertEquals(MASSAGE_THANK_FOR_REVIEW, true,"The MASSAGE_THANK_FOR_REVIEW is not Displayed");
        System.out.println("The MASSAGE_THANK_FOR_REVIEW is Displayed");
        System.out.println("the test case 21 has done successfuly");
    }

//Test Case 22: Add to cart from Recommended items    
    @Story("Add Recommended Item to Cart")
    @Description("Test Case 22: Scroll to Recommended Items, add a product to cart, and verify it is displayed in cart.")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Abdallah Mohammed")
    @TmsLink("TC22")
    @Test(priority = 10)
    public void TC22(){
       /*Scroll to bottom of page*/
        Main_Page.Scroll_To_Subscription_Massage();
        System.out.println("the scroll to Subscription Massage is done");
        /* Verify 'RECOMMENDED ITEMS' are visible*/
        boolean Recommended_Items = Main_Page.Recommended_Items();
        assertEquals(Recommended_Items, true,"the Recommended_Items is not displayed");
        System.out.println("the Recommended_Items is displayed");
        /*Click on 'Add To Cart' on Recommended product*/
        Main_Page.Product_6st_Recommended_Items();
        /*Click on 'View Cart' button*/
        cart_page.view_cart_button_in_massage_Display();
        /* Verify that product is displayed in cart page*/
        boolean product_1st_Displayedd = cart_page.product_6st_Displayed_recommended();
        assertEquals(product_1st_Displayedd, true,"the product_6st_Displayed_recommended is not displayed");
        System.out.println("the product_6st_Displayed_recommended is displayed");
        System.out.println("the test case 22 has done successfuly");
    }
    
    
    
@BeforeMethod    
    public void befforeMethod()  {
    
        
       Main_Page.InitializeBrowser();
        
    }    
   
@AfterMethod    
    public void AffterMethod()  {
    
        
        Main_Page.Close_Browser();
        
    }     
    
    
    
    @BeforeClass
    public void setUpMethod() throws Exception {
    
        Main_Page   = new MainPage(FW);
        Login_SignUp_Page = new Login_And_Singup_Page(FW);
        SignUp_Page  = new SignUpPage(FW);
        ContactUS_Page   = new ContactUs(FW);
        Product_Page   = new products(FW);
        cart_page= new Cart_Page(FW);
        FW   = new SeleniumFrameWork();
   
        
    }
   

    @AfterClass
    public void tearDownMethod()  {
      
    }
    
}
