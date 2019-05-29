
package moveable;
import java.util.*;

public class MoveAble {
    public static void main(String[] args) {
        
        System.out.println("Point Moving");
        intMoveable moveable = new point(2, 2, 2, 1);
        System.out.println(moveable.toString());
        moveable.moveLeft();
        moveable.moveDown();
        System.out.println(moveable.toString());
        
        System.out.println("Circle Moving");
        moveable = new circleMove(2, 2, 2, 1,5);
        System.out.println(moveable.toString());
        moveable.moveLeft();
        moveable.moveDown();
        System.out.println(moveable.toString());
        
    }
    
}
