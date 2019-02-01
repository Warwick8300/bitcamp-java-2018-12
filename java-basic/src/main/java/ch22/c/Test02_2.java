package ch22.c;

import java.io.FileOutputStream;
import java.io.IOException;

//버퍼 사용후
public class Test02_2 {

  public static void main(String[] args) {
    FileOutputStream out = null;
        try {
          out = new FileOutputStream("data.bin");
          System.out.println("데이터쓰중");
          long start = System.currentTimeMillis();
          byte[] buf = new byte[1024];
          int size = 0;
          for(int i = 0; i< 1000000; i++) {
            buf[size++] = 0x55;
            if(size >= 1024) {
              out.write(buf);
              size = 0;
           
            }
            
          }
          out.write(buf, 0, size);
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
