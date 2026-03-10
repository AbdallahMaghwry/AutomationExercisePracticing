
package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import EdgesFramework.SeleniumFrameWork;

public class Login_And_Singup_Page {
    
    SeleniumFrameWork FW_login_signup_page =new SeleniumFrameWork();
  
  public Login_And_Singup_Page(SeleniumFrameWork FW) {
         this.FW_login_signup_page =FW;
        
    }  
    
    private final By New_User_Signup_charater=By.xpath("//div[@class=\"signup-form\"]/h2");
    private final By EMAIL_EXIST=By.xpath("/html/body/section/div/div/div[3]/div/form/p");
    private final By SIGNUP_EMAIL=By.xpath("//div[@class=\"signup-form\"]/form[@action=\"/signup\"]/input[@type=\"email\"]");
    private final By SIGNUP_NAME=By.xpath("//div[@class=\"signup-form\"]/form[@action=\"/signup\"]/input[@type=\"text\"]");
    private final By SIGNUP_BUTTON=By.xpath("//div[@class=\"signup-form\"]/form[@action=\"/signup\"]/button[@type=\"submit\"]");
   
    private final By LOGIN_to_your_account_charater=By.xpath("//div[@class=\"col-sm-4 col-sm-offset-1\"]/div[@class=\"login-form\"]/h2");
    private final By LOGIN_EMAIL=By.xpath("//div[@class=\"col-sm-4 col-sm-offset-1\"]/div[@class=\"login-form\"]/form[@action=\"/login\"]/input[@type=\"email\"]");
    private final By LOGIN_PASSWORD=By.xpath("//div[@class=\"col-sm-4 col-sm-offset-1\"]/div[@class=\"login-form\"]/form[@action=\"/login\"]/input[@type=\"password\"]");
    private final By LOGIN_BUTTON=By.xpath("//div[@class=\"col-sm-4 col-sm-offset-1\"]/div[@class=\"login-form\"]/form[@action=\"/login\"]/button[@type=\"submit\"]");
    private final By LOGIN_INVALID_EMAIL_OR_PASSWORD=By.xpath("//div[@class=\"col-sm-4 col-sm-offset-1\"]/div[@class=\"login-form\"]/form[@action=\"/login\"]/p[@style=\"color: red;\"]");

      

    public void Send_Login_Email(String email)
    {
        FW_login_signup_page.SendKeys(LOGIN_EMAIL, email);
    }
    public void Send_Login_password(String password)
    {
       FW_login_signup_page.SendKeys(LOGIN_PASSWORD, password);
    }
    public void Login_Button()
    {
       FW_login_signup_page.Click(LOGIN_BUTTON);
    }
    
    public boolean Login_charater_INVALID_INPUT()
    {
        
       boolean res=  FW_login_signup_page.Element_is_displayed(LOGIN_INVALID_EMAIL_OR_PASSWORD);
       return res;
    }
    public void Login_charater()
    {
        
        FW_login_signup_page.GetText(LOGIN_to_your_account_charater);
    }
    public boolean LOGIN_to_your_account_DISPLAYED()
    {
       
        boolean LOGIN_to_your_account = FW_login_signup_page.Element_is_displayed(LOGIN_to_your_account_charater);
        return LOGIN_to_your_account;
    }
///////////////////////////////////////////////////////////////////////////////////////////////
//for signup
    
    public void Send_Name_Signup(String name) {
       FW_login_signup_page.SendKeys(SIGNUP_NAME, name);
    }
  public void Send_Email_Signup(String email) {
        FW_login_signup_page.SendKeys(SIGNUP_EMAIL, email);
    }
    public void Signup_Button() {
        FW_login_signup_page.Click(SIGNUP_BUTTON);
    }
    public boolean New_User_Signup_Displayed(){
     boolean New_User_Signup = FW_login_signup_page.Element_is_displayed(New_User_Signup_charater);
        return New_User_Signup;
        
    }
      public boolean Email_Exist_Displayed(){
     boolean Email_Exist = FW_login_signup_page.Element_is_displayed(EMAIL_EXIST);
        return Email_Exist;
        
    }

}
