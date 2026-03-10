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
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;


public class SUBSCRIPTION_TestsCase {

//THIS CLASS HAVE TEST CASE from number 1 to 5
    
    SeleniumFrameWork FW= new SeleniumFrameWork();
   MainPage Main_Page;
    Login_And_Singup_Page Login_SignUp_Page;
    SignUpPage SignUp_Page;
    ContactUs ContactUS_Page;
    products Product_Page;
    Cart_Page cart_page;
    
    
    String email_1="abdallahm23122001@gmail.com";
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


//Test Case 10: Verify Subscription in home page
    @Epic("Home Page Features")
    @Feature("Subscription Section")
    @Story("User can subscribe with email from footer")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user can see Subscription section in footer, enter email, and get success message after subscribing.")
    @Test(priority = 0)
   public void TC10(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
       /*Scroll down to footer*/
        Main_Page.ScrollToFooter();
        /*Verify text 'SUBSCRIPTION'*/
        boolean Subscription_Massage = Main_Page.Subscription_Massage();
        assertEquals(Subscription_Massage, true , "the massage is not displayed");
        System.out.println("the massage is displayed");
        /*Enter email address in input and click arrow button*/
        Main_Page.Send_Email_Subscription(email_1);
        System.out.println("The email is send to text");
        Main_Page.Subscription_BUTTON();
        /*Verify success message 'You have been successfully subscribed!' is visible*/
        boolean Subscription_massage_displayed_when_send_email = Main_Page.Subscription_massage_displayed_when_send_email();
        assertEquals(Subscription_massage_displayed_when_send_email,true,"The Subscription_massage_displayed_when_send_email is not displayed ");
        System.out.println("The Subscription_massage_displayed_when_send_email is displayed ");
        
        System.out.println("the test case 10 has done successfuly");
        
    }
 
//Test Case 11: Verify Subscription in Cart page  
@Epic("Cart Page Features")
@Feature("Subscription Section")
@Story("User can subscribe with email from footer while in Cart page")
@Severity(SeverityLevel.CRITICAL)
@Description("Verify that user can go to Cart page, scroll to footer, see Subscription section, enter email, and get success message after subscribing.")
@Test(priority = 1)
    public void TC11(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
       
        /*Click 'Cart' button*/
        cart_page.CART_Button();
       
        /*Scroll down to footer*/
        Main_Page.ScrollToFooter();
        
        /*Verify text 'SUBSCRIPTION'*/
        boolean Subscription_Massage = Main_Page.Subscription_Massage();
        assertEquals(Subscription_Massage, true , "the massage is not displayed");
        System.out.println("the massage is displayed");
        
       /*Enter email address in input and click arrow button*/
        Main_Page.Send_Email_Subscription(email_1);
        System.out.println("The email is send to text");
        Main_Page.Subscription_BUTTON();
        
        /*Verify success message 'You have been successfully subscribed!' is visible*/
        boolean Subscription_massage_displayed_when_send_email = Main_Page.Subscription_massage_displayed_when_send_email();
        assertEquals(Subscription_massage_displayed_when_send_email,true,"The Subscription_massage_displayed_when_send_email is not displayed ");
        System.out.println("The Subscription_massage_displayed_when_send_email is displayed ");
        System.out.println("the test case 11 has done successfuly");
    } 
   
    

    
// Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality 
@Epic("Home Page Features")
@Feature("Scroll Functionality")
@Story("User can scroll down to footer and then scroll up using the arrow button")
@Severity(SeverityLevel.NORMAL)
@Description("Verify that user can scroll to footer, see Subscription section, then click Scroll Up button and see 'Full-Fledged practice website for Automation Engineers' text displayed.")
@Test(priority = 2)
    public void TC25(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Scroll down page to bottom*/
        Main_Page.ScrollToFooter();
        System.out.println("The Scroll to Footer is Done ");
        
        /*Verify 'SUBSCRIPTION' is visible*/
        boolean Subscription_Massage = Main_Page.Subscription_Massage();
        assertEquals(Subscription_Massage, true,"The Subscription_Massage is not displayed");
        System.out.println("The Subscription_Massage is displayed");
        
        /*Click on arrow at bottom right side to move upward*/
        Main_Page.scroll_up_button();
        System.out.println("The Scroll UP BUTTON is Clicked");
        
        /*Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen*/
        boolean Massage_Full_Fledged_practice_website_for_Automation_Engineers = Main_Page.Massage_Full_Fledged_practice_website_for_Automation_Engineers();
        assertEquals(Massage_Full_Fledged_practice_website_for_Automation_Engineers, true,"The Massage_Full_Fledged_practice_website_for_Automation_Engineers IS NOT DISPLAYED");
        System.out.println("The Massage_Full_Fledged_practice_website_for_Automation_Engineers IS DISPLAYED");
        System.out.println("the Test Case 25 is done successfuly");
    }
    
    
// Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality   
@Epic("Home Page Features")
@Feature("Scroll Functionality")
@Story("User can scroll down to footer and scroll back up using automatic scroll function")
@Severity(SeverityLevel.NORMAL)
@Description("Verify that user can scroll to footer, see Subscription section, then scroll back to top automatically and see 'Full-Fledged practice website for Automation Engineers' text displayed.")
@Test(priority = 3)
    public void TC26(){
        /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Scroll down page to bottom*/
        Main_Page.ScrollToFooter();
        System.out.println("The Scroll to Footer is Done ");
        /*Verify 'SUBSCRIPTION' is visible*/
        boolean Subscription_Massage = Main_Page.Subscription_Massage();
        assertEquals(Subscription_Massage, true,"The Subscription_Massage is not displayed");
        System.out.println("The Subscription_Massage is displayed");
        
        /*Scroll up page to top*/
        Main_Page.ScrollToUP();
        System.out.println("The Scroll UP is DONE");
        
        /*Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen*/
        boolean Massage_Full_Fledged_practice_website_for_Automation_Engineers = Main_Page.Massage_Full_Fledged_practice_website_for_Automation_Engineers();
        assertEquals(Massage_Full_Fledged_practice_website_for_Automation_Engineers, true,"The Massage_Full_Fledged_practice_website_for_Automation_Engineers IS NOT DISPLAYED");
        System.out.println("The Massage_Full_Fledged_practice_website_for_Automation_Engineers IS DISPLAYED");
        System.out.println("the Test Case 26 is done successfuly");
        
        
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
