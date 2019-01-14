package ch09;



// 인스턴스 매서드의 등장
public class Test06 {

  public static void main(String[] args) {
    
    Calculator4 c1 = new Calculator4();
    Calculator4 c2 = new Calculator4();
    
    
    c1.plus(2);
    c2.plus(6);
    
    c1.multiple(3);
    c2.divide(2);
    
    c1.minus(2);
    c2.plus(9);
    
    c1.plus(7);
    
    System.out.println(c1.result);
    System.out.println(c2.result);
   
    
    Calculator4 c4 = null;
    c4.plus(3);
    
    /*
    int result1 = Calculator1.multiple(2, 3);
    int result2 = Calculator1.divide(6, 2);
    result1 = Calculator1.minus(result1, 2);
    result1 = Calculator1.plus(result1, 7);
    System.out.println(result1);
    System.out.println(result2);장
    */
    
  }
}
