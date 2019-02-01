package ch22.c;

import java.io.FileInputStream;

//바이트 데이터를 읽어 primitive date type의 값으로 바꾸기
public class Test04_1 {

  public static void main(String[] args) {
    try ( FileInputStream in = new FileInputStream("data.bin") ){
      int value = 0 ;
      //파일에서 4바이트를 읽어 int 변수에 저
      
      System.out.println(Integer.toHexString(value));


      System.out.println("데이터읽는중");
   
   
      value += in.read() << 24;
      value += in.read() << 16;
      value += in.read() << 8;
      value += in.read() ;
        
      System.out.println(Integer.toHexString(value));

    }catch (Exception e) {
      e.printStackTrace();
      
    }
    System.out.println("읽기완료");
  }




}
