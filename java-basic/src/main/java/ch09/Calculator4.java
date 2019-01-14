package ch09;
public class Calculator4 {
  
  //아래 메서드들이 사용할 변수는 같은 클래스에 둔다.
  // => 클래스 맴버가 사용하는 경우 클래스 맴버로 만들어야 한다.
   int result =0;
  
   void plus(int a) {
     //생략가능
    this.result += a;
  }
   void minus(int a) {
    result -= a;
  }
   void multiple(int a) {
    result *= a;
  }
   void divide(int a) {
    result /= a;
  }

  
}
