
package javaapplication14;

public class Rectangle extends Shape{
    protected double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return (width*length);
    }
    
    @Override
    public double getPerimeter(){
        return (2*(length+width));
    }
    
    public String toString(){
        return "Rectangle: "+"\n"+"Area = "+String.format("%.2f",getArea())+" Perimeter = "+String.format("%.2f",getPerimeter());
    }
}
