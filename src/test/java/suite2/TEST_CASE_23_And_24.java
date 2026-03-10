package suite2;




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
import org.testng.annotations.Ignore;

public class TEST_CASE_23_And_24 {
    
   
    SeleniumFrameWork FW= new SeleniumFrameWork();
    MainPage Main_Page;
    Login_And_Singup_Page Login_SignUp_Page;
    SignUpPage SignUp_Page;
    ContactUs ContactUS_Page;
    products Product_Page;
    Cart_Page cart_page;
    
    
    
    
    String email_1="abdallahm23122001@gmail.com";
    String email_2="abdallahm@gmail.com";
    String password="abdallah";
    
    
    String Name_Product1 = "Blue Top";
    String Price_Product1 = "Rs. 500";
    String quantity_Product1 = "1";
    String TotalPrice_product1="Rs. 500";
    
    
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

     
     
    String File_Path ="C:\\Users\\Abdallah Mohammed\\Downloads";
    String File_Name ="invoice.txt";
    

    

    

    //Test Case 23: Verify address details in checkout page 
    @Epic("User Account & Checkout")
@Feature("Account Creation, Cart, and Address Verification")
@Story("New user signup, add product to cart, verify delivery & billing addresses, and delete account")
@Severity(SeverityLevel.BLOCKER)
@Description("This test verifies that a new user can successfully create an account, log in, add a product to cart, proceed to checkout, verify delivery and billing addresses match the registration details, and finally delete the account.")
@Test(priority = 0)
public void TC23(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
       
        /*check if (new user signup) is visable or not */
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");
        
        /*Fill all details in Signup and create account*/
        Login_SignUp_Page.Send_Name_Signup(FirstName);
        Login_SignUp_Page.Send_Email_Signup(email_2);
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

        /*Verify 'ACCOUNT CREATED!' and click 'Continue' button*/
        boolean Account_created_displayed = SignUp_Page.Account_created_displayed();
        assertEquals(Account_created_displayed, true,"the Account Created charater is not displayed");
        System.out.println("Account Created is visable");
        
        Main_Page.contniue_created_button();
        
        /*Verify ' Logged in as username' at top*/
        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
      
        /*Add products to cart*/
        Main_Page.PRODUCTS_Button();
        
        Product_Page.scroll_to_BibaProduct();
        
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        
        /*Click 'Cart' button*/
        cart_page.CART_Button();
        System.out.println("cart button is clicked");
        /*Verify that cart page is displayed*/
        String title_cart_page = cart_page.get_title_cart_page();
        assertEquals(title_cart_page, "Automation Exercise - Checkout" , "the title_cart_page is not matched");
        System.out.println("the title_cart_page is matched");
        /*Click Proceed To Checkout*/
        cart_page.Proceed_To_Checkout_Button();
        /*Verify that the delivery address is same address filled at the time registration of account*/
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
        
        /*Verify that the billing address is same address filled at the time registration of account*/
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
       

        
        /* Click 'Delete Account' button*/
        Main_Page.Delete_Account_Button();
        /*Verify 'ACCOUNT DELETED!' and click 'Continue' button*/
        boolean Deleted_Account_Displayed = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_Displayed, true,"the Deleted_Account_Displayed is not displayed");
        System.out.println("the Deleted_Account_Displayed is displayed ");
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 23 has done successfuly");
    }
    
//Test Case 24: Download Invoice after purchase order 
    @Epic("E-Commerce Application")
    @Feature("Checkout & Order Flow")
    @Story("Place an order while registering during checkout")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a user can add products to the cart, register during checkout, place an order, download invoice, and delete the account successfully.")
    @Test(priority = 1)
    public void TC24(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /*Add products to cart*/
        Main_Page.PRODUCTS_Button();
        boolean ALL_PRODUCTS_MASSAGE_Displayed = Product_Page.ALL_PRODUCTS_MASSAGE_Displayed();
        assertEquals(ALL_PRODUCTS_MASSAGE_Displayed, true,"The ALL PRODUCTS MASSAGE is not Displayed");
        System.out.println("The ALL PRODUCTS MASSAGE is Displayed");
        Product_Page.scroll_to_BibaProduct();
        Product_Page.VIEW_PRODUCT_1st_BUTTON();
        Product_Page.First_Product_AddTOCart_button();
        Product_Page.continue_shoping_button();
        /* Click 'Cart' button*/
        cart_page.CART_Button();
        /*Verify that cart page is displayed*/
        String title_cart_page = cart_page.get_title_cart_page();
        assertEquals(title_cart_page, "Automation Exercise - Checkout","the title_cart_page is not matched");
        System.out.println("the title_cart_page is matched");
        /*Click Proceed To Checkout*/
        cart_page.Proceed_To_Checkout_Button();
        /*Click 'Register / Login' button*/
        cart_page.Register_and_login_in_cartpage_button();
        
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");
        /*Fill all details in Signup and create account*/
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

        /*Verify 'ACCOUNT CREATED!' and click 'Continue' button*/
        boolean Account_created_displayed = SignUp_Page.Account_created_displayed();
        assertEquals(Account_created_displayed, true,"the Account Created charater is not displayed");
        System.out.println("Account Created is visable");
        
        Main_Page.contniue_created_button();
        /* Verify ' Logged in as username' at top*/
        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
        /*Click 'Cart' button*/
        cart_page.CART_Button();
        /*Review Your Order*/
        String name_product_cart_page = cart_page.get_name_product1_cart_page();
        assertEquals(name_product_cart_page, Name_Product1 ,"the NAME OF PRODUCT is not MATCHED");
        System.out.println("THE NAME OF PRODUCT is MATCHED");
        
        String price_product1_cart_page = cart_page.get_price_product1_cart_page();
        assertEquals(price_product1_cart_page, Price_Product1,"the price of product1 is not matched");
        System.out.println("the price in product1 is matched");
        
        String quantity_product1_cart_page = cart_page.get_Quantity_product1_cart_page();
        assertEquals(quantity_product1_cart_page, quantity_Product1,"the quantity of product1 is not matched");
        System.out.println("the quantity in product1 is matched");
        
        String TotalPrice_product1_cart_page = cart_page.get_TotalPrice_product1_cart_page();
        assertEquals(TotalPrice_product1_cart_page,TotalPrice_product1,"the TotalPrice of product1 is not matched");
        System.out.println("the TotalPrice in product1 is matched");
        
        /*Click 'Proceed To Checkout' button*/
        cart_page.Proceed_To_Checkout_Button();
        
        /*Verify Address Details*/
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
        
        /*Enter description in comment text area and click 'Place Order'*/
        cart_page.description_in_comment_text_area("I WANT THIS PRODUCT");
        cart_page.Place_Order_button();
        
        /*Enter payment details: Name on Card, Card Number, CVC, Expiration date*/
        cart_page.Name_on_Card("ABDALLAH");
        cart_page.Card_Number("123456789123456");
        cart_page.Card_cvc_Number("505");
        cart_page.month_Expiration_date("12");
        cart_page.year_Expiration_date("2027");
        Main_Page.ScrollToFooter();
        /*Click 'Pay and Confirm Order' button*/
        cart_page.Pay_and_Confirm_Order_button();
        /*Verify success message 'Your order has been placed successfully!'*/
        String Massage_Order_Is_Confirmed = cart_page.Massage_Order_Is_Confirmed();
        assertEquals(Massage_Order_Is_Confirmed,"Congratulations! Your order has been confirmed!","the Massage_Order_Is_Confirmed is not matched");
        System.out.println("the Massage_Order_Is_Confirmed is matched");
        
        //cart_page.Download_Invoice_Button();
        /*Click 'Download Invoice' button and verify invoice is downloaded successfully.*/
        boolean testFileDownload_Invoice = cart_page.testFileDownload_Invoice(File_Path,File_Name);
        assertEquals(testFileDownload_Invoice, true,"the file is not download");
        System.out.println("the file is download successfuly");
       /*Click 'Continue' button*/
        cart_page.Order_Confirmed_Continue_Button();
        /*Click 'Delete Account' button*/
        Main_Page.Delete_Account_Button();
        /*vVerify 'ACCOUNT DELETED!' and click 'Continue' button*/
        boolean Deleted_Account_Displayed = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_Displayed, true,"the Deleted_Account_Displayed is not displayed");
        System.out.println("the the Deleted_Account_Displayed is displayed");
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 24 is don successfuly");
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
    public void setUpMethod()  {
    
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
