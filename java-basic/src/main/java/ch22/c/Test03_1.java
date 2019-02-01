package ch22.c;

import java.io.FileOutputStream;
import java.io.IOException;

//primitive date type의 값을 출력하
public class Test03_1 {

  public static void main(String[] args) {
    try ( FileOutputStream out = new FileOutputStream("data.bin") ){
      int value = 0x22334455 ;
      
      
      System.out.println(Integer.toHexString(value));


      System.out.println("데이터쓰중");
   
        out.write(value>>24);
        out.write(value>>16);
        out.write(value>>8);
        out.write(value);
        
      System.out.println();
    }catch (Exception e) {
      e.printStackTrace();
      System.out.println("쓰기완료");
    }
  }




}
