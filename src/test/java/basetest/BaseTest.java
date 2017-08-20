package basetest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.ExtentManager;
import util.FBConstant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by acedric on 01/07/2017.
 */
public class BaseTest {

    public WebDriver driver;
    public ExtentReports reports = ExtentManager.getInstance();
    public ExtentTest test;

    public void openBrowser(String browserType){
        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", FBConstant.chromeBrowserExe);
            driver = new ChromeDriver(disableBrowserLevelNotification());
        }else if (browserType.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver,gecko.driver","C:\\Users\\acedric\\IdeaProjects\\Ashish\\src\\test\\java\\ashish\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }


    //http://learn-automation.com/disable-chrome-notifications-selenium-webdriver/
    public ChromeOptions disableBrowserLevelNotification(){
        // Create object of HashMap Class
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        // Set the notification setting it will override the default setting
        /*
            0- Default
            1- Allow
            2- Block
        */
        prefs.put("profile.default_content_setting_values.notifications", 2);
        // Create object of ChromeOption class
        ChromeOptions options = new ChromeOptions();
        // Set the experimental option
        options.setExperimentalOption("prefs", prefs);
        return options;
    }


    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
