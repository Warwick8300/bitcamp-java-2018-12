package ch08;

import java.util.Scanner;
import ch08.util.Calculator2;

// 클래스 문법의 또 다른 용도 -클래스 사용후 => 계산을 수행하는 메서드를 별도의 클래스로 분리한다.
public class Test07 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("연산자? ");
    int a = keyboard.nextInt();
    String op = keyboard.next();
    int b = keyboard.nextInt();
    keyboard.close();

    int result = 0;
    switch(op) {
      case"+": result = Calculator.plus(a, b); break;
      case"-": result = Calculator.minus(a, b); break;
      case"*": result = Calculator.multiple(a, b); break;   
      case"/": result = Calculator.divide(a, b); break;
      
      default:
        System.out.println("지원하지 않는 연산자입니다.");
        return;
      
    }
    System.out.printf("%d %s %d = ? %d\n :", a, op, b, result);

  }


}
