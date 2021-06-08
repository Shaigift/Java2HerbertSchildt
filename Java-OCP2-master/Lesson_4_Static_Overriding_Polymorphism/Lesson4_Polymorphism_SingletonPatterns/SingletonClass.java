/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Polymorphism_SingletonPatterns;

/**
 *
 * @author anjali
 */

public class SingletonClass {
    private static final SingletonClass instance =
            new SingletonClass();
    
    private SingletonClass() {}
    
    public static SingletonClass getInstance() {
        return instance;
    }   
}