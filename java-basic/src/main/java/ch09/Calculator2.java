package ch09;
public class Calculator2 {
  
  //아래 메서드들이 사용할 변수는 같은 클래스에 둔다.
  // => 클래스 맴버가 사용하는 경우 클래스 맴버로 만들어야 한다.
  static int result =0;
  
  static void plus(int a) {
    result += a;
  }
  static void minus(int a) {
    result -= a;
  }
  static void multiple(int a) {
    result *= a;
  }
  static void divide(int a) {
    result /= a;
  }

  
}
