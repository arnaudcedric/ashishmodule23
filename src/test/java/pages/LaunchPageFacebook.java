package pages;

import baseCommonFunctionForPage.BasePage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by acedric on 24/06/2017.
 */
public class LaunchPageFacebook extends BasePage {

    public LaunchPageFacebook(WebDriver driver,ExtentTest test) {
        super(driver,test);

    }

    public LoginPageFacebook goToFBHomePage(){
        test.log(LogStatus.INFO,"Openning the URL - ");
        getDriver().get("http://www.facebook.com");
        //driver.get(url)
        LoginPageFacebook loginPageFacebook = new LoginPageFacebook(getDriver(),test);
        // below is to initialise what is in the loginpage
        PageFactory.initElements(getDriver(),loginPageFacebook);
        return loginPageFacebook;
    }

}
