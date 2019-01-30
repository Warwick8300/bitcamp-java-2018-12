// 사용자 정의 예외 사용하
package ch21.e;

import java.io.PrintWriter;
import java.util.Scanner;

public class Test03 {


  public static void main(String[] args)throws Exception {
    Scanner key = null;
    


    try {
      key = new Scanner(System.in);
      System.out.println("값?");
      int a = Integer.parseInt(key.nextLine());
      int result = sum(a);
      System.out.println(result);
    } catch (Exception e) {
      // 외부 파일에 출력하기
      
        
      
      e.printStackTrace();

    }finally {
      key.close();
      
    }
    
    System.out.println("프로그램종료");
  }
  static int sum(int value) { // f(n) = n + f(n-1)
    if(value ==1)
      return 1;
    return value + sum(value -1);
  }

}



