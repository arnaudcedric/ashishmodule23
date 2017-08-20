package baseCommonFunctionForPage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.steadystate.css.util.Output;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by acedric on 01/07/2017.
 */
public class BasePage {
    public WebDriver getDriver() {
        return driver;
    }
    private WebDriver driver;
    private TopMenu topMenu;
    public ExtentTest test;
    public TopMenu getTopMenu() {
        return topMenu;
    }
    public BasePage(WebDriver driver,ExtentTest test) {
        this.driver = driver;
        this.test = test;
        topMenu = PageFactory.initElements(driver,TopMenu.class);
    }

    public String verifyTitle(String Title){
        return "";
    }

    public String verifyText(String locator,String expectedText){
        return "";
    }

    public boolean isElementPresent(){
        return false;
    }

    public void takeScreenShot(){

        Date d = new Date();
        String screenShotFile=d.toString().replace(":","_").replace(" ","_")+".png";
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File("C:\\ashishmodule23\\src\\test\\java\\reports\\"+screenShotFile));
        }catch (IOException e){
            e.printStackTrace();
        }
        test.log(LogStatus.INFO,test.addScreenCapture("C:\\ashishmodule23\\src\\test\\java\\reports\\"+screenShotFile));
//        test.log(LogStatus.INFO,test.addScreenCapture("C:\\ashishmodule23\\src\\test\\java\\reports\\img.png"));
//        test.log(LogStatus.INFO,test.addScreenCapture("http://localhost:63342/ashishmodule23/src/test/java/reports/img.png"));
    }

}
