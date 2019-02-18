package ch24.c;

public class Test01 {
  
  //1) THREAD 클래스를 상속 받아 정의하기 
  static class MyThread extends Thread {
    @Override
    public void run() {
      for (int i = 0; i < 2000; i++) {
        System.out.printf("MyThread ===> %d\n", i);
      }
    }
  }
  
  
  // 2) Runnable 인터페이스 구현하기 
  static class MyWork implements Runnable{
    @Override
    public void run() {
      for (int i = 0; i < 2000; i++) {
        System.out.printf("MyWork >>> %d\n", i);
      }
    }
  }


  public static void main(String[] args) {

    // 스레드 실행
    // 1) Thread의 서브 클래스는 그냥 인스턴스를 만들어 start()를 호출한다.
    MyThread t1 = new MyThread();
    t1.start();
    
    // 2) Runnable 구현체는 인스턴스를마들어 Thread 객체의 생성자에 넘겨주고,
    //     스레드의 start()를 호출한다.
    MyWork w = new MyWork();
    Thread t2 = new Thread(w);
    t2.start();// 생성자에 넘겨준 Mywork의 run() 메서드를 호출한 후 즉시 리턴한다. 비동기로 동작한다.
    
    for (int i = 0; i < 2000; i++) {
      System.out.printf("main ~~~>%d\n", i);
    }


    //스레드에게 cpu 사요을 배분할 때순서서대로 하지 않는다.
    // os의 cpu 스케줄링 정책에 따라 스레드가 실행된다
    
  }

}
