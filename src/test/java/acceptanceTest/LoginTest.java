package acceptanceTest;

import basetest.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import module9dataprovider.Dataprovider_1;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LaunchPageFacebook;
import pages.LoginPageFacebook;


/**
 * Created by acedric on 01/07/2017.
 */
public class LoginTest extends BaseTest {
    @Test(dataProviderClass = Dataprovider_1.class,dataProvider = "getData")
    public void doLogin(String email,String password){

        test = reports.startTest("Login test");
        test.log(LogStatus.INFO,"Opening ChromeBrowser");
        openBrowser("chrome");
        LaunchPageFacebook launchPageFacebook = new LaunchPageFacebook(driver,test);
        PageFactory.initElements(driver, launchPageFacebook);
        LoginPageFacebook loginPageFacebook = launchPageFacebook.goToFBHomePage();
        loginPageFacebook.verifyTitle("facebook");
        test.log(LogStatus.INFO,"Logging in");
        test.log(LogStatus.INFO,"email is  : "+email+ " and password is  : " + password);
        loginPageFacebook.doLogin(email, password);
        test.log(LogStatus.PASS,"login Passed");
        loginPageFacebook.takeScreenShot();
//        test.log(LogStatus.INFO,test.addScreenCapture("C:\\ashishmodule23\\src\\test\\java\\reports\\Sat_Jul_01_12_26_14_BST_2017.png"));

    }

    @AfterMethod
    public void quit() {
        // this is a must if you want report
        if (reports != null) {
            reports.endTest(test);
            reports.flush();
            tearDown();
        }
    }
}
