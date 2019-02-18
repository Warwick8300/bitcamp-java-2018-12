//
package ch24.b;

public class Test07 {

  public static void main(String[] args) {

    // 스레드 우선순위는 1~5이
    //
    Thread mainThread = Thread.currentThread();
    System.out.println(mainThread.getPriority());
  }



}


