

package Lesson5_Abstract_Nested_Classes_Example_Inner;


public class OuterClass {
     private int privInt = 10;
 
  
 public void createInnerClass() {

 InnerClass inClass = new InnerClass();
 inClass.accessOuter();
 }
 

 class InnerClass {  
   
  public void accessOuter() {

  System.out.println("The outer class's privInt is " + privInt);

  } 

 }

}
