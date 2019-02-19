package ch24.c;

public class Test03 {

  // 1) THREAD 클래스를 상속 받아 정의하기

  public static void main(String[] args) throws Exception {

    Thread t = new Thread(){
      @Override
      public void run() {
        for(int i =0 ; i <1000; i++) {
          System.out.printf("스레드 ===> %d  ",i);
          if(i%2==0)
            System.out.println();
        }
      }
    };
    t.start();
    
    new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i =0 ; i <1000; i++) {
          System.out.printf("스레드2 ----> %d  "
              + "",i);
          if(i%2==0)
            System.out.println();
        }
      }
    }).start();
    
    
    
    //Thread.currentThread().sleep(5000);
    t.start(); //예외 발생
    
    for(int i =0 ; i <1000; i++) {
      System.out.printf("main ~~~> %d  ",i);
      if(i%2==0)
        System.out.println();
    }
  }
}
