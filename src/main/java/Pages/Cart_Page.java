
package Pages;
import EdgesFramework.SeleniumFrameWork;

import org.openqa.selenium.By;

public class Cart_Page {
        

    public Cart_Page(SeleniumFrameWork FW) {
        this.FW_Cart_page=FW;
    }

     SeleniumFrameWork FW_Cart_page =new SeleniumFrameWork();   
    private final By  Cart_BUTTON = By.xpath("//div[@class=\"shop-menu pull-right\"]/ul[@class=\"nav navbar-nav\"]/li[3]/a");
    private final By  product_1st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]");
    private final By  product_2st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-2\"]");
    
    private final By  product_6st_Displayed_recommended = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-6\"]");

    
    private final By  Name_1st_product_inCart = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]/td[@class=\"cart_description\"]/h4/a[@href=\"/product_details/1\"]");
    private final By  Name_2st_product_inCart = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-2\"]/td[@class=\"cart_description\"]/h4/a[@href=\"/product_details/2\"]");

    
    
    private final By  price_1st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]/td[@class=\"cart_price\"]/p");
    private final By  price_2st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-2\"]/td[@class=\"cart_price\"]/p");
    
    private final By  Quantity_1st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]/td[@class=\"cart_quantity\"]/button[@class=\"disabled\"]");
    private final By  Quantity_2st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-2\"]/td[@class=\"cart_quantity\"]/button[@class=\"disabled\"]");
    
    private final By  TotalPrice_1st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]/td[@class=\"cart_total\"]/p[@class=\"cart_total_price\"]");
    private final By  TotalPrice_2st_Displayed = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-2\"]/td[@class=\"cart_total\"]/p[@class=\"cart_total_price\"]");
    
    private final By  Delete_product1_button = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]/td[@class=\"cart_delete\"]/a[@class=\"cart_quantity_delete\"]");
    private final By  Delete_product2_button = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-2\"]/td[@class=\"cart_delete\"]/a[@class=\"cart_quantity_delete\"]");
    private final By  Proceed_To_Checkout_Button = By.xpath("//section[@id=\"cart_items\"]/div[@class=\"container\"]/section[@id=\"do_action\"]/div[@class=\"container\"]/div[@class=\"row\"]/div[@class=\"col-sm-6\"]/a[@class=\"btn btn-default check_out\"]");

    
    //private final By  Verify_Quantity = By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[4]/button");
    //private final By  Delete_product_button = By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a");
    
    private final By  Products_inCart_displayed = By.xpath("//div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]");
    private final By  Verify_Name_Product_InCart = By.xpath("//div[@class=\"container\"]/div[@class=\"table-responsive cart_info\"]/table[@class=\"table table-condensed\"]/tbody/tr[@id=\"product-1\"]/td[@class=\"cart_description\"]/h4/a[@href=\"/product_details/1\"]");

    
    private final By NAME_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[2]");
    private final By Company_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[3]");
    private final By State_city_postcode_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[6]");
    private final By Country_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[7]");
    private final By NumberPhone_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[8]");
    private final By Adress1_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[4]");
    private final By Adress2_for_Your_delivery_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_delivery\"]/li[5]");

    private final By NAME_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[2]");
    private final By Company_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[3]");
    private final By State_city_postcode_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[6]");
    private final By Country_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[7]");
    private final By NumberPhone_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[8]");
    private final By Adress1_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[4]");
    private final By Adress2_for_Your_billing_address= By.xpath("//div[@class=\"col-xs-12 col-sm-6\"]/ul[@id=\"address_invoice\"]/li[5]");

    private final By description_in_comment_text_area = By.xpath("//div[@id=\"ordermsg\"]/textarea[@class=\"form-control\"]");
    private final By Place_Order_button = By.xpath("//div/a[@class=\"btn btn-default check_out\"]");
    private final By Name_on_Card = By.xpath("//div[@class=\"payment-information\"]/div[@class=\"row\"]/div[@class=\"col-md-4\"]/form[@action=\"/payment\"]/div[@class=\"form-row\"]/div[@class=\"col-sm-12 form-group\"]/input");
    private final By Card_Number = By.xpath("//div[@class=\"payment-information\"]/div[@class=\"row\"]/div[@class=\"col-md-4\"]/form[@action=\"/payment\"]/div[@class=\"form-row\"]/div[@class=\"col-sm-12 form-group card\"]/input");
    private final By Card_cvc_Number = By.xpath("//div[@class=\"payment-information\"]/div[@class=\"row\"]/div[@class=\"col-md-4\"]/form[@action=\"/payment\"]/div[@class=\"form-row\"]/div[@class=\"col-sm-4 form-group cvc\"]/input");
    private final By month_Expiration_date = By.xpath("//div[@class=\"payment-information\"]/div[@class=\"row\"]/div[@class=\"col-md-4\"]/form[@action=\"/payment\"]/div[@class=\"form-row\"]/div[@class=\"col-sm-4 form-group expiration\"]/input[@name=\"expiry_month\"]");
    private final By year_Expiration_date = By.xpath("//div[@class=\"payment-information\"]/div[@class=\"row\"]/div[@class=\"col-md-4\"]/form[@action=\"/payment\"]/div[@class=\"form-row\"]/div[@class=\"col-sm-4 form-group expiration\"]/input[@name=\"expiry_year\"]");
    private final By Pay_and_Confirm_Order_button = By.xpath("//div[@class=\"payment-information\"]/div[@class=\"row\"]/div[@class=\"col-md-4\"]/form[@id=\"payment-form\"]/div[@class=\"form-row\"]/div[@class=\"col-md-12 form-group\"]/button[@id=\"submit\"]");

    private final By view_cart_button_in_massage_Display = By.xpath("//div[@class=\"modal-body\"]/p[@class=\"text-center\"]/a[@href=\"/view_cart\"]");

    private final By Massage_Order_Is_Confirmed = By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]/p[@style=\"font-size: 20px; font-family: garamond;\"]");
    private final By Download_Invoice_Button = By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]/a[@class=\"btn btn-default check_out\"]");
    private final By Order_Confirmed_Continue_Button = By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]/div[@class=\"pull-right\"]/a[@class=\"btn btn-primary\"]");
    private final By Massage_Order_Is_Confirmed_successfuly = By.xpath("//div[@class=\"form-row\"]/div[@id=\"success_message\"]/div[@class=\"alert-success alert\"]");


    private final By Register_and_login_in_cartpage_button = By.xpath("//div[@class=\"modal-body\"]/p[@class=\"text-center\"]/a[@href=\"/login\"]");
    private final By verify_empty_cart = By.xpath("//span[@id=\"empty_cart\"]/p[@class=\"text-center\"]");

    
    public void view_cart_button_in_massage_Display() {
        FW_Cart_page.Click(view_cart_button_in_massage_Display);
        
    }
 public void CART_Button() {
        FW_Cart_page.Click(Cart_BUTTON);
        
    }
 public void Register_and_login_in_cartpage_button() {
        FW_Cart_page.Click(Register_and_login_in_cartpage_button);
        
    }
 public void Delete_product1_button() {
        FW_Cart_page.Click(Delete_product1_button);
    }
 public void Delete_product2_button() {
        FW_Cart_page.Click(Delete_product2_button);
    }
 public boolean product_1st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(product_1st_Displayed);
        return res;
    }
 public boolean product_6st_Displayed_recommended(){
        boolean res = FW_Cart_page.Element_is_displayed(product_6st_Displayed_recommended);
        return res;
    }
 public boolean product_2st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(product_2st_Displayed);
        return res;
    }
 public boolean price_1st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(price_1st_Displayed);
        return res;
    }
 public boolean price_2st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(price_2st_Displayed);
        return res;
    } 
  public boolean Quantity_1st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(Quantity_1st_Displayed);
        return res;
    } 
  public boolean Quantity_2st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(Quantity_2st_Displayed);
        return res;
    } 
  public boolean TotalPrice_1st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(TotalPrice_1st_Displayed);
        return res;
    } 
 public boolean TotalPrice_2st_Displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(TotalPrice_2st_Displayed);
        return res;
    } 
 
/*
 public String Verify_Quantity() {
       String res= FW_Cart_page.GetText(Verify_Quantity);
        return res;
    }
*/
public boolean Products_inCart_displayed(){
        boolean res = FW_Cart_page.Element_is_displayed(Products_inCart_displayed);
        return res;
    }
 
public void Proceed_To_Checkout_Button() {
        FW_Cart_page.Click(Proceed_To_Checkout_Button);
    }

public String Address1_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(Adress1_for_Your_delivery_address);
            return res;
 }
public String NAME_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(NAME_for_Your_delivery_address);
            return res;
 }
public String Company_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(Company_for_Your_delivery_address);
            return res;
 }
public String State_city_postcode_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(State_city_postcode_for_Your_delivery_address);
            return res;
 }
public String Country_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(Country_for_Your_delivery_address);
            return res;
 }
public String NumberPhone_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(NumberPhone_for_Your_delivery_address);
            return res;
 }

public String Address2_for_Your_delivery_address() {
            String res = FW_Cart_page.GetText(Adress2_for_Your_delivery_address);
            return res;
 }
public String Address1_Your_billing_address() {
            String res = FW_Cart_page.GetText(Adress1_for_Your_billing_address);
            return res;
 }
public String NAME_for_Your_billing_address() {
            String res = FW_Cart_page.GetText(NAME_for_Your_billing_address);
            return res;
 }
public String State_city_postcode_for_Your_billing_address() {
            String res = FW_Cart_page.GetText(State_city_postcode_for_Your_billing_address);
            return res;
 }
public String Company_for_Your_billing_address() {
            String res = FW_Cart_page.GetText(Company_for_Your_billing_address);
            return res;
 }
public String NumberPhone_for_Your_billing_address() {
            String res = FW_Cart_page.GetText(NumberPhone_for_Your_billing_address);
            return res;
 }



public String Country_for_Your_billing_address() {
            String res = FW_Cart_page.GetText(Country_for_Your_billing_address);
            return res;
 }
public String Address2_Your_billing_address() {
            String res = FW_Cart_page.GetText(Adress2_for_Your_billing_address);
            return res;
 }
public void description_in_comment_text_area(String text){
    FW_Cart_page.SendKeys(description_in_comment_text_area, text);
}
public void Place_Order_button() {
        FW_Cart_page.Click(Place_Order_button);
    }
public void Name_on_Card(String Name){
    FW_Cart_page.SendKeys(Name_on_Card, Name);
}
public void Card_Number(String Number){
    FW_Cart_page.SendKeys(Card_Number, Number);
}
public void Card_cvc_Number(String Number){
    FW_Cart_page.SendKeys(Card_cvc_Number, Number);
}
public void month_Expiration_date(String Number){
    FW_Cart_page.SendKeys(month_Expiration_date, Number);
}
public void year_Expiration_date(String Number){
    FW_Cart_page.SendKeys(year_Expiration_date, Number);
}
public void Pay_and_Confirm_Order_button() {
        FW_Cart_page.Click(Pay_and_Confirm_Order_button);
    }
public String Massage_Order_Is_Confirmed(){
        String res = FW_Cart_page.GetText(Massage_Order_Is_Confirmed);
        return res;
    }
public void Download_Invoice_Button() {
        FW_Cart_page.Click(Download_Invoice_Button);
    }

public void Order_Confirmed_Continue_Button() {
        FW_Cart_page.Click(Order_Confirmed_Continue_Button);
    }
public  String get_title_cart_page(){
            String PageTitle = FW_Cart_page.GetPageTitle();
            return PageTitle;
}
public  String get_name_product1_cart_page(){
            String name_product_cart_page = FW_Cart_page.GetText(Name_1st_product_inCart);
            return name_product_cart_page;
}
public  String get_name_product2_cart_page(){
            String name_product_cart_page = FW_Cart_page.GetText(Name_2st_product_inCart);
            return name_product_cart_page;
}

public  String get_price_product1_cart_page(){
            String get_price_1st_Displayed = FW_Cart_page.GetText(price_1st_Displayed);
            return get_price_1st_Displayed;
}
public  String get_price_product2_cart_page(){
            String get_price_1st_Displayed = FW_Cart_page.GetText(price_2st_Displayed);
            return get_price_1st_Displayed;
}


public  String get_Quantity_product1_cart_page(){
            String get_price_1st_Displayed = FW_Cart_page.GetText(Quantity_1st_Displayed);
            return get_price_1st_Displayed;
}
public  String get_Quantity_product2_cart_page(){
            String get_Quantity_1st_Displayed = FW_Cart_page.GetText(Quantity_2st_Displayed);
            return get_Quantity_1st_Displayed;
}

public  String get_TotalPrice_product1_cart_page(){
            String get_price_1st_Displayed = FW_Cart_page.GetText(TotalPrice_1st_Displayed);
            return get_price_1st_Displayed;
}
public  String get_TotalPrice_product2_cart_page(){
            String get_TotalPrice_1st_Displayed = FW_Cart_page.GetText(TotalPrice_2st_Displayed);
            return get_TotalPrice_1st_Displayed;
}


public boolean testFileDownload_Invoice(String File_Path , String Name_File)
{
        FW_Cart_page.Click(Download_Invoice_Button);
        return FW_Cart_page.Edges_isFileDownloaded(File_Path, Name_File);
}


 public boolean empty_cart_isDisplayed(){
        boolean res = FW_Cart_page.Element_is_displayed(verify_empty_cart);
        return res;
    }


 public String Verify_Name_Product_InCart() {
            String res = FW_Cart_page.GetText(Verify_Name_Product_InCart);
            return res;
 }
 
 
 
}
