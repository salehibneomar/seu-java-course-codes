
package java_lab_quiz_2_sec_4;

public class WaterBill extends Customer{
    
     String number;
     int waterCost, Unit;

    public WaterBill(String number, int waterCost, int Unit, String Name, String Address) {
        super(Name, Address);
        this.number = number;
        this.waterCost = waterCost;
        this.Unit = Unit;
    }
    
    @Override
    public int Calculate(){
        return Unit*waterCost;
    }
    
    @Override
    public String Display(){
        return "Name: "+getName()+", Address: "+getAddress()+", Mobile Number: "+number+", Cost: "+Calculate();
    }
    
    
}
