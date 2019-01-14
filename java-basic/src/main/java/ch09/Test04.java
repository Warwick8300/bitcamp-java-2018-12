package ch09;
// 클래스 필드가 필요한 이유
public class Test04 {

  public static void main(String[] args) {
    
    int result1 = Calculator1.multiple(2, 3);
    int result2 = Calculator1.divide(6, 2);
    result1 = Calculator1.minus(result1, 2);
    result1 = Calculator1.plus(result1, 7);
    System.out.println(result1);
    System.out.println(result2);
    
    
  }
}
