
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import EdgesFramework.SeleniumFrameWork;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
public class MainPage {
   
    SeleniumFrameWork FW_main= new SeleniumFrameWork();
    
    public MainPage(SeleniumFrameWork FW) {
         this.FW_main =FW;
        
    }
    
    public void InitializeBrowser() {
      FW_main.InitializeBrowser();
      FW_main.NavigateToURL("https://automationexercise.com/");
              
    }
    public void Close_Browser() {
      FW_main.CloseBrowser();
              
    }
  
    private final By HomeButton  = By.xpath("//div[@class=\"shop-menu pull-right\"]/ul[@class=\"nav navbar-nav\"]/li[1]/a[@href=\"/\"]");
    private final By LoginSignUpButton  = By.xpath("//i[@class=\"fa fa-lock\"]");
    private final By Logged_By_UserName  = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a/i");
    private final By  Delete_Account_Button  = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a");
    private final By  Deleted_Account_charater  = By.xpath("/html/body/section/div/div/div/h2/b");
    private final By  contniue_Deleted_button  = By.xpath("/html/body/section/div/div/div/div/a");
    private final By  contniue_created_button  = By.xpath("/html/body/section/div/div/div/div/a");
    private final By  LOGOUT_button  = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    private final By  contactUs_button  = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a");
    private final By  TESTCASE_button  = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a");
    private final By  TESTCASE_Massage  = By.xpath("//div[@class=\"row\"]/div[@class=\"col-sm-9 col-sm-offset-1\"]/h2/b");
    private final By  PRODUCTS_Button = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a");
    private final By  MASSAGE_Footer_ToScroll_to_him = By.xpath("//footer/div[@class=\"footer-bottom\"]/div/div/p[@class=\"pull-left\"]");
    private final By  Subscription_Massage = By.xpath("//footer[@id=\"footer\"]/div[@class=\"footer-widget\"]/div[@class=\"container\"]/div[@class=\"row\"]/div[@class=\"col-sm-3 col-sm-offset-1\"]/div[@class=\"single-widget\"]/h2");
    private final By  Subscription_Email = By.xpath("//footer/div[@class=\"footer-widget\"]/div/div/div[@class=\"col-sm-3 col-sm-offset-1\"]/div/form/input[@type=\"email\"]");
    private final By  Subscription_BUTTON = By.xpath("//footer/div[@class=\"footer-widget\"]/div/div/div[@class=\"col-sm-3 col-sm-offset-1\"]/div/form/button[@type=\"submit\"]");
    private final By  Subscription_massage_displayed_when_send_email = By.cssSelector("div.alert-success.alert");
    private final By  Scroll_To_Subscription_Massage = By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/h2");
    private final By  Massage_Full_Fledged_practice_website_for_Automation_Engineers = By.xpath("//div[@class=\"item active\"]/div[@class=\"col-sm-6\"]/h2");
    private final By  scroll_up_button = By.xpath("//div[@class=\"item active\"]/div[@class=\"col-sm-6\"]/h2");

    
    private final By  Recommended_Items = By.cssSelector("div.recommended_items > h2.title.text-center");
    private final By  Product_6st_Recommended_Items = By.xpath("/html/body/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/a/i");

     private final By  product_1st_Displayed = By.xpath("//div[@class=\"features_items\"]/div[@class=\"col-sm-4\"]/div[@class=\"product-image-wrapper\"]/div[@class=\"single-products\"]/div[@class=\"productinfo text-center\"]/img[@src=\"/get_product_picture/1\"]");
    private final By  product_2st_Displayed = By.xpath("//div[@class=\"features_items\"]/div[@class=\"col-sm-4\"]/div[@class=\"product-image-wrapper\"]/div[@class=\"single-products\"]/div[@class=\"productinfo text-center\"]/img[@src=\"/get_product_picture/2\"]");
   
    public void LoginSignUpButton() {
        FW_main.Click(LoginSignUpButton);
    }
    public void contniue_created_button() {
        FW_main.Click(contniue_created_button);
    }
    public boolean LoggedByUserName_Displayed(){
        boolean res= FW_main.Element_is_displayed(Logged_By_UserName);
        return res;
    }
    public boolean Massage_Full_Fledged_practice_website_for_Automation_Engineers(){
        boolean res= FW_main.Element_is_displayed(Massage_Full_Fledged_practice_website_for_Automation_Engineers);
        return res;
    }
    public void ScrollToUP() {
        FW_main.ScrollToElement(Massage_Full_Fledged_practice_website_for_Automation_Engineers);
              
    }
    public void scroll_up_button() {
        FW_main.Click(scroll_up_button);
    }
    public void Delete_Account_Button() {
        FW_main.Click(Delete_Account_Button);
    }
    public boolean Deleted_Account_Displayed () {
    boolean res = FW_main.Element_is_displayed(Deleted_Account_charater);
    return res;
    }
    
    public void contniue_Deleted_button() {
        FW_main.Click(contniue_Deleted_button);
    }
    public void LOGOUT_button() {
        FW_main.Click(LOGOUT_button);
    }
    public void contactUs_button() {
        FW_main.Click(contactUs_button);
    }
    public void TESTCASE_button() {
        FW_main.Click(TESTCASE_button);
    }
   
    public boolean TESTCASE_Massage_Displayed () {
    boolean res = FW_main.Element_is_displayed(TESTCASE_Massage);
    return res;
    }
    public void PRODUCTS_Button() {
        FW_main.Click(PRODUCTS_Button);
    }
    public void ScrollToFooter() {
        FW_main.ScrollToElement(MASSAGE_Footer_ToScroll_to_him);
              
    }
   public void Scroll_To_Subscription_Massage() {
        FW_main.ScrollToElement(Subscription_Massage);
              
    }
    
    public boolean Subscription_Massage () {
    boolean res = FW_main.Element_is_displayed(Subscription_Massage);
    return res;
    }
     public void Scroll_To_Subscription_Massage_INPaymentMethod_InCart() {
        FW_main.ScrollToElement(Subscription_Massage);
              
    }
    
    public void Send_Email_Subscription(String Email){
        FW_main.SendKeys(Subscription_Email, Email);
    }
    
    public void Subscription_BUTTON() {
        FW_main.Click(Subscription_BUTTON);
    }
    public String check_title_page(){
        
        String TitleMainPage = FW_main.GetPageTitle();
        return TitleMainPage;
        
    }
    public String GetCurrentURL(){
        
       String GetCurrentURL = FW_main.GetCurrentURL();
        return GetCurrentURL;
        
    }
    public boolean Subscription_massage_displayed_when_send_email () {
    boolean res = FW_main.Element_is_displayed(Subscription_massage_displayed_when_send_email);
    return res;
    }
    
    public boolean Recommended_Items(){
        boolean res= FW_main.Element_is_displayed(Recommended_Items);
        return res;
    }
    public void Product_6st_Recommended_Items() {
        FW_main.Click(Product_6st_Recommended_Items);
    }
    public void Home_button() {
        FW_main.Click(HomeButton);
    }
    
}
