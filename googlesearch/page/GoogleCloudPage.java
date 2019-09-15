package pageobject_model.webDriverPoExercises.googlesearch.page;

import org.openqa.selenium.WebDriver;

public class GoogleCloudPage extends AbstractGooglePage{

    public GoogleCloudPage(WebDriver driver) {
        super(driver);
    }

    //


    @Override
    protected AbstractGooglePage openPage (){
        throw new RuntimeException("RuntimeException text");
    }
}
