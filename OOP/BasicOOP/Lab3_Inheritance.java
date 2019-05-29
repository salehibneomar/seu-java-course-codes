/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_inheritance;

/**
 *
 * @author Sadman Sakib
 */
public class Lab3_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // *********** Parent-Child **********
//        Child child=new Child();
//        child.C();
//        child.P(); 
//        Parent parent=new Parent();
                
        // ********** OVERRIDING *******

        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();
    } 
}
