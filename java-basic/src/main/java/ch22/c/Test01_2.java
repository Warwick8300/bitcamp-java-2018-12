package ch22.c;

import java.io.FileInputStream;

//버퍼 사용전 
public class Test01_2 {

  public static void main(String[] args) {
    // 
    try {
      
      //

      FileInputStream in = new FileInputStream("jls11.pdf");
      System.out.println("데이터읽는중");
      long start = System.currentTimeMillis();
    byte[] buf = new byte[1000];
     int len;
      
      while((len = in.read(buf)) != -1 ) {
      }
    long end = System.currentTimeMillis();
     System.out.println(end-start);
     
           in.close();
      System.out.println();
    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");
  }


}
