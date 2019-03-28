package design_pattern.chain_of_responsibility;

import java.util.Scanner;
import org.checkerframework.checker.units.qual.m;

public class Test01 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    PlusHandler plusHandler = new PlusHandler();
    TerminalHandler terminalHandler = new TerminalHandler();
    MinusHandler minusHandler = new MinusHandler();
    MultipleHandler MultipleHandler = new MultipleHandler();
    minusHandler.setNext(MultipleHandler);


    plusHandler.setNext(minusHandler);

    plusHandler.setNext(terminalHandler);
    while (true) {
      System.out.print("a? ");
      int a = keyScan.nextInt();

      System.out.print("b? ");
      int b = keyScan.nextInt();


      System.out.print("연산자? ");
      String op = keyScan.next();

      plusHandler.handle(a, b, op);

    }
  }
}
