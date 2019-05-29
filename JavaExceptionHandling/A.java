/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastring;

/**
 *
 * @author Saleh
 */
public class A {
    int k=10;
    
    public void kk(int a)throws Error{
        if(a<10){
            throw new Error("NOPE");
        }
    }
    
    public void pp()throws ArithmeticException{
        int k=10;
        System.out.println(k/0);
    }
}
