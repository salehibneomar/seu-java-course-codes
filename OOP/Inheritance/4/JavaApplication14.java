
package javaapplication14;
import java.util.*;
public class JavaApplication14 {

    public static void main(String[] args) {
        
        Shape obj = new Circle(2.2, "YELLO", true);
        System.out.println(obj.toString());
        System.out.print("\n");
        obj = new Rectangle(2.1, 1.6, "BLUE", false);
        System.out.println(obj.toString());
        System.out.print("\n");
        obj = new Triangle(2.1, 1.6, 0.7, "BLUE", false);
        System.out.println(obj.toString());
        System.out.print("\n");
        obj = new Square(2.0, "BLUE", false);
        System.out.println(obj.toString());
        System.out.print("\n");
        
        
    }
    
}
