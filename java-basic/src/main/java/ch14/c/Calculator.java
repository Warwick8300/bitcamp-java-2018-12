package ch14.c;
//오버로딩 (overloading)- 같은 이름의 메서드를 정의할수 있다.
public class Calculator {
  int result;
  public void plus(int value) {
    this.result += value;
  }
  public void plus(int v1, int v2) {
    this.result += v1 + v2;
  }
  
  public void plus(int[] arr) {
    for(int value : arr) {
      result += value;
    }
  }
  public void minus(int value) {
    this.result  -= value;
  }
}
