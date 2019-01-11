package ch08;
import java.util.Scanner;
import ch08.util.Calculator2;


//패키지 용도 서로 관련된 일이나 유사한 일을 하는 클래스를 분류할 때 사용한다.

public class Test08 {
//
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("연산자? ");
    int a = keyboard.nextInt();
    String op = keyboard.next();
    int b = keyboard.nextInt();
    keyboard.close();

    int result = 0;
    switch(op) {
      case"+": result = ch08.util.Calculator2.plus(a, b); break;
      case"-": result = ch08.util.Calculator2.minus(a, b); break;
      case"*": result = Calculator2.multiple(a, b); break;   
      case"/": result = Calculator2.divide(a, b); break;
      
      default:
        System.out.println("지원하지 않는 연산자입니다.");
        return;
      
    }
    System.out.printf("%d %s %d = ? %d\n :", a, op, b, result);

  }


}
