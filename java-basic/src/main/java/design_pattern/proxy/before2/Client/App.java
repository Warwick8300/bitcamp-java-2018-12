package design_pattern.proxy.before2.Client;

import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {

    Scanner keyboard = new Scanner(System.in);



    CalculatorClient calcStub = new CalculatorClient();

    while (true) {
      System.out.println("계산식> ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("quit"))
        break;
      
      String[] values = input.split(" ");
      try {
        System.out.println(
            calcStub.compute(Integer.parseInt(values[0]), Integer.parseInt(values[2]), values[1]));
      } catch (Exception e) {
        System.out.println("식 또는 계산 오류 " + e.getMessage());
      }
    }
    keyboard.close();

  }

}
