/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackY;

public class B extends PackX.A{
    
    public B(double a, double b){
        super(a,b);
    }
    
    @Override
    public void compute(){
        if(getA()>getB()){
            System.out.println(getA());
        }
        else{
            System.out.println(getB());
        }
    }

}
