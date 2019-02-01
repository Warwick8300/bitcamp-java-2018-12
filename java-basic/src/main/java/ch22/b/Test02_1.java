package ch22.b;

import java.io.FileOutputStream;

//바이너리 데이터 입출력 -   배열단위로 출
public class Test02_1 {

  public static void main(String[] args) {
    // 
    
    //배열값출력
    try {
      
      //
      FileOutputStream out = new FileOutputStream("data.bin력");
      byte[] bytes = {0x11,0x22,0x33,0x44,0x16,127};
      out.write(bytes); //
      System.out.println();
      
      out.close();
    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");
  }


}
