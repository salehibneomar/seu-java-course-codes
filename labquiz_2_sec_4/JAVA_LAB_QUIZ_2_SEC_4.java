
package java_lab_quiz_2_sec_4;
import java.util.*;

public class JAVA_LAB_QUIZ_2_SEC_4 {

    public static void main(String[] args) {
       
        
        Customer obj = new MobileBill("01611332774", 2, 5, "Saleh", "Dhaka");
        System.out.println(obj.Display());
        
        obj = new WaterBill("1234", 12, 5, "Saleh", "Dhaka");
        System.out.println(obj.Display());
        
        
    }
    
}
