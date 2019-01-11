package ch08.util;
//계산 기능과 관련된 메서드를 별도의 블록으로 분리하는 문법이 클래스이다.
public class Calculator2 {
  public static int plus (int a, int b) {
    return a + b;
  }
  public static int minus(int a, int b) {
    return a - b;
  }
  public static int multiple(int a, int b) {
    return a * b;
  }
  public static int divide(int a, int b) {
    return a / b;
  }
  
  static int abs(int a) {
    /*
    if(a >= 0)
      return a;
    else
      return a*-1;
  */
    return (a >= 0) ? a : a * -1;
  }
  /*간단하게 테스트 할때 이런식으로 한다 
  public static void main(String[] args) {
    System.out.println(abs(100));
    System.out.println(abs(-100));
  }
  */
  
}
