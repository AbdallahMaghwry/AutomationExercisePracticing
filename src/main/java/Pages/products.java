
package Pages;
import EdgesFramework.SeleniumFrameWork;

import org.openqa.selenium.By;

public class products {
    SeleniumFrameWork FW_PRODUCT = new SeleniumFrameWork();

    public products(SeleniumFrameWork FW) {
         this.FW_PRODUCT =FW;
        
    }

    private final By Hover_product1 =By.xpath("//div[@class=\"productinfo text-center\"]/img[@src=\"/get_product_picture/1\"]");
    private final By OverLAY_AddtoCART_product1 =By.xpath("//div[@class=\"product-overlay\"]/div[@class=\"overlay-content\"]/a[@data-product-id=\"1\"]");
    private final By scroll_to_BibaProduct =By.cssSelector("a[href=\"/brand_products/Biba\"]");

    private final By Hover_product2 =By.xpath("//div[@class=\"productinfo text-center\"]/img[@src=\"/get_product_picture/2\"]");
    private final By OverLAY_AddtoCART_product2 =By.xpath("//div[@class=\"product-overlay\"]/div[@class=\"overlay-content\"]/a[@data-product-id=\"2\"]");

    
    private final By ALL_PRODUCTS_MASSAGE =By.xpath("//div[@class=\"col-sm-9 padding-right\"]/div/h2");
    private final By PRODUCTS_LIST =By.xpath("//div[@class=\"col-sm-9 padding-right\"]");
    //problam in xpath --> VIEW_PRODUCT_1st
    private final By VIEW_PRODUCT_1st =By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    private final By VIEW_PRODUCT_2st =By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a");
    private final By NAME_PRODUCT_1st =By.xpath("//div[@class=\"product-details\"]/div[@class=\"col-sm-7\"]/div[@class=\"product-information\"]/h2");
    private final By CATEGORY_PRODUCT_1st =By.xpath("//div[@class=\"product-details\"]/div[@class=\"col-sm-7\"]/div[@class=\"product-information\"]/P[1]");
    private final By Availability_PRODUCT_1st =By.xpath("//div[@class=\"product-details\"]/div[@class=\"col-sm-7\"]/div[@class=\"product-information\"]/P[2]/b");
    private final By Condition_PRODUCT_1st =By.xpath("//div[@class=\"product-details\"]/div[@class=\"col-sm-7\"]/div[@class=\"product-information\"]/P[3]/b");
    private final By Brand_PRODUCT_1st =By.xpath("//div[@class=\"product-details\"]/div[@class=\"col-sm-7\"]/div[@class=\"product-information\"]/P[4]/b");
    private final By Search_Product =By.xpath("//div[@class=\"container\"]/input[@type=\"text\"]");
    private final By Search_Button =By.xpath("//div[@class=\"container\"]/button[@type=\"button\"]");
    private final By Searched_product_massage=By.xpath("//div[@class=\"col-sm-9 padding-right\"]/div/h2");
    private final By Searched_product_visable=By.xpath("//div[@class=\"features_items\"]/div[@class=\"col-sm-4\"]/div[@class=\"product-image-wrapper\"]/div[@class=\"single-products\"]/div[@class=\"productinfo text-center\"]/p");
    

    
    private final By Product_AddTOCart_button_InProductPage=By.xpath("//div[@class=\"product-information\"]/span/button[@type=\"button\"]");
    //private final By Second_Product_AddTOCart_button=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    private final By continue_shoping_button=By.xpath("//div[@id=\"cartModal\"]/div[@class=\"modal-dialog modal-confirm\"]/div[@class=\"modal-content\"]/div[@class=\"modal-footer\"]/button[@class=\"btn btn-success close-modal btn-block\"]");
  

    private final By Quantity_product_number=By.xpath("//div[@class=\"product-details\"]/div[@class=\"col-sm-7\"]/div[@class=\"product-information\"]/span/input[@name=\"quantity\"]");
  
    private final By Women_category =By.xpath("//a[@href=\"#Women\"]/span[@class=\"badge pull-right\"]");
    private final By Women_category_dress =By.xpath("//div[@id=\"Women\"]/div[@class=\"panel-body\"]/ul/li[1]/a[@href=\"/category_products/1\"]");
    private final By Women_Dress_Products_massage =By.xpath("//div[@class=\"features_items\"]/h2[@class=\"title text-center\"]");
   
    private final By Man_category_InWomanCategoryPage =By.xpath("//h4[@class=\"panel-title\"]/a[@href=\"#Men\"]/span[@class=\"badge pull-right\"]");
    private final By Man_category_Tshirts =By.xpath("//div[@id=\"Men\"]/div[@class=\"panel-body\"]/ul/li[1]/a[@href=\"/category_products/3\"]");
    private final By Man_Tshirts_Products_massage =By.xpath("//div[@class=\"features_items\"]/h2[@class=\"title text-center\"]");

    private final By Brand_List =By.xpath("//div[@class=\"left-sidebar\"]/div[@class=\"brands_products\"]");
    private final By Brand_POLO =By.xpath("//div[@class=\"left-sidebar\"]/div[@class=\"brands_products\"]/div[@class=\"brands-name\"]/ul[@class=\"nav nav-pills nav-stacked\"]/li[1]/a[@href=\"/brand_products/Polo\"]");
    private final By Brand_H_AND_M =By.xpath("//div[@class=\"left-sidebar\"]/div[@class=\"brands_products\"]/div[@class=\"brands-name\"]/ul[@class=\"nav nav-pills nav-stacked\"]/li[2]/a[@href=\"/brand_products/H&M\"]");

    private final By Brand_POLO_PRODUCTS_MASSAGE =By.xpath("//div[@class=\"features_items\"]/h2[@class=\"title text-center\"]");
    private final By Brand_H_AND_M_PRODUCTS_MASSAGE =By.xpath("//div[@class=\"features_items\"]/h2[@class=\"title text-center\"]");

    private final By NAME_FOR_REVIEW =By.xpath("//form[@id=\"review-form\"]/span/input[@id=\"name\"]");
    private final By EMAIL_FOR_REVIEW =By.xpath("//form[@id=\"review-form\"]/span/input[@id=\"email\"]");
    private final By TEXT_FOR_REVIEW =By.xpath("//form[@id=\"review-form\"]/textarea[@name=\"review\"]");
    private final By SUBMIT_FOR_REVIEW =By.xpath("//form[@id=\"review-form\"]/button[@id=\"button-review\"]");
    private final By MASSAGE_THANK_FOR_REVIEW =By.xpath("//form[@id=\"review-form\"]/div[@id=\"review-section\"]/div[@class=\"col-md-12 form-group\"]/div[@class=\"alert-success alert\"]/span[@style=\"font-size: 20px;\"]");
    private final By Write_your_review_MASSAGE =By.xpath("//div[@class=\"col-sm-12\"]/ul[@class=\"nav nav-tabs\"]/li[@class=\"active\"]/a[@href=\"#reviews\"]");


     public void Quantity_product_number(String num)
    {
        FW_PRODUCT.Clear(Quantity_product_number);
        FW_PRODUCT.SendKeys(Quantity_product_number,num);
    }
    public boolean ALL_PRODUCTS_MASSAGE_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(ALL_PRODUCTS_MASSAGE);
        return res;
    }
    public boolean PRODUCTS_LIST_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(PRODUCTS_LIST);
        return res;
    }
    public void VIEW_PRODUCT_1st_BUTTON()
    {
        FW_PRODUCT.Click(VIEW_PRODUCT_1st);
    }
    public void VIEW_PRODUCT_2st_BUTTON()
    {
        FW_PRODUCT.Click(VIEW_PRODUCT_2st);
    }
    public boolean NAME_PRODUCT_1st_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(NAME_PRODUCT_1st);
        return res;
    }
    public boolean CATEGORY_PRODUCT_1st_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(CATEGORY_PRODUCT_1st);
        return res;
    }
    public boolean Availability_PRODUCT_1st_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(Availability_PRODUCT_1st);
        return res;
    }
    public boolean Condition_PRODUCT_1st_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(Condition_PRODUCT_1st);
        return res;
    }
    public boolean Brand_PRODUCT_1st_Displayed(){
        boolean res = FW_PRODUCT.Element_is_displayed(Brand_PRODUCT_1st);
        return res;
    }
    public void Search_Product(String name){
        FW_PRODUCT.SendKeys(Search_Product, name);
    }
    
    public void Search_Button()
    {
        FW_PRODUCT.Click(Search_Button);
    }
    
    public boolean Searched_product_massage(){
        boolean res = FW_PRODUCT.Element_is_displayed(Searched_product_massage);
        return res;
    }
    public String Searched_product_visable(){
        String res = FW_PRODUCT.GetText(Searched_product_visable);
        return res;
    }
     public void First_Product_AddTOCart_button()
    {
        FW_PRODUCT.Click(Product_AddTOCart_button_InProductPage);
    }
    
       public void continue_shoping_button_1st()
    {
        FW_PRODUCT.Click(continue_shoping_button);
    }
     public void Women_category()
    {
        FW_PRODUCT.Click(Women_category);
    }   
     public void Women_category_dress()
    {
        FW_PRODUCT.Click(Women_category_dress);
    }   
    public String Women_Dress_Products_massage(){
        String res = FW_PRODUCT.GetText(Women_Dress_Products_massage);
        return res;
    }  
    public void Man_category_InWomanCategoryPage()
    {
        FW_PRODUCT.Click(Man_category_InWomanCategoryPage);
    }   
     public void Man_category_Tshirts()
    {
        FW_PRODUCT.Click(Man_category_Tshirts);
    }   
    public String Man_Tshirts_Products_massage(){
        String res = FW_PRODUCT.GetText(Man_Tshirts_Products_massage);
        return res;
    }  
    public boolean Brand_List(){
        boolean res = FW_PRODUCT.Element_is_displayed(Brand_List);
        return res;
    }   
    public void Brand_POLO()
    {
        FW_PRODUCT.Click(Brand_POLO);
    }    
    public void Brand_H_AND_M()
    {
        FW_PRODUCT.Click(Brand_H_AND_M);
    }  
    public String Brand_POLO_PRODUCTS_MASSAGE(){
        String res = FW_PRODUCT.GetText(Brand_POLO_PRODUCTS_MASSAGE);
        return res;
    }
    public String Brand_H_AND_M_PRODUCTS_MASSAGE(){
        String res = FW_PRODUCT.GetText(Brand_H_AND_M_PRODUCTS_MASSAGE);
        return res;
    }

 public void NAME_FOR_REVIEW(String num)
    {
        
        FW_PRODUCT.SendKeys(NAME_FOR_REVIEW,num);
    }
public void EMAIL_FOR_REVIEW(String num)
    {
        
        FW_PRODUCT.SendKeys(EMAIL_FOR_REVIEW,num);
    }
public void TEXT_FOR_REVIEW(String num)
    {
        
        FW_PRODUCT.SendKeys(TEXT_FOR_REVIEW,num);
    }
public void SUBMIT_FOR_REVIEW()
    {
        
        FW_PRODUCT.Click(SUBMIT_FOR_REVIEW);
    }
public boolean MASSAGE_THANK_FOR_REVIEW(){
        boolean res = FW_PRODUCT.Element_is_displayed(MASSAGE_THANK_FOR_REVIEW);
        return res;
    }
public boolean Write_your_review_MASSAGE(){
        boolean res = FW_PRODUCT.Element_is_displayed(Write_your_review_MASSAGE);
        return res;
    }
public void Hover_product1(){
       FW_PRODUCT.HoverToElement(Hover_product1);
       FW_PRODUCT.Click(OverLAY_AddtoCART_product1);
    }
public void scroll_to_BibaProduct()
    {
FW_PRODUCT.ScrollToElement(scroll_to_BibaProduct);
    }
public void scroll_to_POLOProduct()
    {
FW_PRODUCT.ScrollToElement(Brand_POLO);
    }
public void Hover_product2(){
       FW_PRODUCT.HoverToElement(Hover_product2);
       FW_PRODUCT.Click(OverLAY_AddtoCART_product2);
    }
public void continue_shoping_button()
    {
        FW_PRODUCT.Click(continue_shoping_button);
    }

public void verify_product(String expectedKeyword){
    FW_PRODUCT.verifySearchResults(expectedKeyword);
    
}




}
