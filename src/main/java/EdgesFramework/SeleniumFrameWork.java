package EdgesFramework;

import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import org.testng.Assert;

public class SeleniumFrameWork {
    private static WebDriver driver;
    private static WebDriverWait explicitWait;
    private final int DEFAULT_TIMEOUT = 10;
   
   
    

    // Initialize the browser
    public void InitializeBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        System.out.println("Edges: Browser Initialized.");
    }

    // Browser implicitly wait
    public void ImplicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        System.out.println("Edges: Set Implicit Wait to " + seconds + " seconds.");
    }

    // Explicit wait for element presence
    public void ExplicitWait(By locator, int timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
        System.out.println("Edges: Explicit wait for presence of " + locator);
    }

    // Fluent wait for element visibility with customizable timeout and polling interval
public void FluentWait(By locator, int timeoutSeconds, int pollingMillis, String timeoutMessage) {
    Wait<WebDriver> fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(timeoutSeconds))
            .pollingEvery(Duration.ofMillis(pollingMillis))
            .withMessage(timeoutMessage)
            .ignoring(NoSuchElementException.class);

    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    System.out.println("Edges: Fluent wait found element " + locator);
}


    // Navigate to URL
    public void NavigateToURL(String url) {
        driver.get(url);
        System.out.println("Edges: Navigated to URL: " + url);
    }

    // Get page title
    public String GetPageTitle() {
        String title = driver.getTitle();
        System.out.println("Edges: Page title is '" + title + "'");
        return title;
    }

    // Get current URL
    public String GetCurrentURL() {
        String currentURL = driver.getCurrentUrl();
        System.out.println("Edges: Current URL is '" + currentURL + "'");
        return currentURL;
    }

    // Click element using explicit wait
    public void Click(By locator) {
        explicitWait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        System.out.println("Edges: Clicked element " + locator);
    }
     public void Clear(By locator) {
        explicitWait.until(ExpectedConditions.elementToBeClickable(locator)).clear();
        System.out.println("Edges: Cleared element " + locator);
    }

    // Right click (context click) on element
    public void RightClick(By locator) {
        WebElement element = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
        System.out.println("Edges: Right-clicked on element " + locator);
    }

    // Send keys to element
    public void SendKeys(By locator, String text) {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
        System.out.println("Edges: Sent keys to element " + locator);
    }

    // Get text from element
    public String GetText(By locator) {
        String text = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        System.out.println("Edges: Got text from element " + locator + ": " + text);
        return text;
    }

    // Dropdown handling by visible text
    public void SelectDropdownByVisibleText(By locator, String visibleText) {
        WebElement dropdown = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        select.selectByVisibleText(visibleText);
        System.out.println("Edges: Selected dropdown value by visible text: " + visibleText);
    }

    // Dropdown handling by value
    public void SelectDropdownByValue(By locator, String value) {
        WebElement dropdown = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        select.selectByValue(value);
        System.out.println("Edges: Selected dropdown value by value: " + value);
    }

    // Dropdown handling by index
    public void SelectDropdownByIndex(By locator, int index) {
        WebElement dropdown = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select select = new Select(dropdown);
        select.selectByIndex(index);
        System.out.println("Edges: Selected dropdown by index: " + index);
    }

    // Drag and drop element
    public void DragAndDrop(By sourceLocator, By targetLocator) {
        WebElement source = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(sourceLocator));
        WebElement target = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(targetLocator));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        System.out.println("Edges: Dragged element " + sourceLocator + " and dropped on " + targetLocator);
    }
    public boolean Element_is_displayed(By locator) {
         WebElement element = explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
        if (element.isDisplayed()) {
            
            System.out.println("the element is displayed " + locator);
            return true;
        } else {
            System.out.println("the element is not displayed " + locator);
            return false;
        }
    }

    // Checkbox handling: check checkbox
    public void CheckCheckbox(By locator) {
        WebElement checkbox = explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Edges: Checked the checkbox " + locator);
        } else {
            System.out.println("Edges: Checkbox already checked " + locator);
        }
    }

    // Checkbox handling: uncheck checkbox
    public void UncheckCheckbox(By locator) {
        WebElement checkbox = explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
        if (checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Edges: Unchecked the checkbox " + locator);
        } else {
            System.out.println("Edges: Checkbox already unchecked " + locator);
        }
    }

    // Radio button handling: select radio button
    public void SelectRadioButton(By locator) {
        WebElement radioButton = explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
        if (!radioButton.isSelected()) {
            radioButton.click();
            System.out.println("Edges: Selected radio button " + locator);
        } else {
            System.out.println("Edges: Radio button already selected " + locator);
        }
    }

    // Window handle: switch to window by title
    public void SwitchToWindowByTitle(String windowTitle) {
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            if (driver.getTitle().equals(windowTitle)) {
                System.out.println("Edges: Switched to window with title: " + windowTitle);
                return;
            }
        }

        driver.switchTo().window(currentWindow);
        System.out.println("Edges: Window with title '" + windowTitle + "' not found. Stayed in original window.");
    }

    // Window handle: switch to window by handle
    public void SwitchToWindowByHandle(String windowHandle) {
        Set<String> allWindows = driver.getWindowHandles();
        if (allWindows.contains(windowHandle)) {
            driver.switchTo().window(windowHandle);
            System.out.println("Edges: Switched to window handle: " + windowHandle);
        } else {
            System.out.println("Edges: Window handle " + windowHandle + " does not exist. No switch performed.");
        }
    }


    // Close current window
    public void CloseCurrentWindow() {
        driver.close();
        System.out.println("Edges: Closed current window.");
    }

    // Navigate back
    public void NavigateBack() {
        driver.navigate().back();
        System.out.println("Edges: Navigated back.");
    }

    // Navigate forward
    public void NavigateForward() {
        driver.navigate().forward();
        System.out.println("Edges: Navigated forward.");
    }

    // Refresh the page
    public void RefreshPage() {
        driver.navigate().refresh();
        System.out.println("Edges: Page refreshed.");
    }

    // Scroll to element using JavaScript
    public void ScrollToElement(By locator) {
        WebElement element = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       
        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
        System.out.println("Edges: Scrolled to element " + locator + " using Actions.scrollToElement().");
    }
      public void ScrollToElementBy(int x ,int y ) {
        
        Actions actions = new Actions(driver);
        actions.scrollByAmount(x, y).perform();
        System.out.println("Edges: Scrolled by  " + y +" "+ x + " using Actions.scrollToElement().");
    }
      public void HoverToElement(By locator) {
        WebElement element = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
       
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        System.out.println("Edges: Move to element " + locator + " using Actions.scrollToElement().");
    }

    // Handle alert: accept alert
    public void AcceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        System.out.println("Edges: Alert accepted.");
    }


    // Handle alert: dismiss alert
    public void DismissAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
        System.out.println("Edges: Alert dismissed.");
    }

    // Handle alert: get alert text
    public String GetAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        System.out.println("Edges: Alert text: " + text);
        return text;
    }

    public void SendTextToAlert(String text) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    alert.sendKeys(text);
    alert.accept();
    System.out.println("Edges: Sent text to alert and accepted it: " + text);
    }

    // Close the browser
    public void CloseBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Edges: Browser Closed.");
        }
    }
   

// Check if a file is downloaded in the given folder
    public boolean Edges_isFileDownloaded(String downloadPath, String fileName) {
    File file = new File(downloadPath + File.separator + fileName);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    boolean isDownloaded = wait.until((ExpectedCondition<Boolean>) wd -> file.exists());

    if (isDownloaded) {
        System.out.println("File downloaded successfully: " + fileName);
    } else {
        System.out.println("File not found: " + fileName);
    }

     return isDownloaded;
    }

    public static void verifySearchResults(String expectedKeyword) {
        // هات الكونتينر الكبير اللي فيه المنتجات
        WebElement container = driver.findElement(By.xpath("//div[@class='features_items']"));

        // هات كل أسماء المنتجات
        List<WebElement> productNames = container.findElements(By.xpath("//div[@class='productinfo text-center']/p"));

        int totalProducts = productNames.size();
        int matchedCount = 0;

        System.out.println("Total products found: " + totalProducts);

        // تشيك على كل اسم منتج
        for (WebElement product : productNames) {
            String name = product.getText().toLowerCase();

            if (name.contains(expectedKeyword.toLowerCase())) {
                matchedCount++;
                System.out.println("Matched product: " + name);
            } else {
                System.out.println("Not matched: " + name);
            }
        }

        System.out.println("Products matched with keyword '" + expectedKeyword + "': "
                + matchedCount + "/" + totalProducts);
    }
    
    public void uploadFile(By locator, String fileName) {
        // مسار المشروع (الروت الأساسي)
        String projectPath = System.getProperty("user.dir");

        // relative path
        String filePath = projectPath + "/src/test/photo/" + fileName;

        
        driver.findElement(locator).sendKeys(filePath);

        System.out.println("Uploaded file: " + filePath);
    }
    
    
    


}
