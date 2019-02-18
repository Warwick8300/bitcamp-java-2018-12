package ch24.c;

import java.util.Scanner;

public class Test02 {

  // 1) THREAD 클래스를 상속 받아 정의하기
  static class MyThread extends Thread {
    @Override
    public void run() {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("입력하시오 ! : ");
      String input = keyboard.nextLine();
      System.out.println("입력한 문자열 => " + input);
      keyboard.close();
    }
  }



  public static void main(String[] args) {

    MyThread t = new MyThread();
    t.start();

    System.out.println("프로그램종료");


  }

}
