package ch22.c;

import java.io.FileOutputStream;
import java.io.IOException;

//버퍼 사용전 
public class Test02_1 {

  public static void main(String[] args) {
    FileOutputStream out = null;
        try {
          out = new FileOutputStream("data.bin");
          System.out.println("데이터쓰중");
          long start = System.currentTimeMillis();

          for(int i = 0; i< 1000000; i++) {
            out.write(0x55);
          }

          long end = System.currentTimeMillis();
          System.out.println(end-start);
          

          System.out.println();
        }catch (Exception e) {
          e.printStackTrace();
        }finally {
          try {
            out.close();
          } catch (IOException e) {
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
          }
        }
    System.out.println("쓰기완료");
  }


}
