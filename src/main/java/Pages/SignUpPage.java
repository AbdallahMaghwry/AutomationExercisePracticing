
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import EdgesFramework.SeleniumFrameWork; 
       

public class SignUpPage {

    
    SeleniumFrameWork FW_sub =new SeleniumFrameWork();

    public SignUpPage(SeleniumFrameWork FW) {
         this.FW_sub =FW;
        
    }
   
    
    private final By check_MR = By.xpath("//div[@id=\"uniform-id_gender1\"]");
    private final By check_MRS = By.xpath("//div[@id=\"uniform-id_gender2\"]");
    private final By password_signup = By.xpath("//div[@class=\"required form-group\"]/input[@type=\"password\"]");
    private final By birth_days = By.xpath("//div[@class=\"selector\"]/select[@id=\"days\"]");
    private final By birth_month = By.xpath("//div[@class=\"selector\"]/select[@id=\"months\"]");
    private final By birth_year = By.xpath("//div[@class=\"selector\"]/select[@id=\"years\"]");
    private final By checkbox_newsletter = By.xpath("//div[@class=\"checkbox\"]/div[@class=\"checker\"]/span/input[@id=\"newsletter\"]");
    private final By checkbox_partners = By.xpath("//div[@class=\"checkbox\"]/div[@id=\"uniform-optin\"]/span/input[@id=\"optin\"]");
    private final By FirstName = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"first_name\"]"); 
    private final By LastName = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"last_name\"]");  
    private final By Company = By.xpath("//p[@class=\"form-group\"]/input[@id=\"company\"]"); 
    private final By Address1 = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"address1\"]"); 
    private final By Address2 = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"address2\"]"); 
    private final By Country = By.xpath("//p[@class=\"required form-group\"]/select[@id=\"country\"]"); 
    private final By State = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"state\"]");
    private final By City = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"city\"]");
    private final By Zip_Code = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"zipcode\"]");
    private final By Mobile_Number = By.xpath("//p[@class=\"required form-group\"]/input[@id=\"mobile_number\"]");
    private final By Create_Account_Button = By.xpath("/html/body/section/div/div/div/div[1]/form/button");
    private final By Account_Created_charater = By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]/h2/b");
     private final By Account_Information_charater = By.xpath("//div[@class=\"login-form\"]/h2[@class=\"title text-center\"]/b");
    
    
    
    public void  check_MR(){
    FW_sub.Click(check_MR);
    }
    
    public void  check_MRS(){
     FW_sub.Click(check_MRS);
    }
    
    public void  password_signup(String password){
    FW_sub.SendKeys(password_signup, password);
    }
    
    public void birth_days(String value){
        
        FW_sub.SelectDropdownByValue(birth_days, value);
    }
    public void birth_month(String value){
        
        FW_sub.SelectDropdownByValue(birth_month, value);
    }
    
    public void birth_year(String value){
         FW_sub.SelectDropdownByValue(birth_year, value);
    } 
    
    public void  checkbox_newsletter(){
    
    FW_sub.CheckCheckbox(checkbox_newsletter);
    }
    
    public void  checkbox_partners(){
    
    FW_sub.CheckCheckbox(checkbox_partners);
    }
    
    public void  FirstName(String firstname){
    FW_sub.SendKeys(FirstName, firstname);
    }
    
    public void  LastName(String lastname){
    FW_sub.SendKeys(LastName, lastname);
    }
    
    public void  Company(String company){
    FW_sub.SendKeys(Company, company);
    }
    public void  Address1(String address1){
    FW_sub.SendKeys(Address1, address1);
    }
    
    public void  Address2 (String address2){
    FW_sub.SendKeys(Address2, address2);
    }
    public void  Country (int index){
      
        FW_sub.SelectDropdownByIndex(Country, index);
    }
    public void  State (String state){
    FW_sub.SendKeys(State, state);
    }
    public void  City (String city){
    FW_sub.SendKeys(City, city);
    }
    public void  Zip_Code (String zip_code){
    FW_sub.SendKeys(Zip_Code, zip_code);
    } 
    public void  Mobile_Number (String mobile_number){
    FW_sub.SendKeys(Mobile_Number, mobile_number);
    }
    public void  Create_Account_Button (){
    FW_sub.Click(Create_Account_Button);
    }
    public boolean Account_created_displayed(){
        boolean res = FW_sub.Element_is_displayed(Account_Created_charater);
        return res;
    }
    public boolean Account_Information_displayed(){
        boolean res = FW_sub.Element_is_displayed(Account_Information_charater);
        return res;
    }
























}
