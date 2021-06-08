/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2_Review;

/**
 *
 * @author anjali
 */
public class WhileLoop {
    
    public static void main(String args[]){
        
        int i = 0;
        int[] numbers = {100, 200, 300};
        
        while (i < numbers.length ){
            System.out.println("Number: " + numbers[i]);
            i++;
        }
        
    }
    
}

