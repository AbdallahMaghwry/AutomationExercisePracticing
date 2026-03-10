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
import net.bytebuddy.build.Plugin;
import org.testng.annotations.Ignore;


public class loginAndSignUp_TestsCase {

//THIS CLASS HAVE TEST CASE from number 1 to 7
    
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
    String UnCorrectPassword = "AAAAAAAAAA";
    
   String Name_File_to_Upload="l298n.png";
    
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
    @Feature("User Registration & Authentication")
    @Story("Register a new user account successfully")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.BLOCKER)
    @Description("This test verifies that a new user can sign up by filling account information and successfully create an account in the system.")
    @Test(priority = 0)
    public void TC0(){
        
     /* Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise" , "not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click on 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
       
        /*Verify 'New User Signup!' is visible*/
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");
        
        /* Enter name and email address*/
        Login_SignUp_Page.Send_Name_Signup(FirstName);
        Login_SignUp_Page.Send_Email_Signup(email_1);
       
        /*Click 'Signup' button*/
        Login_SignUp_Page.Signup_Button();
        
        /*Verify that 'ENTER ACCOUNT INFORMATION' is visible*/
        boolean Account_Information =SignUp_Page.Account_Information_displayed();
        assertEquals(Account_Information, true, "the Account Information charater is not displayed ");
        System.out.println("the New User Signup is displayed successfuly");
        
        /*
        Fill details: Title, Name, Email, Password, Date of birth
        Select checkbox 'Sign up for our newsletter!'
        Select checkbox 'Receive special offers from our partners!'
        Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        */
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
       
        /*Click 'Create Account button'*/
        SignUp_Page.Create_Account_Button();
        
        /*Verify that 'ACCOUNT CREATED!' is visible*/
        boolean Account_created_displayed = SignUp_Page.Account_created_displayed();
        assertEquals(Account_created_displayed, true,"the Account Created charater is not displayed");
        System.out.println("Account Created is visable");
        
        /*Click 'Continue' button*/
        Main_Page.contniue_created_button();
        
        /*Verify that 'Logged in as username' is visible*/
        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
    }

//Test Case 1: Register User
     @Epic("E-Commerce Application")
    @Feature("User Registration & Authentication")
    @Story("Register and delete a user account successfully")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a user can sign up, log in, and then delete their account successfully.")
    @Test(priority = 1) 
     public void TC1()
    {
        /* Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise" , "not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click on 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
       
        /*Verify 'New User Signup!' is visible*/
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");
        
        /* Enter name and email address*/
        Login_SignUp_Page.Send_Name_Signup(FirstName);
        Login_SignUp_Page.Send_Email_Signup(email_2);
       
        /*Click 'Signup' button*/
        Login_SignUp_Page.Signup_Button();
        
        /*Verify that 'ENTER ACCOUNT INFORMATION' is visible*/
        boolean Account_Information =SignUp_Page.Account_Information_displayed();
        assertEquals(Account_Information, true, "the Account Information charater is not displayed ");
        System.out.println("the New User Signup is displayed successfuly");
        
        /*
        Fill details: Title, Name, Email, Password, Date of birth
        Select checkbox 'Sign up for our newsletter!'
        Select checkbox 'Receive special offers from our partners!'
        Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        */
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
       
        /*Click 'Create Account button'*/
        SignUp_Page.Create_Account_Button();
        
        /*Verify that 'ACCOUNT CREATED!' is visible*/
        boolean Account_created_displayed = SignUp_Page.Account_created_displayed();
        assertEquals(Account_created_displayed, true,"the Account Created charater is not displayed");
        System.out.println("Account Created is visable");
        /*Click 'Continue' button*/
        Main_Page.contniue_created_button();
        
        /*Verify that 'Logged in as username' is visible*/
        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
        /*Click 'Delete Account' button*/
        Main_Page.Delete_Account_Button();
        
        /*Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button*/
        boolean Deleted_Account_massage = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_massage, true,"the account deleted is not displayed");
        System.out.println("account deleted successfuly");

        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 1 is done successfuly");
    }

//Test Case 2: Login User with correct email and password
    @Epic("E-Commerce Application")
    @Feature("User Authentication")
    @Story("Login with valid credentials and delete the account")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a user can log in with valid credentials and then delete their account successfully.")
    @Test(priority = 8)
    public void TC2()
    {
        /* Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        /*Click on 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
        
        /*Verify 'Login to your account' is visible*/
        boolean LOGIN_to_your_account = Login_SignUp_Page.LOGIN_to_your_account_DISPLAYED();
        assertEquals(LOGIN_to_your_account, true,"The LOGIN to your account charater is not displayed ");
        System.out.println("The LOGIN to your account charater is displayed successfuly ");
        /*Enter correct email address and password*/
        Login_SignUp_Page.Send_Login_Email(email_1);
        Login_SignUp_Page.Send_Login_password(password);
        
        /*Click 'login' button*/
        Login_SignUp_Page.Login_Button();
        
        /*Verify that 'Logged in as username' is visible*/
        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
        
        /*Click 'Delete Account' button*/
         Main_Page.Delete_Account_Button();
         
        /* Verify that 'ACCOUNT DELETED!' is visible*/
        boolean Deleted_Account_massage = Main_Page.Deleted_Account_Displayed();
        assertEquals(Deleted_Account_massage, true,"the account deleted is not displayed");
        System.out.println("account deleted successfuly");
        /*click 'Continue' button*/
        Main_Page.contniue_Deleted_button();
        System.out.println("the test case 2 is done successfuly");
        
        
    }

// Test Case 3: Login User with incorrect email and password  
    @Epic("E-Commerce Application")
    @Feature("User Authentication")
    @Story("Login with invalid credentials")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that the system shows an error message when the user tries to log in with invalid credentials.")
    @Test(priority = 3)
    public void TC3()
    {
        /* Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /*Click on 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
        
        /*Verify 'Login to your account' is visible*/
        boolean LOGIN_to_your_account = Login_SignUp_Page.LOGIN_to_your_account_DISPLAYED();
        assertEquals(LOGIN_to_your_account, true,"The LOGIN to your account charater is not displayed ");
        System.out.println("The LOGIN to your account charater is displayed successfuly ");
        
        /*Enter incorrect email address and password*/
        Login_SignUp_Page.Send_Login_Email(email_1);
        Login_SignUp_Page.Send_Login_password(UnCorrectPassword);
        
        /*Click 'login' button*/
        Login_SignUp_Page.Login_Button();
        
        /*Verify error 'Your email or password is incorrect!' is visible*/
        boolean Login_INVALID_INPUT = Login_SignUp_Page.Login_charater_INVALID_INPUT();
        assertEquals(Login_INVALID_INPUT, true,"the Login INVALID INPUT is not displayed");
        System.out.println("the Login INVALID INPUT is displayed successfuly");
        System.out.println("the test case 3 is done successfuly");
    }

// Test Case 4: Logout User 
    @Epic("E-Commerce Application")
    @Feature("User Authentication")
    @Story("Logout functionality")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that a logged-in user can successfully log out and is redirected to the login page.")
    @Test(priority = 4)
    public void TC4(){
       /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /* Click on 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
        /*Verify 'Login to your account' is visible*/
        boolean LOGIN_to_your_account = Login_SignUp_Page.LOGIN_to_your_account_DISPLAYED();
        assertEquals(LOGIN_to_your_account, true,"The LOGIN to your account charater is not displayed ");
        System.out.println("The LOGIN to your account charater is displayed successfuly ");
        /*Enter correct email address and password*/
        Login_SignUp_Page.Send_Login_Email(email_1);
        Login_SignUp_Page.Send_Login_password(password);
        
        /*Click 'login' button*/
        Login_SignUp_Page.Login_Button();
        
        /*Verify that 'Logged in as username' is visible*/
        boolean LogByUserName =  Main_Page.LoggedByUserName_Displayed();
        assertEquals(LogByUserName, true,"the Logged By User Name is not visable");
        System.out.println("Logged By User Name is visable");
        /*Click 'Logout' button*/
        Main_Page.LOGOUT_button();
        /*Verify that user is navigated to login page*/
        String GetCurrentURL = Main_Page.GetCurrentURL();
        assertEquals(GetCurrentURL, "https://automationexercise.com/login", "the current url is not matched");
        System.out.println("the Log OUT Process is done successfuly");
        System.out.println("the test case 4 is done successfuly");
    } 

// Test Case 5: Register User with existing email 
    @Epic("E-Commerce Application")
    @Feature("User Authentication")
    @Story("Signup with existing email")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that the system shows an error when a user tries to sign up with an already registered email address.")
    @Test(priority = 5)
    public void TC5(){
         /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /*Click on 'Signup / Login' button*/
        Main_Page.LoginSignUpButton();
        
       /* Verify 'New User Signup!' is visible*/
        boolean New_User_Signup =Login_SignUp_Page.New_User_Signup_Displayed();
        assertEquals(New_User_Signup, true, "the New User Signup chrarter is not displayed ");
        System.out.println("the New User Signup chararter is displayed successfuly");

        /*Enter name and already registered email address*/
        Login_SignUp_Page.Send_Name_Signup(FirstName);
        Login_SignUp_Page.Send_Email_Signup(email_1);

        /*Click 'Signup' button*/
        Login_SignUp_Page.Signup_Button();
        /*Verify error 'Email Address already exist!' is visible*/
        boolean Email_Exist = Login_SignUp_Page.Email_Exist_Displayed();
        assertEquals(Email_Exist, true,"the Email Exist is not displayed ");
        System.out.println("The Email Exist massage displayed successfuly");
        System.out.println("the test case 5 is done successfuly");
    } 

// Test Case 6: Contact Us Form  
     @Epic("E-Commerce Application")
    @Feature("Contact Us")
    @Story("User submits Contact Us form with file upload")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies that the user can successfully submit the Contact Us form with details and a file upload, and a success message is displayed.")
    @Test(priority = 6)
     public void TC6(){
         /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /*Click on 'Contact Us' button*/
        Main_Page.contactUs_button();

        // Verify 'GET IN TOUCH' is visible
        boolean GET_IT_TOUCH_Displayed = ContactUS_Page.GET_IT_TOUCH_Displayed();
        assertEquals(GET_IT_TOUCH_Displayed, true,"GET IT TOUCH massage is not Displayed");
        System.out.println("GET IT TOUCH massage is Displayed");
        
        /* Enter name, email, subject and message*/
        ContactUS_Page.Name_Contact(FirstName);
        ContactUS_Page.Email_Contact(email_1);
        ContactUS_Page.Subject_Contact("FILE UPLOAD TEST");
        ContactUS_Page.Massage_Contact("Final Project Edges");
      
        /*pload file*/
        ContactUS_Page.Upload_FILE_IN_CONTACT(Name_File_to_Upload);
        
        /*Click 'Submit' button*/
        ContactUS_Page.Submit_Contact();
        
        /*Click OK button*/
        ContactUS_Page.AcceptAlert_In_Contact_Page();
        
        
        //Verify success message 'Success! Your details have been submitted successfully.' is visible
        boolean massage_success_Contact = ContactUS_Page.massage_success_Contact();
        assertEquals(massage_success_Contact, true," Massage success is not Displayed");
        System.out.println("Massage Success is Displayed"); 
       
        /*Click 'Home' button */
        Main_Page.Home_button();
        
         /*Verify that home page is visible successfully*/
        String TitleMainPage_check2 = Main_Page.check_title_page();
        assertEquals(TitleMainPage_check2, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        
        System.out.println("the test case 6 is done successfuly");
    }

//Test Case 7: Verify Test Cases Page
    @Epic("E-Commerce Application")
    @Feature("Test Cases Page")
    @Story("User navigates to Test Cases page successfully")
    @Owner("Abdallah Mohammed")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that the user can successfully navigate to the Test Cases page from the home page.")
    @Test(priority = 7)
    public void TC7(){
         /*Verify that home page is visible successfully*/
        String TitleMainPage = Main_Page.check_title_page();
        assertEquals(TitleMainPage, "Automation Exercise","not match title main page so that should be Automation Exercise");
        System.out.println("The title main page is matched");
        /*Click on 'Test Cases' button*/
        Main_Page.TESTCASE_button();
        
        /*Verify user is navigated to test cases page successfully*/
        boolean TESTCASE_Massage_Displayed = Main_Page.TESTCASE_Massage_Displayed();
        assertEquals(TESTCASE_Massage_Displayed, true,"the massage test case is nt displayed");
        System.out.println("the massage test case is visable ");
        
        System.out.println("the test case 7 is done successfuly");
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
