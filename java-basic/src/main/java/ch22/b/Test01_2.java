package ch22.b;

import java.io.FileInputStream;

//바이너리 데이터 입출력 -  fileinputStream 클래스 사용법
public class Test01_2 {

  public static void main(String[] args) {
    // 
    try {
      FileInputStream in = new FileInputStream("data.bin");
      int b;
      while((b = in.read()) != -1 )
        System.out.print(Integer.toHexString(b)+" ");
      /*
      while(true) {
        b= in.read();
        if(b==-1) //
          break;
        System.out.print(Integer.toHexString(b)+" ");
      }*/
      in.close();
      System.out.println();
    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");
  }


}
