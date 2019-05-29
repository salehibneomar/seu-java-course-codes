/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author SASK
 */
public class Calculator {
    private int num1;
    private int num2;
    int result;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void add(){
        result=num1+num2;
    }

    public int getResult() {
        return result;
    }
    
    
}
