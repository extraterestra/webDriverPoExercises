package pageobject_model.webDriverPoExercises.bin_page_exercise.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPasterBinPage {

    private String NEW_PASTE_URL = "https://pastebin.com";
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='header_new_paste']")
    private WebElement addNewPasteButton;

    @FindBy(xpath = "//*[@id='paste_code']")
    private WebElement codeField;

    @FindBy(xpath = "//*[@id='select2-paste_expire_date-h9-container']")
    private WebElement expirationField;

    @FindBy(xpath = "//*[@id='myform']/div[3]/div[5]/div[2]/input")
    private WebElement pasteTitleField;

    @FindBy(xpath = "//*[@id='submit']")
    private WebElement createNewPasteButton;

    @FindBy(xpath = "//*[@id='content_left']/div[2]/div[3]/div[1]/h1")
    private WebElement resultTitle;

    @FindBy(xpath = "//*[@id='select2-paste_expire_date-be-container']")
    private WebElement expirationDropdown;


    public SeleniumPasterBinPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SeleniumPasterBinPage openPagePasteBin(){
        driver.get(NEW_PASTE_URL);
//        new WebDriverWait(driver, 10)
//               .until(CustomConditions.jQueryAJAXsCompleted());
        return this;
    }

    public String  checkResult(){
        String result = resultTitle.getText();
        return result;
    }

    public SeleniumPasterBinPage createNewPaste() {
        addNewPasteButton.click();
        codeField.sendKeys("Hello from WebDriver");
        pasteTitleField.sendKeys("helloweb");
        createNewPasteButton.click();
        //should be modified
        return this;
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by){
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
