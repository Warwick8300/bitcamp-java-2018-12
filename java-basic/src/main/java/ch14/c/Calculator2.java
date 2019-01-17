package ch14.c;
//오버로딩 (overloading)-
//상속 받은 메서드와 같은 이름의 메서드를 추가로 정의하는 것도 오버로딩이다
public class Calculator2  extends Calculator{

  public void minus(int a, int b) {
    this.result -= (a + b);
  }
  
  //
}
