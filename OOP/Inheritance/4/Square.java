
package javaapplication14;

public class Square extends Rectangle{

    public Square() {
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.width = side;
    }

    public void setLength(double side) {
        super.length = side;
    }

    @Override
    public String toString() {
        return "Square: "+"\n"+"Side = "+getSide();
    }
    
    
    
    
    
    
}
