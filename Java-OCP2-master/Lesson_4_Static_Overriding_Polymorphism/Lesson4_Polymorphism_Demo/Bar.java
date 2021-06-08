/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Polymorphism_Demo;

/**
 *
 * @author anjali
 */
import Lesson4_Polymorphism_Test.Foo;

public class Bar extends Foo {
    private int sum = 10;
    public void reportSum() {
        sum += result;
        sum += value;  
        // compiler error
        //result is protected, but the num dont have any modifier so takes 
        //default which is not accessable in another package.
        
    }
}
