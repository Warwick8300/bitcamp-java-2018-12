package ch19.h;
//Lambda 문법 - 람다 문법 파라미터2
public class Test05 {
  
  //functional interface
  static interface Calculator{
    int compute(int a,int b);
  }

  public static void main(String[] args) {
      

    Calculator c1 = (a,b) ->{return a + b;}; 
    System.out.println(c1.compute(10, 20));
    
    Calculator c2 = (a,b) ->  a - b; 
    System.out.println(c2.compute(10, 20));
 
    Calculator c3 = (a,b) ->  Math.max(a, b); 
    System.out.println(c3.compute(10, 20));
 
    /*
    Calculator c4 = (a,b) ->  System.out.println(a + "," + b);; 
    System.out.println(c4.compute(10, 20));
 */
        
        
        
        
  }
 
}
