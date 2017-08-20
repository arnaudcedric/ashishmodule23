package acceptanceTest;

import basetest.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LandingPageFacebook;
import pages.LaunchPageFacebook;
import pages.LoginPageFacebook;
import pages.ProfilePageFacebook;
import util.ExtentManager;

/**
 * Created by acedric on 24/06/2017.
 */
public class ProfileTestFacebook extends BaseTest {

    @Test
    public void testProfile(){

        reports = ExtentManager.getInstance();
        reports.startTest("Starting Test");
        openBrowser("chrome");
        LaunchPageFacebook launchPageFacebook = PageFactory.initElements(driver, LaunchPageFacebook.class);
        LoginPageFacebook loginPageFacebook = launchPageFacebook.goToFBHomePage();
        loginPageFacebook.verifyTitle("facebook");
        Object page = loginPageFacebook.doLogin("asouptalla@yahoo.com", "Pepe0987654321");

        if (page instanceof LoginPageFacebook)
            Assert.fail("Login failed");
        else if (page instanceof LandingPageFacebook)
            System.out.println("Login Passed");
            LandingPageFacebook landingPageFacebook = (LandingPageFacebook)page;
            ProfilePageFacebook profilePageFacebook = landingPageFacebook.goToProfilePage();
            profilePageFacebook.getTopMenu().goToSetting();


//        LaunchPageFacebook launchPageFacebook = new LaunchPageFacebook();
//        LoginPageFacebook loginPageFacebook = launchPageFacebook.goToFBHomePage();
//        LandingPageFacebook page = loginPageFacebook.doLogin("", "");
//        page.goToProfilePage();

        /*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acedric\\IdeaProjects\\Ashish\\src\\test\\java\\ashish\\chromedriver.exe");
        driver = new ChromeDriver();
        */




    }
}
