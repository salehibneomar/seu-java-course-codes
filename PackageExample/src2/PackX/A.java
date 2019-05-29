/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackX;

/**
 *
 * @author Saleh
 */
public abstract class A {
    private double a, b;
    public A(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    public abstract void compute();
}
