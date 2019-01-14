package ch09;
// 인스턴스 필드의 등
public class Test05 {

  public static void main(String[] args) {
    
    Calculator3 c1 = new Calculator3();
    Calculator3 c2 = new Calculator3();
    
    
    Calculator3.plus(c1, 2);
    Calculator3.plus(c2, 6);
    
    Calculator3.multiple(c1, 3);
    Calculator3.divide(c2, 2);
    
    Calculator3.minus(c1, 2);
    Calculator3.plus(c2, 9);
    
    Calculator3.plus(c1,  7);
    
    System.out.println(c1.result);
    System.out.println(c2.result);
    
    Calculator2 c3 = new Calculator2();
    Calculator2 c4 = new Calculator2();
    
    c3.plus(2);
    c4.plus(6);
    
    
    
    
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
