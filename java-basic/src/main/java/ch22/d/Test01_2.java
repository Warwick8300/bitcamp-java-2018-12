package ch22.d;

import java.io.FileReader;

//문자 데이터 읽
public class Test01_2 {

  public static void main(String[] args) {
    
    try(FileReader in = new FileReader("data.txt")){
      

      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
      System.out.println(Integer.toHexString(in.read()));
   
    } catch (Exception e) {
      e.printStackTrace();
      }
    System.out.println("출력 완료");
  }

}
