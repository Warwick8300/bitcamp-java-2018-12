package ch22.b;

import java.io.FileInputStream;

//바이너리 데이터 입출력 -   배열로 읽기
public class Test03_2 {

  public static void main(String[] args) {
    // 

    //배열값출력
    try {
      FileInputStream in = new FileInputStream("data.bin");
      byte[] buf = new byte[500];
     int count = in.read(buf,5,6);
     System.out.println(count);
     for (int i = 0; i< count;i++) {
       System.out.print(Integer.toHexString(buf[i])+ " ");
     }
      
      System.out.println();

      in.close();
    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");
  }


}
