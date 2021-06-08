package Lesson_7_Generics_and_Collections.Generics;

public class CacheShirt {
    private Shirt shirt;
  
    public void add(Shirt shirt){
        this.shirt = shirt;
    }
  
    public Shirt get(){
        return this.shirt;
    }  
}
