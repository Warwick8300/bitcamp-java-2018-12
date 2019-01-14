package ch09;
// 클래스 필드의 한계
public class Test02 {

  public static void main(String[] args) {
    // 계산하기
    // 식1 )2 * 3 - 2 + 7 = ?
    // 식2 )6 / 2 + 8 = ?
    
    Calculator2 c2 = new Calculator2();
    
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
