package ch22.c;

import java.io.FileOutputStream;
import java.io.IOException;

//버퍼 기능 데코레이터
public class Test02_3 {

  public static void main(String[] args) {

       
    
    try (    FileOutputStream out =new FileOutputStream("data.bin");
        BufferdOutputStream out2 = new BufferdOutputStream(out);) {
          System.out.println("데이터쓰중");
          long start = System.currentTimeMillis();
          for(int i = 0; i< 1000000; i++) {
           
              out2.write(0x55); 
           
            }
            out2.flush();
        
         
          long end = System.currentTimeMillis();
          System.out.println(end-start);
          
    
          System.out.println();
        }catch (Exception e) {
          e.printStackTrace();
        }
    System.out.println("쓰기완료");
  }


}
