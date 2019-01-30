// 예외 던지기 - RuntimeException 예외 던지
package ch21.d;

import java.util.ArrayList;

public class Test07 {
  static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) {
    
    
   try {
      m3();
   }catch (RuntimeException e){
     System.out.println("오류 발생");
   }
    System.out.println("종료");

  }
  static void m3() {

    //
    m2();
  }
  static void m2() {
    //
    m1();
  }


  static void m1()   {
    throw new RuntimeException("m1에서 발생한 에외");
  }
}





