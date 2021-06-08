/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Polymorphism_StaticExamples;

/**
 *
 * @author anjali
 */
import java.time.LocalDate;

public class StaticHelper {
    
    public static void printMessage(String message) {
        System.out.println("Messsage for " +
         LocalDate.now() + ": " + message);
    }
    
}
