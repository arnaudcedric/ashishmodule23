package module9dataprovider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

/**
 * Created by acedric on 11/04/2017.
 */
public class Dataprovider_1 {

    @DataProvider
    public static Object[][] getData(Method m){

        Object[][] data = null;

        if (m.getName().equalsIgnoreCase("doLogin")){
            // Object[2] is the number of time it going to run
            //[3] is the data
            data = new Object[1][2];

            data[0][0] = "asouptalla@yahoo.com";
            data[0][1] = "Pepe0987654321";
//            data[0][2] = "Chrome";
            return data;
        }else if (m.getName().equalsIgnoreCase("doSomething1")){
            data = new Object[1][3];

            data[0][0] = "U2";
            data[0][1] = "P2";
            data[0][2] = "IE";
            return data;
        }
        return data;
    }
}
