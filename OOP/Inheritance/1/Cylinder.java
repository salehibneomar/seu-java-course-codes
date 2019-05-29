package javaapplication10;

public class Cylinder extends Circle{
    
    private double height = 1.0;

    public Cylinder() {
    }
    
    public Cylinder(double radius) {
       super(radius);
    }
    public Cylinder(double radius, double height) {
       super(radius);
       this.height=height;
    }
    
    public Cylinder(double radius, double height, String color) {
       super(radius, color);
       this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return ("Cylinder: "+"Color = "+getColor()+"\n"+"Radius = "+getRadius()+" Height = "+getHeight()+" Base area = "+String.format("%.2f",getArea())+" Volume = "+String.format("%.2f",getVolume()));
    }
    
    
    
}
