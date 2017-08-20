package pages;

import baseCommonFunctionForPage.BasePage;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.bcel.generic.LAND;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.FBConstant;

/**
 * Created by acedric on 24/06/2017.
 */
public class LoginPageFacebook extends BasePage {

    @FindBy(id = FBConstant.email)
    public WebElement email;

    @FindBy(id = FBConstant.pass)
    public WebElement password;

    @FindBy(id = FBConstant.loginButton)
    public WebElement loginButton;

    /*How to pass a list of element
    *    @FindAll({@FindBy(css = ".meeting-wrapper")})
    public List<WebElement> meetings;

    @FindAll({@FindBy(css = "div.notifications-wrapper div div")})
    public List<WebElement> allNotificationMsgs;
    *
    * */

    public LoginPageFacebook(WebDriver driver,ExtentTest test) {
        super(driver,test);
    }

    //how can a method have two return types
    // by changing the return type to object
    public Object doLogin(String email, String password){

            this.email.sendKeys(email);
            this.password.sendKeys(password);
            loginButton.click();

        boolean successfull = true;
        if(successfull) {
            LandingPageFacebook landingPageFacebook = new LandingPageFacebook(getDriver(),test);
            // below is to initialise what is in the landingpage
            PageFactory.initElements(getDriver(),landingPageFacebook);
            return landingPageFacebook;

        } else {
            LoginPageFacebook LoginPageFacebook = new LoginPageFacebook(getDriver(),test);
            PageFactory.initElements(getDriver(), LoginPageFacebook);
            return LoginPageFacebook;
        }
    }


}
