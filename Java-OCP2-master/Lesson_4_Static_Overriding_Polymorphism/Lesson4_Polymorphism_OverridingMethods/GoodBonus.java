/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Polymorphism_OverridingMethods;

/**
 *
 * @author anjali
 */
public class GoodBonus {
     /*
        public static double getBonusPercent(Employee e){
            if (e instanceof Manager) {
                return 0.03;
            }else if (e instanceof Director) {
                return 0.05;
            }else {
                return 0.01;
            }
   */
  public double calcBonus(Employee e){
    if (e instanceof Employee){
      return e.getSalary() * 0.01;
    }else if (e instanceof Engineer){
      return e.getSalary() * 0.02;
    }else if (e instanceof Manager){
      return e.getSalary() * 0.03;
    }else if (e instanceof Director){
      return e.getSalary() * 0.05;
    }else {
      return 0;
    } 
  }
}
