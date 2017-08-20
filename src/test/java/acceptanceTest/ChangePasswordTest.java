package acceptanceTest;

import basetest.BaseTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jdk.nashorn.internal.runtime.options.LoggingOption;
import org.testng.annotations.AfterMethod;

/**
 * Created by acedric on 01/07/2017.
 */
public class ChangePasswordTest extends BaseTest {

        public void changePasswordTest(){

            test = reports.startTest("Change Password test");
            test.log(LogStatus.INFO,"Starting test");

            test.log(LogStatus.FAIL,"Test fail");

        }

        @AfterMethod
        public void quit(){
            if (reports!=null){
                reports.endTest(test);
                reports.flush();
            }
    }

}
