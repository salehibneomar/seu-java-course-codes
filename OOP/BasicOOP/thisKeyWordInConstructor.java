public class ExampleClass {
    
    ExampleClass(){
        System.out.println("Constructor with no para.");
    }
    
    ExampleClass(int i){
        this(); //Calling the constructor with no parameter
        System.out.println("Constructor with para.");
    }
    
}