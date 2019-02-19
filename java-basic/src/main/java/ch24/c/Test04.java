package ch24.c;

public class Test04 {

  // 1) THREAD 클래스를 상속 받아 정의하기
  static int j = 0;
  public static void main(String[] args) throws Exception {
   
    Thread t = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          System.out.printf("스레드 ===> %d  ", i); j++;
          if (j
              % 2 == 0)
            System.out.println();
        }
        try {
          sleep(5000);
        }catch(Exception e) {}
      }
    };
    t.start();
    t.join();
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main ~~~> %d  ", i); j++;
      if (j % 2 == 0)
        System.out.println();
    }
  }
}
