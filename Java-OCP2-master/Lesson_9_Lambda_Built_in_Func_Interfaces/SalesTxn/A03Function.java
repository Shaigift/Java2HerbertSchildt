package Lesson_9_Lambda_Built_in_Func_Interfaces.SalesTxn;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author MikeW
 */
public class A03Function {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    Function<SalesTxn, String> buyerFunction = 
        t -> t.getBuyerName();
    
    System.out.println("\n== First Buyer");
    System.out.println(buyerFunction.apply(first));      
  }
}