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
public class BadManager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BadManager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);
      deptName = dept;
    }

/*
    @Override
    private String getDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
*/
    //DIFFERENCE IS THE PUBLIC AND PRIVATE ACCESS MODIFIERS
    
    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
}
