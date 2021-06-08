package Lesson5_Abstract_Nested_Classes_Final;

public class MethodChildClass extends MethodParentClass {    
    // compile time error
    public void printMessage() {
        System.out.println("Cannot override method");
    }
}