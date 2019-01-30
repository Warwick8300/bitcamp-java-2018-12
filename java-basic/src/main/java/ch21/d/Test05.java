// 예외 던지기 - Exception 예외 던지
package ch21.d;

import java.util.ArrayList;

public class Test05 {
  static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) {
    
    
    try {
      m3();
    } catch (Exception e) {
      // TODO 자동 생성된 catch 블록
      e.printStackTrace();
    }
    System.out.println("종료");

  }
  static void m3() throws Exception {

    //
    m2();
  }
  static void m2() throws Exception {

    //
    m1();
  }


  static void m1() throws Exception {
    throw new Exception("m1에서 발생한 에외");
  }
}





