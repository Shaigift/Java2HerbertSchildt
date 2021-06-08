package Lesson_7_Generics_and_Collections.Generics;

public class CacheAny <T>{
      
    private T t;
  
    public void add(T t){
        this.t = t;
    }
  
    public T get(){
        return this.t;
    }  
}
