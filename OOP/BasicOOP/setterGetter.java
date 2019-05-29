public class ExampleClass {
    
    public String name;
    protected int age;
    private int NID;
    protected double income;
    
    void setInfo(String name, int age, int NID, double income){
        this.name = name;
        this.age = age;
        this.NID = NID;
        this.income = income;
    }
    
    String getInfo(){
        return (this.name+" "+this.age+" "+this.NID+" "+this.income);
    }
	
}


//Main
    public static void main(String[] args) {
       
        ExampleClass obj1 = new ExampleClass();
        obj1.setInfo("Saleh Ibne Omar", 22, 00000, 20.02);
        System.out.println(obj1.getInfo());
    }
	