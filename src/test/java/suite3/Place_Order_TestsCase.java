package suite3;




import suite1.*;
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
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Ignore;


public class Place_Order_TestsCase {

//THIS CLASS HAVE TEST CASE NUMBER 14 AND 15 AND 16 
    
    SeleniumFrameWork FW= new SeleniumFrameWork();
    MainPage Main_Page;
    Login_And_Singup_Page Login_SignUp_Page;
    SignUpPage SignUp_Page;
    ContactUs ContactUS_Page;
    products Product_Page;
    Cart_Page cart_page;
    
    
    String email="abdallahm23122001@gmail.com";
    String password="abdallah";
    String UnCorrectPassword = "AAAAAAAAAA";
    
    String Name_Product = "Blue Top";
    String Price_Product = "Rs. 500";
    String quantity_Product = "1";
    String TotalPrice_product="Rs. 500";
    
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

// THIS TEST CASE(0) FOR SIGNUP SO I CAN RUN TEST CASE 16 CAUSE LOGIN 
    @Epic("Automation Exercise Project")
    @Feature("User Registration")
    @Story("Register a new user account")
    @Severity(SeverityLevel.BLOCKER)
    @Description("This test verifies that a new user can successfully sign up, create an account and log in.")
    @Test(priority = 2)
    public void TC0(){
        
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");

        Main_Page.LoginSignUpButton();
       
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");

        Login_SignUp_Page.Send_Name_Signup("abdallah");
        Login_SignUp_Page.Send_Email_Signup("abdallahm23122001@gmail.com");
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

//Test Case 14: Place Order: Register while Checkout
    @Story("Register → Add Product to Cart → Checkout → Payment → Delete Account")
    @Description("Test Case 14: Register while checking out, add product, verify addresses, place order, confirm payment, and delete account.")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Abdallah Mohammed")
    @TmsLink("TC14")
    @Test(priority = 0)
    public void TC14(){
        /*verify that in home page*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /*click in product button*/
        Main_Page.PRODUCTS_Button();
        /*check all products massage is displayed or not*/
        boolean ALL_PRODUCTS_MASSAGE_Displayed = Product_Page.ALL_PRODUCTS_MASSAGE_Displayed();
        assertEquals(ALL_PRODUCTS_MASSAGE_Displayed, true,"The ALL PRODUCTS MASSAGE is not Displayed");
        System.out.println("The ALL PRODUCTS MASSAGE is Displayed");
        /*this scroll make me can click in view product button*/
        Product_Page.scroll_to_BibaProduct();
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        cart_page.CART_Button();
        /*verify that we in cart page */
        String title_cart_page = cart_page.get_title_cart_page();
        assertEquals(title_cart_page, "Automation Exercise - Checkout","the title_cart_page is not matched");
        System.out.println("the title_cart_page is matched");
        /*click in Proceed To Checkout button*/
        cart_page.Proceed_To_Checkout_Button();
        cart_page.Register_and_login_in_cartpage_button();
        
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");

        Login_SignUp_Page.Send_Name_Signup("abdallah");
        Login_SignUp_Page.Send_Email_Signup("abdallahm23122001@gmail.com");
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
        
        /*click in cart button*/
        cart_page.CART_Button();
        /*review the order*/
        String name_product_cart_page = cart_page.get_name_product1_cart_page();
        assertEquals(name_product_cart_page, Name_Product ,"the NAME OF PRODUCT is not MATCHED");
        System.out.println("THE NAME OF PRODUCT is MATCHED");
        
        String price_product1_cart_page = cart_page.get_price_product1_cart_page();
        assertEquals(price_product1_cart_page, Price_Product,"the price of product1 is not matched");
        System.out.println("the price in product1 is matched");
        
        String quantity_product1_cart_page = cart_page.get_Quantity_product1_cart_page();
        assertEquals(quantity_product1_cart_page, quantity_Product,"the quantity of product1 is not matched");
        System.out.println("the quantity in product1 is matched");
        
        String TotalPrice_product1_cart_page = cart_page.get_TotalPrice_product1_cart_page();
        assertEquals(TotalPrice_product1_cart_page,TotalPrice_product,"the TotalPrice of product1 is not matched");
        System.out.println("the TotalPrice in product1 is matched");
        
        /*click in Proceed To Checkout button*/
        cart_page.Proceed_To_Checkout_Button();
        /*verify the details delivery address*/
        String NAME_for_Your_delivery_address = cart_page.NAME_for_Your_delivery_address();
        assertEquals(NAME_for_Your_delivery_address, "Mr. abdallah mohammed" , "The NAME_for_Your_delivery_address is not matched");
        System.out.println("The NAME_for_Your_delivery_address is matched");
        
        String Company_for_Your_delivery_address = cart_page.Company_for_Your_delivery_address();
        assertEquals(Company_for_Your_delivery_address, Company,"The Company_for_Your_delivery_address is not matched");
        System.out.println("The Company_for_Your_delivery_address is matched");
        
        String Address1_for_Your_delivery_address = cart_page.Address1_for_Your_delivery_address();
        assertEquals(Address1_for_Your_delivery_address, Address1,"The Address1_for_Your_delivery_address is not matched");
        System.out.println("The Address1_for_Your_delivery_address is matched");
        
        String Address2_for_Your_delivery_address = cart_page.Address2_for_Your_delivery_address();
        assertEquals(Address2_for_Your_delivery_address, Address2,"The Address2_for_Your_delivery_address is not matched");
        System.out.println("The Address2_for_Your_delivery_address is matched");
        
        String State_city_postcode_for_Your_delivery_address = cart_page.State_city_postcode_for_Your_delivery_address();
        assertEquals(State_city_postcode_for_Your_delivery_address, "helwan Single 11311","The State_city_postcode_for_Your_delivery_address is not matched");
        System.out.println("The State_city_postcode_for_Your_delivery_address is matched");
        
        String Country_for_Your_delivery_address = cart_page.Country_for_Your_delivery_address();
        assertEquals(Country_for_Your_delivery_address, "United States","The Country_for_Your_delivery_address is not matched");
        System.out.println("The Country_for_Your_delivery_address is matched");
        
        String NumberPhone_for_Your_delivery_address = cart_page.NumberPhone_for_Your_delivery_address();
        assertEquals(NumberPhone_for_Your_delivery_address, Mobile_Number ,"The NumberPhone_for_Your_delivery_address is not matched");
        System.out.println("The NumberPhone_for_Your_delivery_address is matched");
        
        /*verify the details billing address*/
        String NAME_for_Your_billing_address = cart_page.NAME_for_Your_billing_address();
        assertEquals(NAME_for_Your_billing_address, "Mr. abdallah mohammed" , "The NAME_for_Your_billing_address is not matched");
        System.out.println("The NAME_for_Your_billing_address is matched");
        
        String Company_for_Your_billing_address = cart_page.Company_for_Your_billing_address();
        assertEquals(Company_for_Your_billing_address, Company,"The Company_for_Your_billing_address is not matched");
        System.out.println("The Company_for_Your_billing_address is matched");
        
        String Address1_Your_billing_address = cart_page.Address1_Your_billing_address();
        assertEquals(Address1_Your_billing_address, Address1,"The Address1_Your_billing_address is not matched");
        System.out.println("The Address1_Your_billing_address is matched");
        
        String Address2_Your_billing_address = cart_page.Address2_Your_billing_address();
        assertEquals(Address2_Your_billing_address, Address2,"The Address2_Your_billing_address is not matched");
        System.out.println("The Address2_Your_billing_address is matched");
        
        String State_city_postcode_for_Your_billing_address = cart_page.State_city_postcode_for_Your_billing_address();
        assertEquals(State_city_postcode_for_Your_billing_address, "helwan Single 11311","The State_city_postcode_for_Your_billing_address is not matched");
        System.out.println("The State_city_postcode_for_Your_billing_address is matched");
        
        String Country_for_Your_billing_address = cart_page.Country_for_Your_billing_address();
        assertEquals(Country_for_Your_billing_address, "United States","The Country_for_Your_billing_address is not matched");
        System.out.println("The Country_for_Your_billing_address is matched");
        
        String NumberPhone_for_Your_billing_address = cart_page.NumberPhone_for_Your_billing_address();
        assertEquals(NumberPhone_for_Your_billing_address, Mobile_Number ,"The NumberPhone_for_Your_billing_address is not matched");
        System.out.println("The NumberPhone_for_Your_billing_address is matched");
        
        cart_page.description_in_comment_text_area("I WANT THIS PRODUCT");
        cart_page.Place_Order_button();
 
        Main_Page.ScrollToFooter();
        
        cart_page.Name_on_Card("ABDALLAH");
        cart_page.Card_Number("123456789123456");
        cart_page.Card_cvc_Number("505");
        cart_page.month_Expiration_date("12");
        cart_page.year_Expiration_date("2027");
        cart_page.Pay_and_Confirm_Order_button();
        
       String Massage_Order_Is_Confirmed = cart_page.Massage_Order_Is_Confirmed();
        assertEquals(Massage_Order_Is_Confirmed,"Congratulations! Your order has been confirmed!","the Massage_Order_Is_Confirmed is not matched");
        System.out.println("the Massage_Order_Is_Confirmed is matched");
       
        
        Main_Page.Delete_Account_Button();
        boolean Deleted_Account_Displayed = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_Displayed, true,"the Deleted_Account_Displayed is not displayed");
        System.out.println("the the Deleted_Account_Displayed is displayed");
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 14 is don successfuly");
       
    }
    
//Test Case 15: Place Order: Register before Checkout   
     @Epic("Automation Exercise Project")
    @Feature("Checkout")
    @Story("Register User before Checkout")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test registers a new user, adds a product to cart, proceeds to checkout, places an order and finally deletes the account.")
    @Test(priority =1)
    public void TC15(){
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        Main_Page.LoginSignUpButton();
       
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");

        Login_SignUp_Page.Send_Name_Signup("abdallah");
        Login_SignUp_Page.Send_Email_Signup("abdallahm23122001@gmail.com");
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
        
        Main_Page.PRODUCTS_Button();
        Product_Page.scroll_to_BibaProduct();
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        
        cart_page.CART_Button();
        System.out.println("cart button is clicked");
        String title_cart_page = cart_page.get_title_cart_page();
        assertEquals(title_cart_page, "Automation Exercise - Checkout" , "the title_cart_page is not matched");
        System.out.println("the title_cart_page is matched");
        String name_product_cart_page = cart_page.get_name_product1_cart_page();
        assertEquals(name_product_cart_page, Name_Product ,"the NAME OF PRODUCT is not MATCHED");
        System.out.println("THE NAME OF PRODUCT is MATCHED");
        
        String price_product1_cart_page = cart_page.get_price_product1_cart_page();
        assertEquals(price_product1_cart_page, Price_Product,"the price of product1 is not matched");
        System.out.println("the price in product1 is matched");
        
        String quantity_product1_cart_page = cart_page.get_Quantity_product1_cart_page();
        assertEquals(quantity_product1_cart_page, quantity_Product,"the quantity of product1 is not matched");
        System.out.println("the quantity in product1 is matched");
        
        String TotalPrice_product1_cart_page = cart_page.get_TotalPrice_product1_cart_page();
        assertEquals(TotalPrice_product1_cart_page,TotalPrice_product,"the TotalPrice of product1 is not matched");
        System.out.println("the TotalPrice in product1 is matched");
        
        cart_page.Proceed_To_Checkout_Button();
        System.out.println("Proceed_To_Checkout_Button is clicked");
        
        String NAME_for_Your_delivery_address = cart_page.NAME_for_Your_delivery_address();
        assertEquals(NAME_for_Your_delivery_address, "Mr. abdallah mohammed" , "The NAME_for_Your_delivery_address is not matched");
        System.out.println("The NAME_for_Your_delivery_address is matched");
        
        String Company_for_Your_delivery_address = cart_page.Company_for_Your_delivery_address();
        assertEquals(Company_for_Your_delivery_address, Company,"The Company_for_Your_delivery_address is not matched");
        System.out.println("The Company_for_Your_delivery_address is matched");
        
        String Address1_for_Your_delivery_address = cart_page.Address1_for_Your_delivery_address();
        assertEquals(Address1_for_Your_delivery_address, Address1,"The Address1_for_Your_delivery_address is not matched");
        System.out.println("The Address1_for_Your_delivery_address is matched");
        
        String Address2_for_Your_delivery_address = cart_page.Address2_for_Your_delivery_address();
        assertEquals(Address2_for_Your_delivery_address, Address2,"The Address2_for_Your_delivery_address is not matched");
        System.out.println("The Address2_for_Your_delivery_address is matched");
        
        String State_city_postcode_for_Your_delivery_address = cart_page.State_city_postcode_for_Your_delivery_address();
        assertEquals(State_city_postcode_for_Your_delivery_address, "helwan Single 11311","The State_city_postcode_for_Your_delivery_address is not matched");
        System.out.println("The State_city_postcode_for_Your_delivery_address is matched");
        
        String Country_for_Your_delivery_address = cart_page.Country_for_Your_delivery_address();
        assertEquals(Country_for_Your_delivery_address, "United States","The Country_for_Your_delivery_address is not matched");
        System.out.println("The Country_for_Your_delivery_address is matched");
        
        String NumberPhone_for_Your_delivery_address = cart_page.NumberPhone_for_Your_delivery_address();
        assertEquals(NumberPhone_for_Your_delivery_address, Mobile_Number ,"The NumberPhone_for_Your_delivery_address is not matched");
        System.out.println("The NumberPhone_for_Your_delivery_address is matched");
        
        String NAME_for_Your_billing_address = cart_page.NAME_for_Your_billing_address();
        assertEquals(NAME_for_Your_billing_address, "Mr. abdallah mohammed" , "The NAME_for_Your_billing_address is not matched");
        System.out.println("The NAME_for_Your_billing_address is matched");
        
        String Company_for_Your_billing_address = cart_page.Company_for_Your_billing_address();
        assertEquals(Company_for_Your_billing_address, Company,"The Company_for_Your_billing_address is not matched");
        System.out.println("The Company_for_Your_billing_address is matched");
        
        String Address1_Your_billing_address = cart_page.Address1_Your_billing_address();
        assertEquals(Address1_Your_billing_address, Address1,"The Address1_Your_billing_address is not matched");
        System.out.println("The Address1_Your_billing_address is matched");
        
        String Address2_Your_billing_address = cart_page.Address2_Your_billing_address();
        assertEquals(Address2_Your_billing_address, Address2,"The Address2_Your_billing_address is not matched");
        System.out.println("The Address2_Your_billing_address is matched");
        
        String State_city_postcode_for_Your_billing_address = cart_page.State_city_postcode_for_Your_billing_address();
        assertEquals(State_city_postcode_for_Your_billing_address, "helwan Single 11311","The State_city_postcode_for_Your_billing_address is not matched");
        System.out.println("The State_city_postcode_for_Your_billing_address is matched");
        
        String Country_for_Your_billing_address = cart_page.Country_for_Your_billing_address();
        assertEquals(Country_for_Your_billing_address, "United States","The Country_for_Your_billing_address is not matched");
        System.out.println("The Country_for_Your_billing_address is matched");
        
        String NumberPhone_for_Your_billing_address = cart_page.NumberPhone_for_Your_billing_address();
        assertEquals(NumberPhone_for_Your_billing_address, Mobile_Number ,"The NumberPhone_for_Your_billing_address is not matched");
        System.out.println("The NumberPhone_for_Your_billing_address is matched");
        
        Main_Page.Scroll_To_Subscription_Massage_INPaymentMethod_InCart();
        cart_page.description_in_comment_text_area("I WANT THIS PRODUCT");
        cart_page.Place_Order_button();
        Main_Page.ScrollToFooter();
        cart_page.Name_on_Card("ABDALLAH");
        cart_page.Card_Number("123456789123456");
        cart_page.Card_cvc_Number("505");
        cart_page.month_Expiration_date("12");
        cart_page.year_Expiration_date("2027");
        cart_page.Pay_and_Confirm_Order_button();
        
       String Massage_Order_Is_Confirmed = cart_page.Massage_Order_Is_Confirmed();
        assertEquals(Massage_Order_Is_Confirmed,"Congratulations! Your order has been confirmed!","the Massage_Order_Is_Confirmed is not matched");
        System.out.println("the Massage_Order_Is_Confirmed is matched");
        
        cart_page.Order_Confirmed_Continue_Button();
        Main_Page.Delete_Account_Button();
        boolean Deleted_Account_Displayed = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_Displayed, true,"the Deleted_Account_Displayed is not displayed");
        System.out.println("the Deleted_Account_Displayed is displayed ");
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 15 has done successfuly");
        
        
    }   
    
//Test Case 16: Place Order: Login before Checkout    
    @Epic("Automation Exercise Project")
    @Feature("Checkout")
    @Story("Login User before Checkout")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test logs in an existing user, adds a product to cart, proceeds to checkout, places an order and finally deletes the account.")
    @Test(priority = 3)
    public void TC16(){
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        Main_Page.LoginSignUpButton();
       
         boolean LOGIN_to_your_account = Login_SignUp_Page.LOGIN_to_your_account_DISPLAYED();
        assertEquals(LOGIN_to_your_account, true,"The LOGIN to your account charater is not displayed ");
        System.out.println("The LOGIN to your account charater is displayed successfuly ");
        
        Login_SignUp_Page.Send_Login_Email(email);
        Login_SignUp_Page.Send_Login_password(password);
        Login_SignUp_Page.Login_Button();

        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
        
        Main_Page.PRODUCTS_Button();
        Product_Page.scroll_to_BibaProduct();
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button_1st();
        
        cart_page.CART_Button();
        System.out.println("cart button is clicked");
        String title_cart_page = cart_page.get_title_cart_page();
        assertEquals(title_cart_page, "Automation Exercise - Checkout","the title_cart_page is not matched");
        System.out.println("the title_cart_page is matched");
        
        String name_product_cart_page = cart_page.get_name_product1_cart_page();
        assertEquals(name_product_cart_page, Name_Product ,"the NAME OF PRODUCT is not MATCHED");
        System.out.println("THE NAME OF PRODUCT is MATCHED");
        
        String price_product1_cart_page = cart_page.get_price_product1_cart_page();
        assertEquals(price_product1_cart_page, Price_Product,"the price of product1 is not matched");
        System.out.println("the price in product1 is matched");
        
        String quantity_product1_cart_page = cart_page.get_Quantity_product1_cart_page();
        assertEquals(quantity_product1_cart_page, quantity_Product,"the quantity of product1 is not matched");
        System.out.println("the quantity in product1 is matched");
        
        String TotalPrice_product1_cart_page = cart_page.get_TotalPrice_product1_cart_page();
        assertEquals(TotalPrice_product1_cart_page,TotalPrice_product,"the TotalPrice of product1 is not matched");
        System.out.println("the TotalPrice in product1 is matched");
        
        
        cart_page.Proceed_To_Checkout_Button();
        System.out.println("Proceed_To_Checkout_Button is clicked");
        
        String NAME_for_Your_delivery_address = cart_page.NAME_for_Your_delivery_address();
        assertEquals(NAME_for_Your_delivery_address, "Mr. abdallah mohammed" , "The NAME_for_Your_delivery_address is not matched");
        System.out.println("The NAME_for_Your_delivery_address is matched");
        
        String Company_for_Your_delivery_address = cart_page.Company_for_Your_delivery_address();
        assertEquals(Company_for_Your_delivery_address, Company,"The Company_for_Your_delivery_address is not matched");
        System.out.println("The Company_for_Your_delivery_address is matched");
        
        String Address1_for_Your_delivery_address = cart_page.Address1_for_Your_delivery_address();
        assertEquals(Address1_for_Your_delivery_address, Address1,"The Address1_for_Your_delivery_address is not matched");
        System.out.println("The Address1_for_Your_delivery_address is matched");
        
        String Address2_for_Your_delivery_address = cart_page.Address2_for_Your_delivery_address();
        assertEquals(Address2_for_Your_delivery_address, Address2,"The Address2_for_Your_delivery_address is not matched");
        System.out.println("The Address2_for_Your_delivery_address is matched");
        
        String State_city_postcode_for_Your_delivery_address = cart_page.State_city_postcode_for_Your_delivery_address();
        assertEquals(State_city_postcode_for_Your_delivery_address, "helwan Single 11311","The State_city_postcode_for_Your_delivery_address is not matched");
        System.out.println("The State_city_postcode_for_Your_delivery_address is matched");
        
        String Country_for_Your_delivery_address = cart_page.Country_for_Your_delivery_address();
        assertEquals(Country_for_Your_delivery_address, "United States","The Country_for_Your_delivery_address is not matched");
        System.out.println("The Country_for_Your_delivery_address is matched");
        
        String NumberPhone_for_Your_delivery_address = cart_page.NumberPhone_for_Your_delivery_address();
        assertEquals(NumberPhone_for_Your_delivery_address, Mobile_Number ,"The NumberPhone_for_Your_delivery_address is not matched");
        System.out.println("The NumberPhone_for_Your_delivery_address is matched");
        
        String NAME_for_Your_billing_address = cart_page.NAME_for_Your_billing_address();
        assertEquals(NAME_for_Your_billing_address, "Mr. abdallah mohammed" , "The NAME_for_Your_billing_address is not matched");
        System.out.println("The NAME_for_Your_billing_address is matched");
        
        String Company_for_Your_billing_address = cart_page.Company_for_Your_billing_address();
        assertEquals(Company_for_Your_billing_address, Company,"The Company_for_Your_billing_address is not matched");
        System.out.println("The Company_for_Your_billing_address is matched");
        
        String Address1_Your_billing_address = cart_page.Address1_Your_billing_address();
        assertEquals(Address1_Your_billing_address, Address1,"The Address1_Your_billing_address is not matched");
        System.out.println("The Address1_Your_billing_address is matched");
        
        String Address2_Your_billing_address = cart_page.Address2_Your_billing_address();
        assertEquals(Address2_Your_billing_address, Address2,"The Address2_Your_billing_address is not matched");
        System.out.println("The Address2_Your_billing_address is matched");
        
        String State_city_postcode_for_Your_billing_address = cart_page.State_city_postcode_for_Your_billing_address();
        assertEquals(State_city_postcode_for_Your_billing_address, "helwan Single 11311","The State_city_postcode_for_Your_billing_address is not matched");
        System.out.println("The State_city_postcode_for_Your_billing_address is matched");
        
        String Country_for_Your_billing_address = cart_page.Country_for_Your_billing_address();
        assertEquals(Country_for_Your_billing_address, "United States","The Country_for_Your_billing_address is not matched");
        System.out.println("The Country_for_Your_billing_address is matched");
        
        String NumberPhone_for_Your_billing_address = cart_page.NumberPhone_for_Your_billing_address();
        assertEquals(NumberPhone_for_Your_billing_address, Mobile_Number ,"The NumberPhone_for_Your_billing_address is not matched");
        System.out.println("The NumberPhone_for_Your_billing_address is matched");
        
        cart_page.description_in_comment_text_area("I WANT THIS PRODUCT");
        cart_page.Place_Order_button();
        Main_Page.ScrollToFooter();
        cart_page.Name_on_Card("ABDALLAH");
        cart_page.Card_Number("123456789123456");
        cart_page.Card_cvc_Number("505");
        cart_page.month_Expiration_date("12");
        cart_page.year_Expiration_date("2027");
        cart_page.Pay_and_Confirm_Order_button();
        
        String Massage_Order_Is_Confirmed = cart_page.Massage_Order_Is_Confirmed();
        assertEquals(Massage_Order_Is_Confirmed,"Congratulations! Your order has been confirmed!","the Massage_Order_Is_Confirmed is not matched");
        System.out.println("the Massage_Order_Is_Confirmed is matched");        
    
        cart_page.Order_Confirmed_Continue_Button();
        
        Main_Page.Delete_Account_Button();
        boolean Deleted_Account_Displayed = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_Displayed, true,"the Deleted_Account_Displayed is not displayed");
        System.out.println("the Deleted_Account_Displayed is displayed ");
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 16 has done successfuly");
        
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
