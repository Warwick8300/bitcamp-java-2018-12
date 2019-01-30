// try-with-resources 문법 사용 후
package ch21.f;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class Test02 {


  public static void main(String[] args){


    try(Scanner key = new Scanner(System.in);) {

      System.out.println("값?");
      int a = Integer.parseInt(key.nextLine());
      int result = sum(a);
      System.out.println(result);
    } catch (Exception e) {
      // 외부 파일에 출력하기
      try ( StringWriter out = new StringWriter();
          PrintWriter out2= new PrintWriter(out);){
        e.printStackTrace(out2);
        String str  = out.toString();
        System.out.println(str);
      } catch (IOException e2) {
        e2.printStackTrace();
      }



    }finally {
      // key.close();

    }

    System.out.println("프로그램종료");
  }
  static int sum(int value) { // f(n) = n + f(n-1)
    if(value ==1)
      return 1;
    return value + sum(value -1);
  }

}



