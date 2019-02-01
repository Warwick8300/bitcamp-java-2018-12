package ch22.c;

import java.io.FileInputStream;

//버퍼를 적용하여 데이터를 읽기를 대신 처리를 도우미 클래스 사
public class Test01_3 {

  public static void main(String[] args) {
    // 
    try {
      FileInputStream in = new FileInputStream("jls11.pdf");
      BufferedInputStream in2 = new BufferedInputStream(in);
      System.out.println("데이터읽는중");
      long start = System.currentTimeMillis();
      int b;
      int count = 0;
   
      while((b = in2.read()) != -1 ) {
 count++;
      }
     long end = System.currentTimeMillis();
      System.out.println(end-start);
     
     System.out.println(count);
           in.close();
                 System.out.println();
    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");
  }


}
