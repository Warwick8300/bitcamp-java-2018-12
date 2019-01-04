//참 거짓 논리
package ch02;

public class Test08 {
  public static void main(String[] args) {
    System.out.println(true);
    System.out.println(false);
//  System.out.println((Boolean)1); // 차바는 정수 값은 형변환할 수 없다.
    if('가'== 0xac00)// = 연산의 결과는 true / false 이다.
    {
      System.out.println("맞다");
    }else
      System.out.println("아니다");
    }
  /*컴파일 오류
    if(10-10) c언어에서는 0 가능 자바는 불가능
   */
  
}

