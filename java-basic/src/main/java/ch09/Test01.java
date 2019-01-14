package ch09;
// 메서드가 사용하는 변수는 그 메서드가 있는 클래스에  두는 것이 좋다.
// 클래스 필드가 등장
public class Test01 {

  public static void main(String[] args) {
    // 계산하기

    int result = Calculator1.multiple(2, 3);
    result = Calculator1.minus(result, 2);
    result = Calculator1.plus(result, 7);
    System.out.println(result);
    
    //계산 
  }
}
