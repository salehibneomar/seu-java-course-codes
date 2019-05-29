package java_ui;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class JAVA_UI {
    public static void main(String[] args) {
        
        UI obj = new UI();
        obj.setVisible(true);
        Color clr = new Color(232, 232, 232);
        obj.getContentPane().setBackground(clr);
        obj.setResizable(false);
    }
    
}
