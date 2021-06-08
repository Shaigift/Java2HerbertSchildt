package Lesson_8_Collections_Streams_Filters.RoboCallExamples;

import java.util.List;

/**
 *
 * @author MikeW
 */
public class RoboCallTest06 {
  
  public static void main(String[] args){ 

    List<Person> pl = Person.createShortList();
    
    System.out.println("\n=== Print List ===");
    pl.forEach(p -> System.out.println(p));
        
  }
}
