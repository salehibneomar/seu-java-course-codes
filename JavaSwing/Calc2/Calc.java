
package calc;

import java.awt.Color;

public class Calc {

    public static void main(String[] args) {
       
        UI obj = new UI();
        obj.setVisible(true);
        Color clr = new Color(69, 170, 242);
        obj.getContentPane().setBackground(clr);
        
    }
    
}
