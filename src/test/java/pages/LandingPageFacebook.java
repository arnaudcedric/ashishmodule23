package pages;

import baseCommonFunctionForPage.BasePage;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by acedric on 24/06/2017.
 */
public class LandingPageFacebook extends BasePage {
    ExtentTest test;
    @FindBy(className = "_2s25")
    @CacheLookup
    public WebElement profileLink;

    public LandingPageFacebook(WebDriver driver,ExtentTest test) {
        super(driver,test);
    }

    public ProfilePageFacebook goToProfilePage(){

        profileLink.click();
        return PageFactory.initElements(getDriver(),ProfilePageFacebook.class);

    }

    public void verifyprofile(){

    }
}
