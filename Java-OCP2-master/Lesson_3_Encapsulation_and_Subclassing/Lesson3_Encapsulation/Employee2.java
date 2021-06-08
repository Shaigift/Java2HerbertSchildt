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
public class Employee2 {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee2() {
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

   

    public int getEmpId() {
        return empId;
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
