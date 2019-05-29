
package javaapplication14;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return (Math.PI)*(radius*radius);
    }
    
    @Override
    public double getPerimeter(){
        return (2*Math.PI*radius);
    }

    public String toString(){
        return "Circle: "+"\n"+"Area = "+String.format("%.2f",getArea())+" Perimeter = "+String.format("%.2f",getPerimeter());
    }
    
}
