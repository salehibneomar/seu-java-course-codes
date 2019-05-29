
package labquiz_2_sio;
import java.util.*;

public class LABQUIZ_2_SIO {

    public static void main(String[] args) {
        
        Footballer obj = new Attacker(20, 5, "KK", "BD", 10, 22);
        obj.setRating(obj.impact());
        System.out.println("Name: "+obj.name+" Rating: "+obj.rating);
        obj = new Defender(21, 10, 5, "LL", "BD", 21, 24);
        obj.setRating(obj.impact());
        System.out.println("Name: "+obj.name+" Rating: "+obj.rating); 
        
    }
    
}
