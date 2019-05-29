
package java_lab_quiz_2_sec_4;

public class MobileBill extends Customer{
    
     String number;
     int cost, hour;

    public MobileBill(String number, int cost, int hour, String Name, String Address) {
        super(Name, Address);
        this.number = number;
        this.cost = cost;
        this.hour = hour;
    }
    
    @Override
    public int Calculate(){
        return ((hour*60)*cost);
    }
    
    @Override
    public String Display(){
        return "Name: "+getName()+", Address: "+getAddress()+", Mobile Number: "+number+", Cost: "+Calculate();
    }
    
    
}
