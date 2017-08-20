import org.testng.annotations.Test;
import java.util.*;
/**
 * Created by acedric on 24/06/2017.
 */
public class Test2 {
//    String name;
    public void eat(){
        System.out.println("he is eating");
    }
    Date d = new Date();
    @Test
    public void testdate(){
        System.out.println(d.toString().replace(":","_").replace(" ","_"));
        System.out.println(System.getProperty("user.dir"));
    }

}
