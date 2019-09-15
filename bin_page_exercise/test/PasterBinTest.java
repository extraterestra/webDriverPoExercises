package pageobject_model.webDriverPoExercises.bin_page_exercise.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject_model.webDriverPoExercises.bin_page_exercise.page.SeleniumPasterBinPage;


// Use Selenium WebDriver, unit-test framework and Page Object. Automate next scenario:
//
//        Open https://pastebin.com Done
//        Create New Paste with next details:
//        * Code: "Hello from WebDriver"
//        * Paste Expiration: "10 Minutes"
//        * Paste Name / Title: "helloweb"

public class PasterBinTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun =  true)
    public void browserSetup(){
        driver = new ChromeDriver();
    }

    @Test(description = "Just a first run")
    public void someTestMethod(){

        String testResult= new SeleniumPasterBinPage(driver)
                .openPagePasteBin()
                .createNewPaste()
                .checkResult();

        Assert.assertEquals(testResult,"helloweb");
    }

    @AfterMethod(alwaysRun =  true)
    public void browserTearDown(){
        driver.quit();
        driver=null;
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by){
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
