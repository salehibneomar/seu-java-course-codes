
package javaapplication13;

public class JavaApplication13 {

    public static void main(String[] args) {
       
        Shape obj = new Circle(2.2, "Blue", true);
        System.out.println(obj.toString());
        obj = new Rectangle(2.1, 2.3, "Green", true);
        System.out.println(obj.toString());
        obj = new Square(2.1, 2.3, "Pink", true);
        System.out.println(obj.toString());
    }
    
}
