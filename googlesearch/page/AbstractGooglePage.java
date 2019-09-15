package pageobject_model.webDriverPoExercises.googlesearch.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractGooglePage {

    protected WebDriver driver;

    protected abstract AbstractGooglePage openPage();

    protected final int WAIT_TIMEOUTS_INSECONDS = 10;

    protected AbstractGooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //https://cloud.google.com/
    }

}

