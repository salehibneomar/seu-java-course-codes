
package javaapplication14;

public class Triangle extends Shape{
    protected double width, height, base;

    public Triangle() {
    }

    public Triangle(double width, double height, double base) {
        this.width = width;
        this.height = height;
        this.base = base;
    }

    public Triangle(double width, double height, double base, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
        this.base = base;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double getArea(){
        return (0.5*(height*base));
    }
    
    @Override
    public double getPerimeter(){
        return (width+base+height);
    }
    
    public String toString(){
        return "Triangle: "+"\n"+"Area = "+String.format("%.2f",getArea())+" Perimeter = "+String.format("%.2f",getPerimeter());
    }
}
