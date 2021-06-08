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
import Lesson4_Polymorphism_Test.Foo2;

public class Bar2 extends Foo2 {
    private int sum = 10;
    private int result = 30;
    public void reportSum() {
        sum += result;
    }
}