package design_pattern.proxy.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
// 서버 개발자가 제공 해준 프록시 객체를 사용하여 계산을 수행한다
//
import java.util.Scanner;
import design_pattern.proxy.rmi.server.Calculator;


public class App {

  public static void main(String[] args) throws Exception {

    Scanner keyboard = new Scanner(System.in);


    Registry registry = LocateRegistry.getRegistry("study.bitcamp.co.kr"); 

    Calculator stub = (Calculator) registry.lookup("calc");

    while (true) {
      System.out.println("계산식> ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("quit"))
        break;

      String[] values = input.split(" ");
      try {
        int a = Integer.parseInt(values[0]);
        int b= Integer.parseInt(values[2]);
        String op  = values[1];
        switch (op) {
          case "+":
            System.out.println(stub.plus(a, b)); break;
          case "-":
            System.out.println(stub.minus(a, b)); break;
        }
     
      } catch (Exception e) {
        System.out.println("식 또는 계산 오류 " + e.getMessage());
      }
    }
    keyboard.close();

  }

}
