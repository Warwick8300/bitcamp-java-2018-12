package ch09;
// 클래스 필드가 필요한 이유
public class Test03 {

  public static void main(String[] args) {
    // 계산하기
    Calculator2.plus(2);
    Calculator2.multiple(3);
    Calculator2.minus(2);
    Calculator2.plus(7);
    System.out.println(Calculator2.result);
    /*
    int result = Calculator1.multiple(2, 3);
    result = Calculator1.minus(result, 2);
    result = Calculator1.plus(result, 7);
    System.out.println(result);
    */
    //계산 
  }
}
