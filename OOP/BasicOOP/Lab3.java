/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
/**
 *
 * @author SASK
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ***********BOX CLASS ********
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        /* assign different values to mybox2's
        instance variables */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        // display volume of first box
        mybox1.volume();
        // display volume of second box
        mybox2.volume();
        
        
        
        
        // ***********CALCULATOR CLASS ********
//        Calculator cal=new Calculator(2,3);
//        cal.add();
//        System.out.println("Result:"+cal.getResult());       
//        Calculator cal2=new Calculator(1,1);
//        cal2.add();
//        System.out.println("Result:"+cal2.getResult());
        
        
        
        // **********Method Overload ***********
//        OverloadDemo ob = new OverloadDemo();
//        double result;
//        // call all versions of test()
//        ob.test();
//        ob.test(10);
//        ob.test(10, 20);
//        result = ob.test(123.25);
//        System.out.println("Result of ob.test(123.25): " + result);
       
    }
    
}
