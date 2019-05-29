
    public static void main(String[] args) {
        
        ArrayList<A> obj = new ArrayList<A>();
        A k;
        obj.add(new A(1, 2));
        k = obj.get(0);
        System.out.println(k.getA());
       
    }
	
	
public class A {
    private int a, b;
    A(){
        
    }
    
    A(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    
}