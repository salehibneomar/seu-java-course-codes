
package javaapplication13;

public class Square extends Rectangle{
    
    Square(){
        
    }
    
    Square(double width, double length, String color, boolean filled){
        super(width, length, color, filled);
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setWidth(double width){
        super.setLength(width);
    }
    
    public void setLength(double length){
        super.setLength(length);
    }
    
    public double getArea(){
        return getSide()*getSide();
    }
    
    public String toString(){
        return "Rectangle: "+" color= "+getColor()+" Area= "+getArea()+" Side = "+getSide();
    }
}
