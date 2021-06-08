/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3_Encapsulation;

/**
 *
 * @author anjali
 */
public class Employee {


    public int empId;
    public String name;
    public String ssn;
    public  double salary;

    public Employee() {
    }

    public void changeName(String newName) {
          if (newName != null) {
              this.name = newName;
          }
     }
 
     public void raiseSalary(double increase) {
         this.salary += increase;
     } 

}

