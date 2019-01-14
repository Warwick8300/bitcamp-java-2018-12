package ch09;
public class Calculator3 {
  
  //아래 메서드들이 사용할 변수는 같은 클래스에 둔다.
  // => 클래스 맴버가 사용하는 경우 클래스 맴버로 만들어야 한다.
  int result = 0; // 인스턴스 필드  = 논 스태틱(no -static )필드
  
  static void plus(Calculator3 that, int a) {
    that.result += a;
  }
  static void minus(Calculator3 that, int a) {
    that.result -= a;
  }
  static void multiple(Calculator3 that, int a) {
    that.result *= a;
  }
  static void divide(Calculator3 that, int a) {
    that.result /= a;
  }

  
}
