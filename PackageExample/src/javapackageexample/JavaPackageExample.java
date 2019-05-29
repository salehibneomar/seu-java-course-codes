//Three types of package import
// 1.Using import.packageName.* 
//2.Using specified component name import.packageName.A; 
//3.Using fully qualified name in a class packageName.A obj = new packageName.A()
package javapackageexample;
import Package2.*;
import javapackageexample.innerPackAge.*;
public class JavaPackageExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.kkkk();
        
        Package3.A l = new Package3.A();
        l.print();
        
        Package3.A o = new Package3.A();
        o.print();
        l.print();
        
        innerPackClass ob = new innerPackClass();
        ob.kk();
    }
    
}
