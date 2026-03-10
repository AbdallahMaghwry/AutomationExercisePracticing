
package Pages;
import EdgesFramework.SeleniumFrameWork;

import org.openqa.selenium.By;


public class ContactUs {
   
    private final By GET_IT_TOUCH_Massage=By.xpath("//div[@class=\"contact-form\"]/h2");
    private final By Name_Contact =By.xpath("//div[@id=\"form-section\"]/form[@id=\"contact-us-form\"]/div/input[@name=\"name\"]");
    private final By Email_Contact =By.xpath("//div[@id=\"form-section\"]/form[@id=\"contact-us-form\"]/div/input[@name=\"email\"]");
    private final By Subject_Contact =By.xpath("//div[@class=\"form-group col-md-12\"]/input[@name=\"subject\"]");
    private final By Massage_Contact =By.xpath("//div[@class=\"form-group col-md-12\"]/textarea[@name=\"message\"]");
    private final By Upload_Contact =By.xpath("//div[@id=\"form-section\"]/form[@id=\"contact-us-form\"]/div/input[@name=\"upload_file\"]");
    private final By Submit_Contact =By.xpath("//div[@id=\"form-section\"]/form[@id=\"contact-us-form\"]/div/input[@name=\"submit\"]");
    private final By massage_success_Contact =By.xpath("//div[@class=\"col-sm-8\"]/div[@class=\"contact-form\"]/div[@class=\"status alert alert-success\"]");
    
    SeleniumFrameWork FW_contact = new SeleniumFrameWork();
    
    public ContactUs(SeleniumFrameWork FW) {
         this.FW_contact =FW;
        
    }
    
    public boolean GET_IT_TOUCH_Displayed(){
        boolean res = FW_contact.Element_is_displayed(GET_IT_TOUCH_Massage);
        return res;
    }
    public void Name_Contact(String name)
    {
        FW_contact.SendKeys(Name_Contact, name);
    }
    public void Email_Contact(String Email)
    {
        FW_contact.SendKeys(Email_Contact, Email);
    }
    public void Subject_Contact(String Subject)
    {
        FW_contact.SendKeys(Subject_Contact, Subject);
    }
    public void Massage_Contact(String massage)
    {
        FW_contact.SendKeys(Massage_Contact, massage);
    }
    public void Submit_Contact()
    {
        FW_contact.Click(Submit_Contact);
    }
    public void Upload_Contact(String path)
    {
        FW_contact.SendKeys(Upload_Contact, path);
    }
        public boolean massage_success_Contact(){
        boolean res = FW_contact.Element_is_displayed(massage_success_Contact);
        return res;
    }
     public void AcceptAlert_In_Contact_Page()
    {
        FW_contact.AcceptAlert();
    }   
    public void Upload_FILE_IN_CONTACT(String Name_File)
    {
        FW_contact.uploadFile(Upload_Contact, Name_File);
    }    
    
}
