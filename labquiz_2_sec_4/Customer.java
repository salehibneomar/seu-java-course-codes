
package java_lab_quiz_2_sec_4;

public abstract class Customer {
    private String Name, Address;

    public Customer(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
    
    public abstract int Calculate();
    public abstract String Display();
}
